package org.jasr.facundia.verbs.conjugators.imperative;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class ImpVosotros extends ConjugadorBase {

	public ImpVosotros() {
		super(FormasVerbales.IMP_VOSOTROS, new ImpVos());

	}
	public String[][] getReglas(){
		
	return new String[][] {
	{"ir","and�","id"},
		{".*�r", "(.*)�","$1�d"},
        {".*dar", "(.*)d�","$1dad"},
        {".*r", "(.*)(�|a)","$1ad"},
        {".*r", "(.*)(�|i)","$1id"},
        {".*r", "(.*)(�|e)","$1ed"}
	};
	}

}
