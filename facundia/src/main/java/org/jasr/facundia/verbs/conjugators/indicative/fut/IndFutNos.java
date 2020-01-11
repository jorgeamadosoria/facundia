package org.jasr.facundia.verbs.conjugators.indicative.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndFutNos extends ConjugadorBase {



	public IndFutNos(){ super(
		FormasVerbales.IND_FUTURO_NOS, new IndFutUdEl());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ ".*", "(.*)á", "$1emos" } };

	

	}
}
