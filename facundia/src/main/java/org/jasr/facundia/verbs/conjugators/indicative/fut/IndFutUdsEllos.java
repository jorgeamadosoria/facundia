package org.jasr.facundia.verbs.conjugators.indicative.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndFutUdsEllos extends ConjugadorBase {



	public IndFutUdsEllos(){ super(
		FormasVerbales.IND_FUTURO_UDS_ELLOS, new IndFutYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {{ ".*", "(.*)é", "$1án" } };
	}
}
