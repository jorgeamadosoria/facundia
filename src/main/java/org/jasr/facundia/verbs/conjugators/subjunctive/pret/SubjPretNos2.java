package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPretNos2 extends ConjugadorBase {



	public SubjPretNos2(){ super(
		FormasVerbales.SUBJ_PRETERITO_NOS_2, new SubjPretNos());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{".*","(.*)ramos","$1semos"}
	};
	

	}
}
