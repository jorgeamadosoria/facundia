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
		
	  	{"enserir", "enserir", "enserí"},
	  	{"ser", "ser", "fui"},
		{"(fl|fr|gr)uir", "(fl|fr|gr)uir", "$1ui"},
		{"ir", "ir", "fui"},
		{"ver", "ver", "vi"},
		{"(h|l)uir", "(h|l)uir", "$1ui"},
		{".*", "(.*)oír", "$1oí"},
        {".*", "(.*)ír", "$1í"},
        {".*", "(.*)enir", "$1ine"},
        {".*", "(.*)lucir", "$1lucí"},
        {".*", "(.*)ucir", "$1uje"},
        {".*", "(.*)ecir", "$1ije"},
        {".*", "(.*)ir", "$1í"},

        {"haber", "haber", "hube"},
        {"(contra|re)hacer", "(contra|re)hacer", "$1híce"},
        {"(c|s)aber", "(c|s)aber", "$1upe"},
        {"(desc|dec|rec|c|r)aer", "(desc|dec|rec|c|r)aer", "$1aí"},
        {".*", "(.*)aer", "$1aje"},
        { ".*", "(.*)(y|pl|n|p)acer", "$1$2ací" },
        {".*", "(.*)acer", "$1ice"},
        {".*", "(.*)oner", "$1use"},
        {".*", "joder", "jodí"},
        {".*", "(.*)oder", "$1ude"},
        {".*", "(.*)ener", "$1uve"},
        {".*", "(.*)erer", "$1ise"},
        {".*", "(.*)cer", "$1cí"},
        {".*", "(.*)er", "$1í"},

        {"estar", "estar", "estuve"},
        {"desdar", "desdar", "desdí"},
        {"dar", "dar", "di"},
        {"cuchichiar", "cuchichiar", "cuchichié"},
        {"(p|r)uar", "(p|r)uar", "$1ue"},
        {".*chiar", "(.*)chiar", "$1chie"},
        {"c(ri|hi|i)ar", "c(ri|hi|i)ar", "c$1e"},
        {"(f|l|m|p|tr|gu)iar", "(f|l|m|p|tr|gu)iar", "$1ie"},
        {".*", "(.*)gar", "$1gué"},
        {".*", "(.*)guar", "$1güé"},
        {".*", "(.*)zar", "$1cé"},
        {".*", "(.*)ear", "$1eé"},
        {".*", "(.*)car", "$1qué"},
        {".*", "(.*)(m|p|r)andar", "$1$2andé"},
        {".*", "(.*)andar", "$1anduve"},
        {".*", "(.*)ar", "$1é"}
	};


	}
}
