package org.jasr.facundia.verbs.conjugators.indicative.pos;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPosUdsEllos extends ConjugadorBase {



	public IndPosUdsEllos(){ super(
		FormasVerbales.IND_POSPRETERITO_UDS_ELLOS, new IndPosYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { { ".*", "(.*)", "$1n" } };


	

	}
}
