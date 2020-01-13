package org.jasr.facundia;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Facundia facundia = new Facundia();
		switch(args[0]) {
		case "help":
			System.out.println("Valid commands are: version, syllabicate <word>, cardinal <integer>, plural <word>, conjugate <verb on the infinitive form>");
			break;
		case "version":
			System.out.println(facundia.getVersion());
			break;
		case "syllabicate":
			System.out.println(facundia.syllabicate(args[1]));
			break;
		case "cardinal":
			System.out.println(facundia.cardinal(args[1]));
			break;
		case "plural":
			System.out.println(facundia.inflectWord(args[1]));
			break;
		case "conjugate":
			System.out.println(Arrays.toString(facundia.verbHeaders()));
			System.out.println(Arrays.toString(facundia.conjugate(args[1])));
			break;
		}
	}

}
