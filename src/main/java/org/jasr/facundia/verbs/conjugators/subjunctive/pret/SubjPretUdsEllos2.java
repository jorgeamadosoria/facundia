package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPretUdsEllos2 extends ConjugadorBase {



	public SubjPretUdsEllos2(){ super(
		FormasVerbales.SUBJ_PRETERITO_UDS_ELLOS_2, new SubjPretUdsEllos());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{".*","(.*)ran","$1sen"}
	};
	}
}
