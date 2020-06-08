package org.jasr.facundia.verbs.conjugators.indicative.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.impersonal.Infinitivo;

public class IndFutYo extends ConjugadorBase {

	public IndFutYo(){ super(
			FormasVerbales.IND_FUTURO_YO, new Infinitivo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		
	 
	  {".*(ven|sal)ir", "(.*)(ven|sal)ir","$1$2dré"},
                        {".*(pod|quer)er", "(.*)(pod|quer)er","$1$2ré"},
                        {".*(ten|val|pon)er", "(.*)(ten|val|pon)er","$1$2dré"},
                        {".*aber", "(.*)aber","$1abré"},
                        {"(mal|ben)decir", "(mal|ben)decir","$1deciré"},
                        {".*ecir", "(.*)ecir","$1iré"},
                        { ".*", "(.*)(y|pl|n|p)acer", "$1$2aceré" },
                        {".*acer", "(.*)acer","$1aré"},
                        {".*ír", "(.*)ír","$1iré"},
                        {".*(a|e|i)r", "(.*)","$1é"},
	};


	}
}
