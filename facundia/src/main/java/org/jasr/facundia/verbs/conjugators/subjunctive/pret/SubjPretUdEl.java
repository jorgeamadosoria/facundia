package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPretUdEl extends ConjugadorBase {



	public SubjPretUdEl(){ super(
		FormasVerbales.SUBJ_PRETERITO_UD_EL, new SubjPretYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{ ".*", "(.*)", "$1" }
	};

	}
}
