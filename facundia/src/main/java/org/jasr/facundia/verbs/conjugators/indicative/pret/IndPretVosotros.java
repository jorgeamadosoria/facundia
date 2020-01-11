package org.jasr.facundia.verbs.conjugators.indicative.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPretVosotros extends ConjugadorBase {



	public IndPretVosotros(){ super(
		FormasVerbales.IND_PRETERITO_VOSOTROS, new IndPretTuVos());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{ ".*", "(.*)", "$1is" }
	};
	

	}
}
