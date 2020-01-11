package org.jasr.facundia.verbs.conjugators.indicative.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.impersonal.Infinitivo;

public class IndPretYo extends ConjugadorBase {

	public IndPretYo(){ super(
			FormasVerbales.IND_PRETERITO_YO, new Infinitivo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		
	  	{"enserir", "enserir", "enser�"},
	  	{"ser", "ser", "fui"},
		{"(fl|fr|gr)uir", "(fl|fr|gr)uir", "$1ui"},
		{"ir", "ir", "fui"},
		{"ver", "ver", "vi"},
		{"(h|l)uir", "(h|l)uir", "$1ui"},
		{".*", "(.*)o�r", "$1o�"},
        {".*", "(.*)�r", "$1�"},
        {".*", "(.*)enir", "$1ine"},
        {".*", "(.*)lucir", "$1luc�"},
        {".*", "(.*)ucir", "$1uje"},
        {".*", "(.*)ecir", "$1ije"},
        {".*", "(.*)ir", "$1�"},

        {"haber", "haber", "hube"},
        {"(contra|re)hacer", "(contra|re)hacer", "$1h�ce"},
        {"(c|s)aber", "(c|s)aber", "$1upe"},
        {"(desc|dec|rec|c|r)aer", "(desc|dec|rec|c|r)aer", "$1a�"},
        {".*", "(.*)aer", "$1aje"},
        { ".*", "(.*)(y|pl|n|p)acer", "$1$2ac�" },
        {".*", "(.*)acer", "$1ice"},
        {".*", "(.*)oner", "$1use"},
        {".*", "joder", "jod�"},
        {".*", "(.*)oder", "$1ude"},
        {".*", "(.*)ener", "$1uve"},
        {".*", "(.*)erer", "$1ise"},
        {".*", "(.*)cer", "$1c�"},
        {".*", "(.*)er", "$1�"},

        {"estar", "estar", "estuve"},
        {"desdar", "desdar", "desd�"},
        {"dar", "dar", "di"},
        {"cuchichiar", "cuchichiar", "cuchichi�"},
        {"(p|r)uar", "(p|r)uar", "$1ue"},
        {".*chiar", "(.*)chiar", "$1chie"},
        {"c(ri|hi|i)ar", "c(ri|hi|i)ar", "c$1e"},
        {"(f|l|m|p|tr|gu)iar", "(f|l|m|p|tr|gu)iar", "$1ie"},
        {".*", "(.*)gar", "$1gu�"},
        {".*", "(.*)guar", "$1g��"},
        {".*", "(.*)zar", "$1c�"},
        {".*", "(.*)ear", "$1e�"},
        {".*", "(.*)car", "$1qu�"},
        {".*", "(.*)(m|p|r)andar", "$1$2and�"},
        {".*", "(.*)andar", "$1anduve"},
        {".*", "(.*)ar", "$1�"}
	};


	}
}
