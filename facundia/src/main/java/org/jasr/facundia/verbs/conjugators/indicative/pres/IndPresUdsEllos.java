package org.jasr.facundia.verbs.conjugators.indicative.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPresUdsEllos extends ConjugadorBase {


	public IndPresUdsEllos() {
		super(FormasVerbales.IND_PRESENTE_UDS_ELLOS, new IndPresUdEl());
	}
	public String[][] getReglas(){
		
	return new String[][] {{ "ser", "es", "son" }, 
			{ ".*", "(.*)", "$1n" } };
	}
}
