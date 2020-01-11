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
		{ ".*", "(.*)ír", "$1iría" }, 
		{ ".*", "(mal|ben)decir", "$1deciría" }, 
		{ ".*", "(.*)ecir", "$1iría" }, 
		{ ".*", "(.*)(sal|ven)ir", "$1$2dría" },
		{ ".*", "(.*)(y|pl|n|p)acer", "$1$2acería" },
		{ ".*", "(.*)acer", "$1aría" }, 
		{ ".*", "(.*)(pon|ten|val)er", "$1$2dría" }, 
		{ ".*", "(.*)(co|ba)rrer", "$1$2rrería" },
		{ ".*", "(.*)(pod|ab|r)er", "$1$2ría" }, 
		{ ".*", "(.*)", "$1ía" } };


	

	}
}
