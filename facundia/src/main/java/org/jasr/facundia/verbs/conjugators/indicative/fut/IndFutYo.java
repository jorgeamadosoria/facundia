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
		
	 
	  {".*(ven|sal)ir", "(.*)(ven|sal)ir","$1$2dr�"},
                        {".*(pod|quer)er", "(.*)(pod|quer)er","$1$2r�"},
                        {".*(ten|val|pon)er", "(.*)(ten|val|pon)er","$1$2dr�"},
                        {".*aber", "(.*)aber","$1abr�"},
                        {"(mal|ben)decir", "(mal|ben)decir","$1decir�"},
                        {".*ecir", "(.*)ecir","$1ir�"},
                        { ".*", "(.*)(y|pl|n|p)acer", "$1$2acer�" },
                        {".*acer", "(.*)acer","$1ar�"},
                        {".*�r", "(.*)�r","$1ir�"},
                        {".*(a|e|i)r", "(.*)","$1�"},
	};


	}
}
