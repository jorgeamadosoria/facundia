package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPretYo2 extends ConjugadorBase {

	public SubjPretYo2(){ super(
			FormasVerbales.SUBJ_PRETERITO_YO_2, new SubjPretYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{".*","(.*)ra","$1se"}
	};


	}
}
