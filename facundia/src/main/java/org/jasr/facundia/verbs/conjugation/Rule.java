package org.jasr.facundia.verbs.conjugation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.math.NumberUtils;
import org.jasr.facundia.inflector.Utils;
import org.jasr.facundia.verbs.VerbForm;

public class Rule implements Conjugation {

	protected VerbForm root;
	protected Map<Pattern, Boolean> matchPatterns;
	protected Pattern replacePattern;
	protected String[] groups;
	protected boolean monosyl;

	private Pattern patternize(String replacePattern) {
		replacePattern = (replacePattern.startsWith("mr:") ? (replacePattern.split(":")[1]) : replacePattern);
		String ptn = !replacePattern.startsWith("^") ? ("^" + replacePattern) : replacePattern;
		ptn = !ptn.endsWith("$") ? (ptn + "$") : ptn;
		return Pattern.compile(ptn);
	}

	public Rule(VerbForm root, String replacePattern, String[] patterns, String[] groups, boolean monosyl) {
		this.root = root;
		this.replacePattern = patternize(replacePattern);
		if (patterns == null)
			this.matchPatterns = new HashMap<>();
		else
			this.matchPatterns = Arrays.stream(patterns)
					.collect(Collectors.toMap(pattern -> patternize(pattern), pattern -> pattern.startsWith("mr:")));
		this.groups = groups;
	}

	@Override
	public boolean matches(String form) {
		String tform = form;
		if (this.root != null)
			tform = this.root.conjugate(form);

		final String tForm2 = tform;
		return this.replacePattern.matcher(tForm2).matches() && matchPatterns.entrySet().stream()
				.allMatch(pattern -> (pattern.getValue() ? Utils.INSTANCE.monosyllabic(form) : true)
						&& pattern.getKey().matcher(form).matches());
	}

	@Override
	public String conjugate(String form) {

		if (this.root != null)
			form = this.root.conjugate(form);

		if (monosyl)
			return Utils.INSTANCE.removeAccentIfMonoSyllabic(doConjugate(form));
		return doConjugate(form);
	}

	protected String doConjugate(String form) {

		return String.join("", Arrays.stream(groups).map(group -> grouping(form, group)).collect(Collectors.toList()));
	}

	private String grouping(String form, String group) {
		if (!NumberUtils.isNumber(group))
			return group;
		Matcher matcher = replacePattern.matcher(form);
		matcher.matches();
		return matcher.group(Integer.valueOf(group));
	}

	@Override
	public String toString() {
		return replacePattern.toString();
	}

}
