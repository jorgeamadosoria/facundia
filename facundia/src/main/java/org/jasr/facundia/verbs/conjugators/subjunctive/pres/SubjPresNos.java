package org.jasr.facundia.verbs.conjugators.subjunctive.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.indicative.pret.IndPretYo;

public class SubjPresNos extends ConjugadorBase {

	
	public SubjPresNos(){ super(
			FormasVerbales.SUBJ_PRESENTE_NOS, new IndPretYo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		
		{"caber", ".*", "quepamos"},
		{"ser", ".*", "seamos"},
		{"poder", ".*","podamos"},
		{"ver", ".*", "veamos"},
		{"estar", ".*", "estemos"},
		{"heder", ".*", "hedamos"},
		{ ".*", "(.*)concebí", "$1concibamos" },
		{ "(.*)o(v|lv)er", "(.*)o(v|lv)í", "$1o$2amos" },
		{"(preca|atre)ver", "(preca|atre)ví", "$1vamos"},
		{"joder", ".*", "jodamos"},

		{"evertir", ".*", "evertamos"},
		{"erguir", "erguí", "irgamos"},
		 {"haber", "hube", "hayamos"},
		 {"enserir", "enserí", "enseramos"},
		 {"delinquir", "delinquí", "delincamos"},
		 {"ir", "fui", "vayamos"},
		
		 {"desleír", "desleí", "desliamos"},
		 {"desvaír", ".*", "desvayamos"},

		 {"desdar", "desdí", "desdemos"},
		 {"dar", "di", "demos"},
		 {"(p|r)uar", "(p|r)ue", "$1uemos"},

		 {".*", "(.*)u(d|p)e","$1e$2amos"},
		 {".*", "(.*)aje","$1aigamos"},
		 {".*", "(.*)tuve","$1tengamos"},
		 {".*", "(.*)seguí","$1sigamos"},
		 {".*", "(.*)salí","$1salgamos"},
		 {".*", "(.*)ije","$1igamos"},
		 {".*", "(.*)(i|í)ce","$1agamos"},
		 {".*", "(.*)(c|gr)edí","$1$2edamos"},
		 {".*", "(.*)edí","$1idamos"},
		 {"(.*)verter", "(.*)vertí","$1vertamos"},
		 {".*", "(.*)vertí","$1virtamos"},
		 {".*", "(.*)metí","$1metamos"},
		 {".*", "(.*)viví","$1vivamos"},
		 {".*", "(rem|m)ecí","$1ezamos"},
		 {".*", "(.*)(v|c|f|t|p|pr|h|pl)endí","$1$2endamos"},
		 {".*", "(.*)e(rv|rt|t|nt|nd)í","$1i$2amos"},
		 {".*", "(.*)o(d|t|nt)í","$1i$2amos"},
		 {".*", "(.*)o(r|rm)í","$1u$2amos"},
		 {".*", "(.*)vine","$1vengamos"},
		 {".*", "(.*)puse","$1pongamos"},
		 {".*", "(.*)é","$1emos"},
		 {".*", "(.*)eñí","$1iñamos"},
		 {".*", "(.*)e(nch|st|r)í","$1i$2amos"},
		 {".*", "(.*)ví","$1veamos"},
		 {".*", "(.*)tremí","$1tremamos"},
		 {".*", "(.*)temí","$1temamos"},
		 {".*", "(.*)emí","$1imamos"},
		 {".*", "(.*)valí","$1valgamos"},
		 {".*", "(.*)creí","$1creamos"},
		 {".*", "(.*)reí","$1riamos"},
		 {".*", "(.*)uve","$1emos"},
		 {".*", "(.*)uje","$1uzcamos"},
		 {".*", "(.*)ise","$1eramos"},
		 {".*", "(.*)escí","$1escamos"},
		 {".*", "(.*)(a|e|u|cono)cí","$1$2zcamos"},
		 {".*", "(.*)protegí","$1protejamos"},
		 {".*", "(.*)egí","$1ijamos"},
		 {".*", "(.*)(o|a)í","$1$2igamos"},
		 {".*", "(.*)guí","$1gamos"},
		 {".*", "(.*)u(í|i)","$1uyamos"},
		 {".*", "(.*)cí","$1zamos"},
		 {".*", "(.*)gí","$1jamos"},
		 {".*", "(.*)güí","$1guyamos"},
		 {".*", "(.*)así","$1asgamos"},
		 {".*", "(.*)aí","$1ayamos"},
		 {".*", "(.*)ie","$1iemos"},
		 {".*", "(.*)í","$1amos"}
	};


	}
}
