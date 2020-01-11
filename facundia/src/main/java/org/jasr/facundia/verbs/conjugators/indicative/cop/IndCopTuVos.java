package org.jasr.facundia.verbs.conjugators.indicative.cop;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndCopTuVos extends ConjugadorBase {


	public IndCopTuVos() {
		super(FormasVerbales.IND_COPRETERITO_TU_VOS, new IndCopUdEl());
	}
	public String[][] getReglas(){
		
	return new String[][] { { ".*", "(.*)", "$1s" } };
	}
}
