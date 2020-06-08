package org.jasr.facundia.verbs.conjugators.indicative.pos;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPosTuVos extends ConjugadorBase {



	public IndPosTuVos(){ super(
		FormasVerbales.IND_POSPRETERITO_TU_VOS, new IndPosYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ ".*", "(.*)", "$1s" } };

	}
}
