package org.jasr.facundia.verbs.conjugators.subjunctive.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPresTuVos extends ConjugadorBase {



	public SubjPresTuVos(){ super(
		FormasVerbales.SUBJ_PRESENTE_TU_VOS, new SubjPresYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ "dar", "dé", "des" },
		{".*","(.*)","$1s"}
	};

	}
}
