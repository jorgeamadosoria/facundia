package org.jasr.facundia.verbs.conjugators.indicative.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.impersonal.Infinitivo;

public class IndPresNos extends ConjugadorBase {



	public IndPresNos(){ super(
		FormasVerbales.IND_PRESENTE_NOS, new Infinitivo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ "haber", "haber", "hemos" }, 
		{ "ser", "ser", "somos" }, { "ir", "ir", "vamos" }, { ".*", "(.*)ar", "$1amos" }, 
		{ ".*", "(.*)ir", "$1imos" }, { ".*", "(.*)er", "$1emos" }, { ".*", "(.*)ír", "$1ímos" }
	
	};

	}
}
