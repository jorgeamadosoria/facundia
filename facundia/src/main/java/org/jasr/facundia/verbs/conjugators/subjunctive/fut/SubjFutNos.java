package org.jasr.facundia.verbs.conjugators.subjunctive.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjFutNos extends ConjugadorBase {



	public SubjFutNos(){ super(
		FormasVerbales.SUBJ_FUTURO_NOS, new SubjFutYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ ".*", "(.*)ere", "$1éremos" },
		{ ".*", "(.*)are", "$1áremos" }
	};

	

	}
}
