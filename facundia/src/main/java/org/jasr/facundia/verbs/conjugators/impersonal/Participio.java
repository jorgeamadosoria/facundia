package org.jasr.facundia.verbs.conjugators.impersonal;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class Participio extends ConjugadorBase {

	public Participio() {
		super(FormasVerbales.PARTICIPIO, new Infinitivo());

	}
	public String[][] getReglas(){
		
	return new String[][] { { "desvaír", "desvaír", "desvaído" }, 
			{ "inhestar", "inhestar", "inhiesto" }, 
			{ "romper", "romper", "roto" }, 
			{ "atrever", "atrever", "atrevido" }, 
			{ "desabrir", "desabrir", "desabrido" }, 
			{ "ser", "ser", "sido" },  
			{ ".*", "(ben|mal)decir", "$1dito" }, 
			{ ".*", "(.*)decir", "$1dicho" },
			{ ".*", "(.*)(f|h)acer", "$1$2echo" }, 
			{ ".*", "(.*)(a|cu)brir", "$1$2bierto" }, 
			{ ".*", "(.*)freír", "$1frito" }, 
			{ ".*", "(.*)morir", "$1muerto" }, 
			{ ".*", "(.*)imprimir", "$1impreso" }, 
			{ ".*", "(.*)cribir", "$1crito" }, 
			{ ".*", "(.*)(tra|e|o|a)er", "$1$2ído" }, 
			{ ".*", "(.*)(v|s)olver", "$1$2uelto" }, 
			{ ".*", "(.*)poner", "$1puesto" }, 
			{ ".*", "(.*)o(mp|v|rd|nd|d|s|rc|rb|l|g|c|m|rr)er", "$1o$2ido" }, 
			{ ".*", "(.*)caver", "$1cavido" }, 
			{ ".*", "(.*)v(e|ee)r", "$1visto" }, 
			{ ".*", "(.*)a(rd|mb|m|v|rr|ñ|b|c|l)er", "$1a$2ido" }, 
			{ ".*", "(.*)e(rn|v|rc|ll|rg|b|rd|l|g|nd|r|n|nc|t|rt|j|c|m|d|sc)er", "$1e$2ido" }, 
			{ ".*", "(.*)(a|e|i|í)r", "$1$2do" }, };
	}

}
