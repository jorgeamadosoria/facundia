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
		{ "luir","luía","luis"},
		{ "huir","huía","huis"},
		{ "gruir","gruía","gruis"},
		{ "fruir","fruía","fruis"},
		{ "fluir","fluía","fluis"},

		{ "haber", "había", "has" }, 
		{ "dar", "daba", "das" }, 
		{ "ser", "era", "sos" }, 
		{ "ir", "iba", "vas" },
		{ "ver", "ver", "ves" },
		{ "(ch|c|cr|f|gu|tr|l|m|p)iar", "(ch|c|cr|f|gu|tr|l|m|p)iaba", "$1ias" }, 
		{ "(p|r)uar", "(p|r)uaba", "$1uas" }, 
		{ "ver", "veía", "ves" }, 
		{ "(.*)", "(.*)aba", "$1ás" }, 
		{ ".*(i|í)r", "(.*)ía", "$1ís" }, 
		{ ".*ir", "(.*)uía", "$1uis" }, 
		{ ".*ir", "(.*)ía", "$1és" }, 
		{ ".*ver", "(.*)veía", "$1vés" }, 
		{ ".*er", "(.*)ía", "$1és" } 
		};

	}
}
