package org.jasr.facundia.verbs.conjugators.indicative.cop;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndCopVosotros extends ConjugadorBase {



	public IndCopVosotros(){ super(
		FormasVerbales.IND_COPRETERITO_VOSOTROS, new IndCopYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { { ".*", "(.*)", "$1is" } };

	}
}
