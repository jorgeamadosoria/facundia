package org.jasr.facundia.verbs.conjugators.subjunctive.fut;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.impersonal.Infinitivo;

public class SubjFutYo extends ConjugadorBase {



	public SubjFutYo(){ super(
		FormasVerbales.SUBJ_FUTURO_YO,new Infinitivo());
	}
	public String[][] getReglas(){
		
	return new String[][] {
		{ "estar", "estar", "estuviere" }, 
		{ "enserir", "enserir", "enseriere" }, 
		{ "evertir", ".*", "evertiere" }, 
		{ "erguir", "erguir", "irguiere" }, 
		{ "haber", "haber", "hubiere" }, 
		{ "astri�ir", "astri�ir", "astri�ere" }, 
		{ "caber", "caber", "cupiere" }, 
		{ "desdar", "desdar", "desdiere" }, 
		{ "desva�r", "desva�r", "desvayere" },
		{ "hendir", "hendir", "hendiere" },
		{ "dar", "dar", "diere" }, 
		{ "ser", "ser", "fuere" }, 
		{ "ir", "ir", "fuere" },
		{ "empeller", "empeller", "empellere" },
		{ "ta�er", "ta�er", "ta�ere" },
		{ "delinquir", "delinquir", "delinquiere" },
		{ ".*seguir", "(.*)seguir", "$1siguiere" },
		{ ".*", "(.*)(m|p|r)andar", "$1$2andare" }, 
		{ ".*", "(.*)andar", "$1anduviere" }, 
		{ ".*", "(.*)querer", "$1quisiere" }, 
		{ ".*", "(.*)decir", "$1dijere" },
		{ ".*", "(.*)traer", "$1trajere" }, 
		{ ".*", "(.*)tener", "$1tuviere" }, 
		{ ".*", "(.*)poner", "$1pusiere" }, 
		{ ".*", "(.*)poder", "$1pudiere" }, 
		{ ".*", "(.*)saber", "$1supiere" }, 
		{ ".*", "(.*)guir", "$1guiere" }, 
		{ ".*", "(.*)uir", "$1uyere" }, 
		{ ".*", "(.*)g�ir", "$1guyere" }, 
		{ ".*", "(.*)(o|e|a)er", "$1$2yere" }, 
		{ ".*", "(.*)e�ir", "$1i�ere" }, 
		{ ".*", "(.*)a�ir", "$1a�ere" }, 
		{ ".*", "(.*)(y|pl|n|p)acer", "$1$2aciere" },
		{ ".*", "(.*)acer", "$1iciere" }, 
		{ ".*", "(.*)gredir", "$1grediere" },
		{ ".*", "(.*)e(rt|b|st|m|nt|nch|n|gu|rv|d|t|g|nd|r)ir", "$1i$2iere" },
		{ ".*", "(.*)o(r|rm)ir", "$1u$2iere" }, 
		{ ".*", "(.*)u(�|ll)ir", "$1u$2ere" }, 
		{ ".*", "(.*)lucir", "$1luciere" }, 
		{ ".*", "(.*)ucir", "$1ujere" }, 
		{ ".*", "(.*)o�r", "$1oyere" }, 
		{ ".*", "(.*)e�r", "$1iere" }, 
		{ ".*", "(.*)(ir|er)", "$1iere" }, 
		{ ".*", "(.*)", "$1e" },
		
	};
	}
}
