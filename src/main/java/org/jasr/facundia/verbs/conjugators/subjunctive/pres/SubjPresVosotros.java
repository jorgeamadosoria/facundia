package org.jasr.facundia.verbs.conjugators.subjunctive.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class SubjPresVosotros extends ConjugadorBase {



	public SubjPresVosotros(){ super(
		FormasVerbales.SUBJ_PRESENTE_VOSOTROS, new SubjPresNos());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{ ".*", "friamos", "friais" }, 
		{ ".*", "chiemos", "chieis" }, 
		{ ".*", "ciemos", "cieis" }, { ".*", "criemos", "crieis" }, 
		{ ".*", "demos", "deis" }, { ".*", "fiemos", "fieis" }, 
		{ ".*", "guiemos", "guieis" }, { ".*", "liemos", "lieis" }, 
		{ ".*", "miemos", "mieis" }, { ".*", "piemos", "pieis" }, 
		{ ".*", "puemos", "pueis" }, { ".*", "riamos", "riais" }, 
		{ ".*", "ruemos", "rueis" }, { ".*", "triemos", "trieis" }, 
		{ ".*", "(.*)emos", "$1éis" },
		{ ".*", "(.*)amos", "$1áis" }
	
	};
	}
}
