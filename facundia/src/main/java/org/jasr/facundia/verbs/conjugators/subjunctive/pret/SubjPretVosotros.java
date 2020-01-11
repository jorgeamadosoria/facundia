package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPretVosotros extends ConjugadorBase {



	public SubjPretVosotros(){ super(
		FormasVerbales.SUBJ_PRETERITO_VOSOTROS, new SubjPretYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{".*","(.*)","$1is"}
	};

	}
}
