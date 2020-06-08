package org.jasr.facundia.verbs.conjugators.indicative.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPretNos extends ConjugadorBase {



	public IndPretNos(){ super(
		FormasVerbales.IND_PRETERITO_NOS, new IndPretTuVos());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{ ".*", "(.*)ste", "$1mos" }
	};
	
	

	}
}
