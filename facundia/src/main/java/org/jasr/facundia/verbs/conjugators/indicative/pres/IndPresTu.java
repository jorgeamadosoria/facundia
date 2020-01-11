package org.jasr.facundia.verbs.conjugators.indicative.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPresTu extends ConjugadorBase {



	public IndPresTu(){ super(
		FormasVerbales.IND_PRESENTE_TU, new IndPresUdEl());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ "ser", "es", "eres" }, 
		{".*", 	"(.*)ohibir", "$1ohíbes"},
		{ ".*", "(.*)", "$1s" } };


	

	}
}
