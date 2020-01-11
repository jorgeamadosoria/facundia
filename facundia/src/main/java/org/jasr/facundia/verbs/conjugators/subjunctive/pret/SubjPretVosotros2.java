package org.jasr.facundia.verbs.conjugators.subjunctive.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPretVosotros2 extends ConjugadorBase {



	public SubjPretVosotros2(){ super(
		FormasVerbales.SUBJ_PRETERITO_VOSOTROS_2,new SubjPretVosotros());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{".*","(.*)rais","$1seis"}
	};

	}
}
