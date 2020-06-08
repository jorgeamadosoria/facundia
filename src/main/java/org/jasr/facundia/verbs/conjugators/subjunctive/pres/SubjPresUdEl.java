package org.jasr.facundia.verbs.conjugators.subjunctive.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPresUdEl extends ConjugadorBase {


	public SubjPresUdEl() {
		super(FormasVerbales.SUBJ_PRESENTE_UD_EL, new SubjPresYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
			{ ".*", "(.*)", "$1" } };
	}
}
