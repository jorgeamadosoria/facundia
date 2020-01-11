package org.jasr.facundia.verbs.conjugators.imperative;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.indicative.pres.IndPresUdEl;

public class ImpTu extends ConjugadorBase {

	public ImpTu() {
		super(FormasVerbales.IMP_TU, new IndPresUdEl());

	}
	public String[][] getReglas(){
		
	return new String[][] {
			{ "haber", "ha", "he" }, 
			{ "decir", "dice", "di" }, 
			{ "ser", "es", "s�" }, { "ir", "va", "ve" }, 
			{ "poner", "pone", "pon" }, 
			{ "tener", "tiene", "ten" }, { "venir", "viene", "ven" },
			{ ".*", "(.*)(satisf|y|pl|p|n)ace", "$1$2ace" }, 
			{ ".*", "(.*)ace", "$1az" }, 
			{ ".*", "(re|entre)dice", "$1d�" }, 
			{ ".*", "(.*)dice", "$1dice" }, 
			{ ".*", "(.*)sale", "$1sal" }, 
			{ ".*", "(.*)pone", "$1p�n" }, 
			{ ".*", "(.*)(v|t)iene", "$1$2�n" }, 
			{ ".*", "(.*)", "$1" }
	};
	}

}
