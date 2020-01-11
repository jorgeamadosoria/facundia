package org.jasr.facundia.verbs.conjugators.indicative.pos;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPosNos extends ConjugadorBase {



	public IndPosNos(){ super(
		FormasVerbales.IND_POSPRETERITO_NOS, new IndPosYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ ".*", "(.*)", "$1mos" }
	};

	}
}
