package org.jasr.facundia.verbs.conjugators.indicative.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndFutTuVos extends ConjugadorBase {



	public IndFutTuVos(){ super(
		FormasVerbales.IND_FUTURO_TU_VOS, new IndFutUdEl());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{".*","(.*)","$1s"}
	};

	

	}
}
