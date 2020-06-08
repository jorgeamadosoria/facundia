package org.jasr.facundia.verbs.conjugators.indicative.cop;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndCopUdEl extends ConjugadorBase {



	public IndCopUdEl() {
		super(FormasVerbales.IND_COPRETERITO_UD_EL, new IndCopYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { { ".*", "(.*)", "$1" }};
	}
}
