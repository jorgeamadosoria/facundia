package org.jasr.facundia.verbs.conjugators.indicative.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.impersonal.Infinitivo;

public class IndPresUdEl extends ConjugadorBase {

	public IndPresUdEl() {
		super(FormasVerbales.IND_PRESENTE_UD_EL, new Infinitivo());

	}
	public String[][] getReglas(){
		
	return new String[][] {
			{ "oler", "oler", "huele" }, 
			{ "ser", "ser", "es" }, 
			{ "ver", "ver", "ve" }, 
			{ "he(d|nd)er", "he(d|nd)er", "hie$1e" },
			{ "haber", "haber", "ha" }
			,{ ".*", "(.*)cocer", "$1cuece" },
			{ ".*", "(.*)e(d|nt)er", "$1e$2e"},
			{ ".*", "pretender", "pretende" },
			{ ".*", "(.*)(ef|t|c)ender", "$1$2iende" },
			{ ".*", "(.*)verter", "$1vierte" }, 
			{ ".*", "(.*)e(n|rn|d|rb|rd|r|rt)er", "$1ie$2e" }, 
			{ ".*", "(preca|atre)ver", "$1ve" }
			,{ ".*", "(.*)escer", "$1esce" }
			,{ ".*", "joder", "jode" }
			,{ ".*", "(.*)o(rc|d|v|lv|rd|l)er", "$1ue$2e" }
			,{ ".*", "(.*)ver", "$1v�" }
			,{ ".*", "(.*)er", "$1e" }
			
			,{ "rehenchir", "rehenchir", "reh�nche" }, 
			{ "rehundir", "rehundir", "reh�nde" },
			{ "delinquir", "delinquir", "delinque" },
			{ "enserir", "enserir", "ensere" }, 
			{"rendir", 		"rendir", "rinde"},
			{ "ir", "ir", "va" }, 
			{ "erguir", "erguir", "irgue" },
			{ "rehuir", "rehuir", "reh�ye" },
			{ "evertir", ".*", "everte" },
			{ ".*", "(.*)concebir", "$1concibe" },
			{ ".*", "(.*)eguir", "$1igue" },
			{ ".*", "(.*)inguir", "$1ingue" },
			{ ".*", "(.*)servir", "$1sirve" }, 
			{ ".*", "(.*)irir", "$1iere" }, 
			{ ".*", "(.*)o(rm|r)ir", "$1ue$2e" }, 
			{ ".*", "(.*)e(nt|n|rn|nd|r|rd|rt|rv)ir", "$1ie$2e" }, 
			{ ".*", "(.*)e(�|nch|m|b|t|st|rt)ir", "$1i$2e" }, 
			{ ".*", "(.*)gredir", "$1grede" },
			{ ".*", "(.*)e(g|c|d)ir", "$1i$2e" }, 
			{ ".*", "(.*)�ir", "$1uye" }, 
			{ ".*", "(.*)uir", "$1uye" }, 
			{ ".*", "(.*)ohibir", "$1oh�be"},
			{ ".*", "(.*)ir", "$1e" }, 

			{ "desva�r", "desva�r", "desvae" }, 
			{ ".*", "(.*)o�r", "$1oye" }, 
			{ ".*", "(.*)e�r", "$1�e" },

			{ "encornar", "encornar", "encorna" },
			{ "estar", "estar", "est�" }, 
			{ "dar", "dar", "da" }, 
			{ "desdar", "desdar", "desd�" }, 
			{ "adunar", "adunar", "aduna" },
			{ "desosar", "desosar", "deshuesa" }, 
			{ "anegar", "anegar", "anega" }, 
			{ "jugar", "jugar", "juega" }, 
			{ "incensar", "incensar", "inciensa" },
			{ "patiquebrar", "patiquebrar", "patiquebra" },
			{ "adestrar", "adestrar", "adiestra" },
			{ ".*", "ferrar", "fierra" },
			{ "estatuar", "estatuar", "estatua" },
			{ "desaforar", "desaforar", "desafuera" },
			{ "encorar", "encorar", "encuera" },
			{ "legislar", "legislar", "legisla" },
			{ "deshijar", "deshijar", "deshija" },
			{ ".*", "(.*)baular", "$1ba�la" },
			{ ".*", "(.*)ahuchar", "$1ah�cha" },
			{ ".*", "(.*)au(n|p|ll)ar", "$1a�$2a" },
			{ ".*", "(.*)lendrar", "$1liendra" },
			{ ".*", "(.*)empernar", "$1emperna" },
			{ ".*", "(.*)(gob|f|p)ernar", "$1$2ierna" },
			{ ".*", "atentar", "atenta" },
			{ ".*", "(s|t|as|at|desat|desas)entar", "$1ienta" },
			{ ".*", "(.*)(re|apa)centar", "$1$2cienta" },
			{ ".*", "(.*)(n|l)ventar", "$1$2venta" },
			{ ".*", "(.*)(val|cont|pos|pres|us)entar", "$1$2enta" },
			{ ".*", "(.*)(sangr|v|al)entar", "$1$2ienta" },
			{ ".*", "(.*)identar", "$1identa" },
			{ ".*", "(.*)emblar", "$1iembla" },
			{ ".*", "(.*)dentar", "$1dienta" },
			{ ".*", "(.*)sertar", "$1serta" },
			{ ".*", "(al|of)ertar", "$1erta" },
			{ ".*", "(.*)husar", "$1h�sa" },
			{ ".*", "(.*)(c|p)ertar", "$1$2ierta" },
			{ ".*", "orzar", "orza" },
			{ ".*", "(.*)(alf|c)orzar", "$1$2orza" },
			{ ".*", "(.*)(f|m)orzar", "$1$2uerza" },
			{ ".*", "(.*)traillar", "$1tra�lla" },
			{ ".*", "(.*)(a|e)hilar", "$1$2h�la" },
			{ ".*", "(.*)ahitar", "$1ah�ta" },
			{ ".*", "(.*)hitar", "$1hita" },
			{ ".*", "(.*)jertar", "$1jerta" },
			{ ".*", "anhelar", "anhela" }, 			
			{ ".*", "ahincar", "ah�nca" }, 			
			{ ".*", "(.*)helar", "$1hiela" }, 
			{ ".*", "(am|enm|desm|m)elar", "$1iela" }, 
			{ ".*", "(.*)(l|i)evar", "$1$2eva" }, 
			{ ".*", "(.*)ne(bl|v)ar", "$1nie$2a" },
			{ ".*", "(.*)(ma|va|c|b|d|ch|j|g|f|re|pe|u|t|v|s|r|l|m|p)inar", "$1$2ina" },
			{ ".*", "(.*)(industr|grav|gav)iar", "$1$2ia" },
			{ ".*", "(.*)(i|tro|gar)fiar", "$1$2fia" },
			{ ".*", "(.*)(pa|o|i|u)liar", "$1$2lia" },
			{ ".*", "rociar", "roc�a" },
			{ ".*", "(.*)(er|un|ar|la|sa|pa|gra|or|u|an|en|e|i|o)ciar", "$1$2cia" },
			{ ".*", "(vig|ch|enlej|m|p|jip|pip|esp|exp|car|contrar|comisar|inventar|aver|agr|enr|glor|arr|descarr|chirr|zurr|extas|ans|amnist|gu|esqu|desv)iar", "$1�a" },
			{ ".*", "(.*)(env|hast|ant|av|cr|fr|f|tr|tor|var|l)iar", "$1$2�a" },
			{ ".*", "(.*)(pal|ol|il|ul|industr|grav|gav|rad)iar", "$1$2ia" },
			{ ".*", "(.*)(env|hast|ant|av|cr|fr|f|tr|tor|ad|var|l)iar", "$1$2�a" },
			{ ".*", "(.*)fiar", "$1f�a" },
			{ ".*", "(vac|c|roc|cuchich)iar", "$1�a" },
			{ ".*", "(.*)(pe|re|a)izar", "$1$2�za" },
			{ ".*", "(.*)(m|l)enzar", "$1$2ienza" },
			{ ".*", "(.*)pezar", "$1pieza" }, 
			{ ".*", "(.*)(b|g|t|d)regar", "$1$2rega"},
			{ ".*", "(.*)(fr|n|pl|r|c|s)egar", "$1$2iega"},			
			{ ".*", "(rep|p)ensar", "$1iensa" }
			,{ ".*", "(.*)(er|rr|c|m)endar", "$1$2ienda" }
			,{ ".*", "(.*)quebrar", "$1quiebra" } 
			,{ ".*", "(.*)apretar", "$1aprieta" } 
			,{ ".*", "(.*)herbar", "$1hierba" } 
			,{ ".*", "(.*)merdar", "$1mierda" }
			,{ ".*", "degollar", "deg�ella" }
			,{ ".*", "rogar", "ruega" }
			,{ ".*", "(.*)higar", "$1h�ga" }
			,{ ".*", "entortar", "entuerta" }
			,{ ".*", "(.*)pedrar", "$1piedra" } 
			,{ ".*", "(.*)edrar", "$1edra" }
			,{ ".*", "desbecerrar", "desbecerra" }
			,{ ".*", "(.*)(h|t|s|c)errar", "$1$2ierra" }
			,{ ".*", "(.*)(em|h)embrar", "$1$2embra" }
			,{ ".*", "(.*)sembrar", "$1siembra" },
			{ ".*", "(.*)confesar", "$1confiesa" },
			{ ".*", "(.*)travesar", "$1traviesa" },
			{ ".*", "(.*)e(l)ar", "$1e$2a" }, 
			{ ".*", "(a|en)gorar", "$1g�era" }, 
			{ ".*", "(.*)vergonzar", "$1verg�enza" }, 
			{ ".*", "(.*)goldar", "$1g�elda" }, 
			{ ".*", "(.*)o(rt)ar", "$1o$2a" }, 
			{".*", 	"(.*)(i|t|l|�)onar", "$1$2ona"},
			{ ".*", "(.*)cimentar", "$1cimenta" },
			{ ".*", "mentar", "mienta" },
			{ ".*", "(atr|tr|grandis|as|dis|cons|s)onar", "$1uena" },
			{ ".*", "(.*)(pi|ador|se|ar|ci)mentar", "$1$2mienta" },
			{ ".*", "(.*)(di|fen|ma|cu|b)estrar", "$1$2estra" },
			{ ".*", "(.*)(if|h)estar", "$1$2iesta" },
			{ ".*", "espa�olar", "espa�ola" },
			{ ".*", "(.*)(v|�)olar", "$1$2uela" },
			{ ".*", "(.*)poblar", "$1puebla" },
			{ ".*", "(abu|desmaj|ded|az|am|trasc|rec|esc|cons|descons|s|subs|sobres)olar", "$1uela" }, 
			{ ".*", "(.*)(c|r|j)olar", "$1$2ola" }, 
			{ ".*", "espa�olar", "espa�ola" }, 
			{".*", 	"(.*)(c|f|l)locar", "$1$2lueca"},
			{".*", 	"(.*)trocar", "$1trueca"},
			{ ".*", "(.*)probar", "$1prueba" }, 
			{ ".*", "(.*)volcar", "$1vuelca" },
			{ ".*", "(.*)vigorar", "$1vigora" },
			{ ".*", "emporcar", "empuerca" },
			{ ".*", "(.*)ahumar", "$1ah�ma" },
			{ ".*", "(.*)moblar", "$1muebla" },
			{ ".*", "(as|r)oldar", "$1olda" },
			{ ".*", "(.*)cornar", "$1cuerna" },
			{ ".*", "(.*)(m|t)oldar", "$1$2olda" },
			{ ".*", "(.*)(y|e|c|m|p|l)odar", "$1$2oda" },
			{ ".*", "(.*)(b|g|s)ordar", "$1$2orda" },
			{ ".*", "(.*)(d|r|)oblar", "$1$2obla" },
			{ ".*", "(.*)(ren|enc)ovar", "$1$2ueva" },
			{ ".*", "(.*)contar", "$1cuenta" },
			{ ".*", "(.*)sollar", "$1suella" },
			{ ".*", "(h|reh|desc)ollar", "$1uella" },
			{ ".*", "(.*)so�ar", "$1sue�a" },
			{ ".*", "(.*)(ap|t|n|c)ostar", "$1$2uesta" },
			{ ".*", "(.*)grosar", "$1gruesa" },
			{ ".*", "premostrar", "premostra" },
			{ ".*", "(.*)mostrar", "$1muestra" },
			{ ".*", "(.*)escoltar", "$1escolta" }, 
			{ ".*", "(.*)o(ld|ntr|rz|d|rd|lt|bl|lg)ar", "$1ue$2a" }, 
			{".*", 	"(.*)guar", "$1gua"},
			{ ".*", "(.*)uar", "$1�a" }, 
			{ ".*", "(.*)hincar", "$1hinca" },
			{ ".*", "(.*)(fe|sa|oh)inar", "$1$2�na" }, 
			{ ".*", "(.*)hi(t|j)ar", "$1h�$2a" }, 
			{ ".*", "(.*)i(l|ll|n|z)ar", "$1i$2a" },
			{ ".*", "airar", "a�ra" }, 
			{ ".*", "(.*)(m|p|l|a|v|t|g)irar", "$1$2ira" }, 
			{ ".*", "(.*)i(sl|r)ar", "$1�$2a" }, 
			{ ".*", "(.*)ciar", "$1cia" }, 
			{ ".*", "(.*)ar", "$1a" } 
			};
	}

}
