package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPretNos extends ConjugadorBase {



	public SubjPretNos(){ super(
		FormasVerbales.SUBJ_PRETERITO_NOS, new SubjPretYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{".*","(.*)era","$1éramos"},
		{".*","(.*)ara","$1áramos"}
	};
	}
}
