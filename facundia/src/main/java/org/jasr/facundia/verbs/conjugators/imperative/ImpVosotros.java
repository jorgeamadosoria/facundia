package org.jasr.facundia.verbs.conjugators.imperative;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class ImpVosotros extends ConjugadorBase {

	public ImpVosotros() {
		super(FormasVerbales.IMP_VOSOTROS, new ImpVos());

	}
	public String[][] getReglas(){
		
	return new String[][] {
	{"ir","andá","id"},
		{".*ír", "(.*)í","$1íd"},
        {".*dar", "(.*)dé","$1dad"},
        {".*r", "(.*)(á|a)","$1ad"},
        {".*r", "(.*)(í|i)","$1id"},
        {".*r", "(.*)(é|e)","$1ed"}
	};
	}

}
