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
		{ ".*", "(.*)conceb�", "$1concibamos" },
		{ "(.*)o(v|lv)er", "(.*)o(v|lv)�", "$1o$2amos" },
		{"(preca|atre)ver", "(preca|atre)v�", "$1vamos"},
		{"joder", ".*", "jodamos"},

		{"evertir", ".*", "evertamos"},
		{"erguir", "ergu�", "irgamos"},
		 {"haber", "hube", "hayamos"},
		 {"enserir", "enser�", "enseramos"},
		 {"delinquir", "delinqu�", "delincamos"},
		 {"ir", "fui", "vayamos"},
		
		 {"desle�r", "desle�", "desliamos"},
		 {"desva�r", ".*", "desvayamos"},

		 {"desdar", "desd�", "desdemos"},
		 {"dar", "di", "demos"},
		 {"(p|r)uar", "(p|r)ue", "$1uemos"},

		 {".*", "(.*)u(d|p)e","$1e$2amos"},
		 {".*", "(.*)aje","$1aigamos"},
		 {".*", "(.*)tuve","$1tengamos"},
		 {".*", "(.*)segu�","$1sigamos"},
		 {".*", "(.*)sal�","$1salgamos"},
		 {".*", "(.*)ije","$1igamos"},
		 {".*", "(.*)(i|�)ce","$1agamos"},
		 {".*", "(.*)(c|gr)ed�","$1$2edamos"},
		 {".*", "(.*)ed�","$1idamos"},
		 {"(.*)verter", "(.*)vert�","$1vertamos"},
		 {".*", "(.*)vert�","$1virtamos"},
		 {".*", "(.*)met�","$1metamos"},
		 {".*", "(.*)viv�","$1vivamos"},
		 {".*", "(rem|m)ec�","$1ezamos"},
		 {".*", "(.*)(v|c|f|t|p|pr|h|pl)end�","$1$2endamos"},
		 {".*", "(.*)e(rv|rt|t|nt|nd)�","$1i$2amos"},
		 {".*", "(.*)o(d|t|nt)�","$1i$2amos"},
		 {".*", "(.*)o(r|rm)�","$1u$2amos"},
		 {".*", "(.*)vine","$1vengamos"},
		 {".*", "(.*)puse","$1pongamos"},
		 {".*", "(.*)�","$1emos"},
		 {".*", "(.*)e��","$1i�amos"},
		 {".*", "(.*)e(nch|st|r)�","$1i$2amos"},
		 {".*", "(.*)v�","$1veamos"},
		 {".*", "(.*)trem�","$1tremamos"},
		 {".*", "(.*)tem�","$1temamos"},
		 {".*", "(.*)em�","$1imamos"},
		 {".*", "(.*)val�","$1valgamos"},
		 {".*", "(.*)cre�","$1creamos"},
		 {".*", "(.*)re�","$1riamos"},
		 {".*", "(.*)uve","$1emos"},
		 {".*", "(.*)uje","$1uzcamos"},
		 {".*", "(.*)ise","$1eramos"},
		 {".*", "(.*)esc�","$1escamos"},
		 {".*", "(.*)(a|e|u|cono)c�","$1$2zcamos"},
		 {".*", "(.*)proteg�","$1protejamos"},
		 {".*", "(.*)eg�","$1ijamos"},
		 {".*", "(.*)(o|a)�","$1$2igamos"},
		 {".*", "(.*)gu�","$1gamos"},
		 {".*", "(.*)u(�|i)","$1uyamos"},
		 {".*", "(.*)c�","$1zamos"},
		 {".*", "(.*)g�","$1jamos"},
		 {".*", "(.*)g��","$1guyamos"},
		 {".*", "(.*)as�","$1asgamos"},
		 {".*", "(.*)a�","$1ayamos"},
		 {".*", "(.*)ie","$1iemos"},
		 {".*", "(.*)�","$1amos"}
	};


	}
}
