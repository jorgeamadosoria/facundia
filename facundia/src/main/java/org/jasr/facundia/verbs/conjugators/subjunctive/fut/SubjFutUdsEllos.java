package org.jasr.facundia.verbs.conjugators.subjunctive.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.subjunctive.pret.SubjPretYo;

public class SubjFutUdsEllos extends ConjugadorBase {



	public SubjFutUdsEllos(){ super(
		FormasVerbales.SUBJ_FUTURO_UDS_ELLOS, new SubjPretYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ ".*", "(.*)a", "$1en" }
	};

	}
}
