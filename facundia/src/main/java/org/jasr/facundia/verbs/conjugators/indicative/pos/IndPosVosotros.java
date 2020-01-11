package org.jasr.facundia.verbs.conjugators.indicative.pos;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPosVosotros extends ConjugadorBase {



	public IndPosVosotros(){ super(
		FormasVerbales.IND_POSPRETERITO_VOSOTROS, new IndPosYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {{".*","(.*)","$1is"}
	};
	

	}
}
