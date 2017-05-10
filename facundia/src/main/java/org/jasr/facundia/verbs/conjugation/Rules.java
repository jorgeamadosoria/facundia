package org.jasr.facundia.verbs.conjugation;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.jasr.facundia.verbs.VerbForm;

public class Rules {

	public static Rule[] rules(String... conjugations) {
		return Arrays.stream(conjugations).map(conjugation -> r(conjugation)).collect(Collectors.toSet())
				.toArray(new Rule[0]);
	}

	public static Rule r(String conjugation) {

		if (conjugation.startsWith("mr:"))
			conjugation = conjugation.split(":")[1];
		
		String[] parts = conjugation.split("->");

		return Rules.r(null,parts[0], null,parts[1].split(","),false);
	}
	
	public static Rule r(VerbForm root,String conjugation) {

		String[] parts = conjugation.split("->");

		return Rules.r(root,parts[0], null,parts[1].split(","),false);
	}
	
	public static Rule mr(String conjugation) {

		String[] parts = conjugation.split("->");

		return Rules.r(null,parts[0], null,parts[1].split(","),true);
	}
	
	public static Rule mr(VerbForm root,String conjugation) {

		String[] parts = conjugation.split("->");

		return Rules.r(root,parts[0], null,parts[1].split(","),true);
	}
	
	public static Rule r(VerbForm root,String replacePattern, Rule[] patterns, String[] groups,boolean monosyl) {
		return new Rule(root, replacePattern, patterns, groups,monosyl);
	}
	
	public static Rule r(VerbForm root,String replacePattern, Rule[] patterns, String[] groups) {
		return new Rule(root, replacePattern, patterns, groups,false);
	}

	public static Rule r(String replacePattern, Rule[] patterns, String[] groups) {
		return new Rule(null, replacePattern, patterns, groups,false);
	}
	
	public static Rule r(String replacePattern, Rule[] patterns, String[] groups,boolean monosyl) {
		return new Rule(null, replacePattern, patterns, groups,monosyl);
	}
}
