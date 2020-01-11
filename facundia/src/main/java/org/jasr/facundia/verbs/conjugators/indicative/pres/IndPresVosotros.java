package org.jasr.facundia.verbs.conjugators.indicative.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPresVosotros extends ConjugadorBase {

	public IndPresVosotros(){ super(
			FormasVerbales.IND_PRESENTE_VOSOTROS, new IndPresVos());
	}
	public String[][] getReglas(){
		
	return new String[][] {
			{ "ser", "sos", "sois" }, 
			{ "ver","veis","veis"},
			//monosyllabic verbs should have their stresses removed.
			{ "(l|h|gr|fr|fl)uir","(.*)","$1"},		
			{ "haber", "has", "hab�is" }, { ".*", "(.*)es", "$1eis" }, { ".*", "(.*)as", "$1ais" }, { ".*", "(.*)�s", "$1�is" }, { ".*", "(.*)�s", "$1�s" }, { ".*", "(.*)�s", "$1�is" } };



	}
}
