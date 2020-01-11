package org.jasr.facundia.verbs.conjugators.subjunctive.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.indicative.pres.IndPresUdEl;

public class SubjPresYo extends ConjugadorBase {

	public SubjPresYo() {
		super(FormasVerbales.SUBJ_PRESENTE_YO, new IndPresUdEl());

	}
	public String[][] getReglas(){
		
	return new String[][] { 
		{ "estar", ".*", "esté" }, 
		{ "caber", ".*", "quepa" }, 
		{ "haber", ".*", "haya" }, 
		{ "desdar", ".*", "desdé" }, 
		{ "dar", ".*", "dé" }, 
		{ "ir", ".*", "vaya" }, 
		{ "ser", ".*", "sea" }, 
		{ "saber", ".*", "sepa" }, 
		{ "ver", ".*", "vea" }, 
		{ "estatuar", ".*", "estatue" }, 
 
		{ ".*", "(.*)ca", "$1que" }, 
		{ ".*", "(.*)ga", "$1gue" }, 
		{ ".*", "(.*)gua", "$1güe" }, 
		{ ".*", "(.*)ua", "$1úe" }, 
		{ ".*", "(.*)za", "$1ce" }, 
		{ ".*", "(.*)a", "$1e" }, 
		{ ".*", "(.*)vé", "$1vea" }, 
		{ ".*", "(.*)ase", "$1asga" },
			{ ".*", "(.*)gue", "$1ga" }, 
			{ ".*", "(.*)(y|pl|n|p)ace", "$1$2azca" }, 
			{ ".*", "(.*)(a|i)ce", "$1$2ga" }, 
			{ ".*", "(.*)(sal|val|pon)e", "$1$2ga" }, 
			{ ".*", "(.*)rae", "$1raiga" }, 
			{ ".*", "(.*)(v)ae", "$1$2aya" }, 
			{ ".*", "(.*)ae", "$1aiga" }, 
			{ ".*", "(.*)(t|v)iene", "$1$2enga" }, 
			{ ".*", "(rem|m)ece", "$1eza" }, 
			{ ".*", "(.*)mece", "$1mezca" }, 
			{ ".*", "(.*)esce", "$1esca" }, 
			{ ".*", "(.*)ence", "$1enza" }, 
			{ ".*", "(.*)oye", "$1oiga" }, 
			{ ".*", "(.*)oce", "$1ozca" }, 
			{ "colicuecer", "colicuece", "colicuezca" }, 
			{ ".*", "(.*)cuece", "$1cueza" }, 
			{ ".*", "(.*)(u|a|e)ce", "$1$2zca" }, 
			{ ".*", "(.*)que", "$1ca" }, 
			{ ".*", "(.*)ge", "$1ja" }, 
			{ ".*", "(.*)ce", "$1za" }, 
			{ ".*", "(.*)e", "$1a" }
	};
	}

}
