package org.jasr.facundia.verbs.conjugators.impersonal;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class Gerundio extends ConjugadorBase {

	public Gerundio() {
		super(FormasVerbales.GERUNDIO, new Infinitivo());

	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ "desvaír", "desvaír", "desvayendo" }, 
		{ "empeller", "empeller", "empellendo" }, 
		{ "he(d|nd)er", "he(d|nd)er", "he$1iendo" }, 
		{ "hendir", "hendir", "hendiendo" }, 
		{ "evertir", "evertir", "evertiendo" }, 
		{ "poder", "poder", "pudiendo" }, 
		{ "ir", "ir", "yendo" }, 
	//	{ "rendir", "rendir", "rindiendo" }, 
		{ "inserir", "inserir", "insiriendo" }, 
		{ ".*", "(.*)o(n|lv)er", "$1o$2iendo" },  
		{ ".*", "(.*)o(rm|d|r)ir", "$1u$2iendo" }, 
		{ ".*", "(.*)a(b|br|rt|ng)ir", "$1a$2iendo" }, 
		{ ".*", "(.*)añer", "$1añendo" }, 
		{ ".*", "(.*)eñir", "$1iñendo" }, 
		{ ".*", "(.*)(gred|ser)ir", "$1$2iendo" }, 
		{ ".*", "(.*)e(|nd|rgu|m|b|c|nch|d|nt|g|t|rv|rt|d|gu|r|st|n)ir", "$1i$2iendo" }, 
		{ ".*", "(.*)eer", "$1eyendo" },
			{ ".*", "(.*)oer", "$1oyendo" }, 
			{ ".*", "(.*)oír", "$1oyendo" }, 
			{ ".*", "(.*)eír", "$1iendo" }, 
			{ ".*", "(.*)aer", "$1ayendo" }, 
			{ ".*", "(.*)güir", "$1guyendo" }, 
			{ ".*", "(.*)u(lc|r|s|mpl|lp|tr|mp|g|lg|l|j|br|st|d|b|fr|mb|rt|t|m|pl|rc|c|rr|p|rd|n|nd|nc|ng|rg)ir", "$1u$2iendo" }, 
			{ ".*", "(.*)i(nqu|sp|r|nd|ng|c|n|ngu|d|v|b|st|m|v|t|g)ir", "$1i$2iendo" }, 
			{ ".*", "(.*)uir", "$1uyendo" }, 
			{ ".*", "(.*)a(rp|s|nd|rr|nt|rn|rc|r|t|d|l)ir", "$1a$2iendo" },
			{ ".*", "(.*)o(st)ir", "$1o$2iendo" }, 
			{ ".*", "(.*)e(gr|l|rn|r|rt|rg)ir", "$1e$2iendo" }, 
			{ ".*", "(.*)ar", "$1ando" }, 
			{ ".*", "(.*)er", "$1iendo" }, 
			{ ".*", "(.*)ir", "$1endo" }, 
		};
	}
	
}
