package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPretTuVos extends ConjugadorBase {



	public SubjPretTuVos(){ super(
		FormasVerbales.SUBJ_PRETERITO_TU_VOS, new SubjPretYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{".*","(.*)","$1s"}
	};

	}
}
