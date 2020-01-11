package org.jasr.facundia.verbs.conjugators.imperative;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.impersonal.Infinitivo;

public class ImpVos extends ConjugadorBase {

	public ImpVos() {
		super(FormasVerbales.IMP_VOS, new Infinitivo());

	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ "haber", "haber", "habe" }, 
		{ "chiar", "chiar", "chia" }, 
		{ "ciar", "ciar", "cia" }, 
		{ "criar", "criar", "cria" }, 
		{ "desdar", "desdar", "desd�" }, 
		{ "dar", "dar", "da" }, 
		{ "fiar", "fiar", "fia" }, 
		{ "fluir", "fluir", "flui" }, 
		{ "fruir", "fruir", "frui" }, 
		{ "ir", "ir", "and�" }, 
		{ "gruir", "gruir", "grui" }, 
		{ "guiar", "guiar", "guia" }, 
		{ "huir", "huir", "hui" }, 
		{ "liar", "liar", "lia" }, 
		{ "luir", "luir", "lui" }, 
		{ "miar", "miar", "mia" },
		{ "piar", "piar", "pia" }, 
		{ "puar", "puar", "pua" }, 
		{ "ruar", "ruar", "rua" }, 
		{ "triar", "triar", "tria" }, 
		{ "ver", "ver", "ve" }, 
		{ ".*", "(.*)�r", "$1�" }, 
		{ ".*", "(.*)ir", "$1�" }, 
		{ ".*", "(.*)cer", "$1c�" }, 
		{ ".*", "(.*)er", "$1�" }, 
		{ ".*", "(.*)ar", "$1�" }
	};
	}

}
