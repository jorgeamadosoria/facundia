package org.jasr.facundia.verbs.conjugators.indicative.pos;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPosUdEl extends ConjugadorBase {



	public IndPosUdEl(){ super(
		FormasVerbales.IND_POSPRETERITO_UD_EL, new IndPosYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { { ".*", "(.*)", "$1" } };
	

	}
}
