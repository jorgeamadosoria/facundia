package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPretTuVos2 extends ConjugadorBase {



	public SubjPretTuVos2(){ super(
		FormasVerbales.SUBJ_PRETERITO_TU_VOS_2, new SubjPretTuVos());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{".*","(.*)ras","$1ses"}
	};

	}
}
