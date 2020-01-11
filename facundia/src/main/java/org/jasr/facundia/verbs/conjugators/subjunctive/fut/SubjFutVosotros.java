package org.jasr.facundia.verbs.conjugators.subjunctive.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjFutVosotros extends ConjugadorBase {



	public SubjFutVosotros(){ super(
		FormasVerbales.SUBJ_FUTURO_VOSOTROS, new SubjFutNos());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ ".*", "(.*)�remos", "$1ereis" },
		{ ".*", "(.*)�remos", "$1areis" }
	};
	

	}
}
