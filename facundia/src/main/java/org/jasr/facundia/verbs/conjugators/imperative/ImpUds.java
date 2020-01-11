package org.jasr.facundia.verbs.conjugators.imperative;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class ImpUds extends ConjugadorBase {

	public ImpUds() {
		super(FormasVerbales.IMP_UDS, new ImpUd());

	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ "dar", "dé", "den" },
		{".*","(.*)","$1n"}};
	}

}
