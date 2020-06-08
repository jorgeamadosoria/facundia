package org.jasr.facundia.verbs.conjugators.subjunctive.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjFutTuVos extends ConjugadorBase {



	public SubjFutTuVos(){ super(
		FormasVerbales.SUBJ_FUTURO_TU_VOS, new SubjFutYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ ".*", "(.*)", "$1s" }
	};


	

	}
}
