package org.jasr.facundia.verbs.conjugation;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.jasr.facundia.verbs.VerbForm;

public class Rules {

	public static Conjugation[] rules(String... conjugations) {
		return Arrays.stream(conjugations).map(conjugation -> r(conjugation)).collect(Collectors.toSet())
				.toArray(new Conjugation[0]);
	}

	public static Conjugation r(String conjugation) {

		if (conjugation.startsWith("mr:"))
			conjugation = conjugation.split(":")[1];
		
		String[] parts = conjugation.split("->");

		return Rules.r(null,parts[0], null,parts[1].split(","),false);
	}
	
	public static Conjugation r(VerbForm root,String conjugation) {

		String[] parts = conjugation.split("->");

		return Rules.r(root,parts[0], null,parts[1].split(","),false);
	}
	
	public static Conjugation mr(String conjugation) {

		String[] parts = conjugation.split("->");

		return Rules.r(null,parts[0], null,parts[1].split(","),true);
	}
	
	public static Conjugation mr(VerbForm root,String conjugation) {

		String[] parts = conjugation.split("->");

		return Rules.r(root,parts[0], null,parts[1].split(","),true);
	}
	
	public static Rule r(VerbForm root,String replacePattern, String[] patterns, String[] groups,boolean monosyl) {
		return new Rule(root, replacePattern, null, groups,monosyl);
	}

}
