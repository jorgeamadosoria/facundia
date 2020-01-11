package org.jasr.facundia.verbs.conjugators.indicative.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPretTuVos extends ConjugadorBase {



	public IndPretTuVos(){ super(
		FormasVerbales.IND_PRETERITO_TU_VOS, new IndPretYo());}
	
	public String[][] getReglas(){
	return new String[][] { 
		{ "chiar", "chie", "chiaste" }, { "ciar", "cie", "ciaste" }, { "criar", "crie", "criaste" }, 
		{ "fiar", "fie", "fiaste" }, { "guiar", "guie", "guiaste" }, { "liar", "lie", "liaste" }, 
		{ "miar", "mie", "miaste" }, { "piar", "pie", "piaste" }, { "puar", "pue", "puaste" }, 
		{ "ruar", "rue", "ruaste" }, { "triar", "trie", "triaste" }, 
		{ ".*r", "(.*)(a|e|o)�", "$1$2�ste" }, { ".*hacer", "(.*)h�ce", "$1hiciste" }, 
		{ ".*r", "(.*)�", "$1iste" },
		{ ".*r", "(.*)i", "$1iste" }, { ".*r", "(.*)c�", "$1zaste" }, 
		{ ".*r", "(.*)g��", "$1guaste" }, 
		{ ".*r", "(.*)gu�", "$1gaste" }, { ".*r", "(.*)qu�", "$1caste" }, 
		{ ".*r", "(.*)e", "$1iste" }, 
		{ ".*r", "(.*)�", "$1aste" } };
	
	
	}
}
