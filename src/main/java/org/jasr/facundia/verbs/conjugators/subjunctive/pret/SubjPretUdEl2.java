package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPretUdEl2 extends ConjugadorBase {



	public SubjPretUdEl2(){ super(
		FormasVerbales.SUBJ_PRETERITO_UD_EL_2, new SubjPretYo2());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{ ".*", "(.*)", "$1" }
	};

	}
}
