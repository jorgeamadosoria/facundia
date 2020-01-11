package org.jasr.facundia.verbs.conjugators.impersonal;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class Infinitivo extends ConjugadorBase {

	public Infinitivo() {
		super(FormasVerbales.INFINITIVO,null);

	}
	public String[][] getReglas(){
		
	return new String[][] {
			{ ".*", "(.*)", "$1" }};
	}
}
