package org.jasr.facundia.verbs.conjugators.imperative;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.subjunctive.pres.SubjPresYo;

public class ImpUd extends ConjugadorBase {

	public ImpUd() {
		super(FormasVerbales.IMP_UD, new SubjPresYo());

	}
	public String[][] getReglas(){
		
	return new String[][] {
		{".*","(.*)","$1"}	};
	}

}
