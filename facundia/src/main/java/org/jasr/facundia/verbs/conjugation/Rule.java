package org.jasr.facundia.verbs.conjugation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.math.NumberUtils;
import org.jasr.facundia.inflector.Utils;
import org.jasr.facundia.verbs.VerbForm;

public class Rule implements Conjugation {

	protected VerbForm root;
	protected List<Rule> matchPatterns;
	protected Pattern replacePattern;
	protected String[] groups;
	protected boolean monosyl;

	private String patternize(String replacePattern) {
		String ptn = !replacePattern.startsWith("^") ? ("^" + replacePattern) : replacePattern;
		ptn = !replacePattern.endsWith("$") ? (replacePattern + "$") : replacePattern;
		return ptn;
	}

	public Rule(VerbForm root, String replacePattern, Rule[] patterns, String[] groups, boolean monosyl) {
		this.root = root;
		this.replacePattern = Pattern.compile(patternize(replacePattern));
		if (patterns != null)
			this.matchPatterns = Arrays.stream(patterns).collect(Collectors.toList());
		else
			this.matchPatterns = new ArrayList<>();
		this.groups = groups;
	}

	@Override
	public boolean matches(String form) {
		return this.replacePattern.matcher(form).matches()
				&& matchPatterns.stream().allMatch(pattern -> pattern.matches(form));
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

		return String.join("",
				Arrays.stream(groups)
						.map(group -> NumberUtils.isNumber(group)
								? replacePattern.matcher(form).group(Integer.valueOf(group)) : group)
						.collect(Collectors.toList()));
	}

}
