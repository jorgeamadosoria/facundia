package org.jasr.facundia.verbs.conjugators.subjunctive.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjFutUdEl extends ConjugadorBase {



	public SubjFutUdEl(){ super(
		FormasVerbales.SUBJ_FUTURO_UD_EL, new SubjFutYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ ".*", "(.*)", "$1" }
	};


	

	}
}
