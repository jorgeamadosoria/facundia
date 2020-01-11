package org.jasr.facundia.verbs.conjugators.indicative.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPretUdsEllos extends ConjugadorBase {

	public IndPretUdsEllos(){ super(
			FormasVerbales.IND_PRETERITO_UDS_ELLOS, new IndPretUdEl());
	}
	public String[][] getReglas(){
		
	return new String[][] { 
		 { "(dar|freír)", "(fr|d)io", "$1ieron" },
		 { "(desdar|desleír)", "des(d|l)ió", "des$1ieron" },
		 { "(p|r)uar", "(p|r)uo", "$1uaron" },
		 { "(reír|ver)","(r|v)io", "$1ieron" },
		 { "(poder|haber)","(pud|hub)o", "$1ieron" },
		 { "desvaír", "desvayó", "desvayeron" },
		 { ".*(querer|poner|venir)","(.*)(quis|pus|vin)o","$1$2ieron" },
		 { ".*(placer|reír)","(.*)(plac|r)ió","$1$2ieron" },
		 { ".*","(.*)uvo","$1uvieron" },
		 { ".*aber","(.*)upo","$1upieron" },
		 { ".+hacer","(.*)ízo","$1icieron" },
		 { ".*oír", "(.*)oyó", "$1oyeron" },
		 { ".*(decir|traer|ucir)","(.*)(di|tra|u)jo","$1$2jeron" },
		 { ".*","fue","fueron" },
		 { ".*iar","(.*)io","$1iaron" },
		 { ".*acer","(.*)izo","$1icieron" },
		 { ".*ar","(.*)ó","$1aron" },
		 { ".*(i|e)r","(.*)ó","$1eron" }
	};


	}
}
