package org.jasr.facundia.verbs.conjugators.indicative.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndFutUdEl extends ConjugadorBase {



	public IndFutUdEl(){ super(
		FormasVerbales.IND_FUTURO_UD_EL, new IndFutYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ ".*", "(.*)é", "$1á" } };

	}
}
