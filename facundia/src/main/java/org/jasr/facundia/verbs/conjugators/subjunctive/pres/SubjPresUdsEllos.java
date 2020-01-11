package org.jasr.facundia.verbs.conjugators.subjunctive.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPresUdsEllos extends ConjugadorBase {

	public SubjPresUdsEllos() {
		super(FormasVerbales.SUBJ_PRESENTE_UDS_ELLOS, new SubjPresUdEl());

	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{ "dar", "dé", "den"},{
		".*", "(.*)", "$1n"}
	};
	}

}
