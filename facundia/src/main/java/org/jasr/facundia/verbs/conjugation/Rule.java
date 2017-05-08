package org.jasr.facundia.verbs.conjugation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.math.NumberUtils;
import org.jasr.facundia.verbs.VerbForm;

public class Rule implements Conjugation {

	protected VerbForm root;
	protected List<Pattern> matchPatterns;
	protected Pattern replacePattern;
	protected String[] groups;

	private String patternize(String replacePattern) {
		String ptn = !replacePattern.startsWith("^") ? ("^" + replacePattern) : replacePattern;
		ptn = !replacePattern.endsWith("$") ? (replacePattern + "$") : replacePattern;
		return ptn;
	}

	public Rule(VerbForm root,String replacePattern, String[] groups) {
		this(root,replacePattern, null, groups);
	}
	
	public Rule(String replacePattern, String[] groups) {
		this(null,replacePattern, null, groups);
	}

	public Rule(VerbForm root,String replacePattern, String[] patterns, String[] groups) {
		this.root = root;
		this.replacePattern = Pattern.compile(patternize(replacePattern));
		if (patterns == null)
			this.matchPatterns = new ArrayList<>();
		this.matchPatterns = Arrays.stream(patterns).map(pattern -> Pattern.compile(patternize(pattern)))
				.collect(Collectors.toList());
		this.matchPatterns.add(this.replacePattern);
		this.groups = groups;
	}

	@Override
	public boolean matches(String form) {
		return matchPatterns.stream().allMatch(pattern -> pattern.matcher(form).matches());
	}

	@Override
	public String conjugate(String form) {
		Matcher matcher = replacePattern.matcher(form);
		return String.join("",
				Arrays.stream(groups)
						.map(group -> NumberUtils.isNumber(group) ? matcher.group(Integer.valueOf(group)) : group)
						.collect(Collectors.toList()));
	}

}
