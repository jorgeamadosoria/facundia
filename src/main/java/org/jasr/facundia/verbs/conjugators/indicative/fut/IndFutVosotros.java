package org.jasr.facundia.verbs.conjugators.indicative.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndFutVosotros extends ConjugadorBase {



	public IndFutVosotros(){ super(
		FormasVerbales.IND_FUTURO_VOSOTROS, new IndFutYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{".*","(.*)","$1is"}
	};

	}
}
