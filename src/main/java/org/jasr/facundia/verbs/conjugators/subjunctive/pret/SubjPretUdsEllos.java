package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPretUdsEllos extends ConjugadorBase {



	public SubjPretUdsEllos(){ super(
		FormasVerbales.SUBJ_PRETERITO_UDS_ELLOS, new SubjPretYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{".*","(.*)","$1n"}
	};
	}
}
