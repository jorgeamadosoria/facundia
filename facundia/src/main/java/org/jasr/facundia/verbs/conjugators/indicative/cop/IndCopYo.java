package org.jasr.facundia.verbs.conjugators.indicative.cop;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.impersonal.Infinitivo;

public class IndCopYo extends ConjugadorBase {


	public IndCopYo() {
		super(FormasVerbales.IND_COPRETERITO_YO, new Infinitivo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
			{ "ser", "ser", "era" } 
			,{ "ir", "ir", "iba" } 
			,{ ".*", "(.*)o(v|lv)er", "$1o$2�a" }
			,{ "(preca|atre)ver", "(preca|atre)ver", "$1v�a" }
			,{ ".*", "(.*)ar", "$1aba" } 
			,{ ".*", "(.*)ir", "$1�a" } 
			,{ ".*", "(.*)�r", "$1�a" } 
			,{ ".*", "(.*)ver", "$1ve�a" } 
			,{ ".*", "(.*)er", "$1�a" } 
			};
	}

}
