package org.jasr.facundia.verbs.conjugators.indicative.pos;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.impersonal.Infinitivo;

public class IndPosYo extends ConjugadorBase {



	public IndPosYo(){ super(
		FormasVerbales.IND_POSPRETERITO_YO, new Infinitivo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ ".*", "(.*)�r", "$1ir�a" }, 
		{ ".*", "(mal|ben)decir", "$1decir�a" }, 
		{ ".*", "(.*)ecir", "$1ir�a" }, 
		{ ".*", "(.*)(sal|ven)ir", "$1$2dr�a" },
		{ ".*", "(.*)(y|pl|n|p)acer", "$1$2acer�a" },
		{ ".*", "(.*)acer", "$1ar�a" }, 
		{ ".*", "(.*)(pon|ten|val)er", "$1$2dr�a" }, 
		{ ".*", "(.*)(co|ba)rrer", "$1$2rrer�a" },
		{ ".*", "(.*)(pod|ab|r)er", "$1$2r�a" }, 
		{ ".*", "(.*)", "$1�a" } };


	

	}
}
