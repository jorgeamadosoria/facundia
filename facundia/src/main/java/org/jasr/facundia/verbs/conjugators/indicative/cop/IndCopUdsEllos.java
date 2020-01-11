package org.jasr.facundia.verbs.conjugators.indicative.cop;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndCopUdsEllos extends ConjugadorBase {



	public IndCopUdsEllos(){ super(
		FormasVerbales.IND_COPRETERITO_UDS_ELLOS,
		new IndCopYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { { ".*", "(.*)", "$1n" } };
	}
}
