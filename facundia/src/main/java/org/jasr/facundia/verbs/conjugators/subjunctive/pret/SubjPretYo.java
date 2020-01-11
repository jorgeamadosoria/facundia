package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.subjunctive.fut.SubjFutYo;

public class SubjPretYo extends ConjugadorBase {



	public SubjPretYo(){ super(
		FormasVerbales.SUBJ_PRETERITO_YO,new SubjFutYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{".*","(.*)e","$1a"}
	};

	}
}
