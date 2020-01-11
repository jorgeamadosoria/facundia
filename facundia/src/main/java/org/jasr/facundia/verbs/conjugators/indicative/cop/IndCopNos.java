package org.jasr.facundia.verbs.conjugators.indicative.cop;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndCopNos extends ConjugadorBase {


	public IndCopNos() {
		super(FormasVerbales.IND_COPRETERITO_NOS, new IndCopYo());
	}
	public String[][] getReglas(){
		
	return new String[][] { { "ser", "era", "�ramos" }, { "ir", "iba", "�bamos" }, { ".*", "(.*)aba", "$1�bamos" }, { ".*", "(.*)�a", "$1�amos" } };
	}
}
