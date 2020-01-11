package org.jasr.facundia.verbs.conjugators.indicative.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.indicative.cop.IndCopYo;

public class IndPresVos extends ConjugadorBase {



	public IndPresVos(){ super(
		FormasVerbales.IND_PRESENTE_VOS, new IndCopYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ "luir","lu�a","luis"},
		{ "huir","hu�a","huis"},
		{ "gruir","gru�a","gruis"},
		{ "fruir","fru�a","fruis"},
		{ "fluir","flu�a","fluis"},

		{ "haber", "hab�a", "has" }, 
		{ "dar", "daba", "das" }, 
		{ "ser", "era", "sos" }, 
		{ "ir", "iba", "vas" },
		{ "ver", "ver", "ves" },
		{ "(ch|c|cr|f|gu|tr|l|m|p)iar", "(ch|c|cr|f|gu|tr|l|m|p)iaba", "$1ias" }, 
		{ "(p|r)uar", "(p|r)uaba", "$1uas" }, 
		{ "ver", "ve�a", "ves" }, 
		{ "(.*)", "(.*)aba", "$1�s" }, 
		{ ".*(i|�)r", "(.*)�a", "$1�s" }, 
		{ ".*ir", "(.*)u�a", "$1uis" }, 
		{ ".*ir", "(.*)�a", "$1�s" }, 
		{ ".*ver", "(.*)ve�a", "$1v�s" }, 
		{ ".*er", "(.*)�a", "$1�s" } 
		};

	}
}
