package org.jasr.facundia.verbs.conjugators.indicative.pres;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;
import org.jasr.facundia.verbs.conjugators.impersonal.Infinitivo;

public class IndPresYo extends ConjugadorBase {

	public IndPresYo() {
		super(FormasVerbales.IND_PRESENTE_YO, new Infinitivo());
	}
	public String[][] getReglas(){
		
	return new String[][] {

				{ "saber", "saber", "s�" }, 
				{ "saber", "saber", "s�" }, 
				{ "(mec|remec)er", "(me|reme)cer", "$1zo" }, 
				{ "ser", "ser", "soy" }, 
				{ "he(d|nd)er", "he(d|nd)er", "hie$1o" }, 
				{ "haber", "haber", "he" }, 
				{ "caber", "caber", "quepo" },
				{ "encornar", "encornar", "encorno" },
				{ "perder", "perder", "pierdo" },
				{ "cerner", "cerner", "cierno" },
				{ ".*", "joder", "jodo" },
				{ ".*", "oler", "huelo" },
				{ ".*", "(.*)cocer", "$1cuezo" }, 
				{ ".*", "(.*)o(d|v|lv|rd|l)er", "$1ue$2o" }, 
				{ ".*", "(.*)orcer", "$1uerzo" }, 
				{ ".*", "(.*)o(n|l)er", "$1o$2go" }, 
				{ ".*", "(.*)(pl|n|p)acer", "$1$2azco" }, 
				{ ".*", "(.*)acer", "$1ago" }, 
				{ ".*", "(.*)aer", "$1aigo" }, 
				{ ".*", "pretender", "pretendo" },
				{ ".*", "(.*)(ef|t|c)ender", "$1$2iendo" }, 
				{ ".*", "(.*)e(d|nt)er", "$1e$2o" }, 
				{ ".*", "(.*)(e|o|er)ger", "$1$2jo" }, 
				{ ".*", "(.*)(en|al)er", "$1$2go" }, 
				{ ".*", "(.*)ncer", "$1nzo" }, 
				{ ".*", "(.*)aer", "$1ayo" }, 
				{ ".*", "(.*)ercer", "$1erzo" }, 
				{ ".*", "(.*)escer", "$1esco" }, 
				{ ".*", "(.*)cer", "$1zco" }, 
				{ ".*", "(preca|atre)ver", "$1vo" },
				{ ".*", "(.*)ver", "$1veo" }, 
				{ ".*", "(.*)querer", "$1quiero" }, 
				{ ".*", "(.*)verter", "$1vierto" },
				{ ".*", "(.*)er", "$1o" }, 
				
				{ "rehenchir", "rehenchir", "reh�ncho" }, 
				{ "rehundir", "rehundir", "reh�ndo" }, 
				{ "rendir", "rendir", "rindo" }, 
				{ "ir", "ir", "voy" }, 
				{ "erguir", "erguir", "irgo" }, 
				{ "enserir", "enserir", "ensero" }, 
				{ "rehuir", "rehuir", "reh�yo" }, 
				{ "evertir", ".*", "everto" }, 
				{ ".*", "(.*)(as|en|al)ir", "$1$2go" }, 
				{ ".*", "(.*)concebir", "$1concibo" }, 
				{ ".*", "(.*)eguir", "$1igo" }, 
				{ ".*", "(.*)inguir", "$1ingo" }, 
				{ ".*", "(.*)g�ir", "$1guyo" }, 
				{ ".*", "(.*)servir", "$1sirvo" }, 
				{ ".*", "(.*)irir", "$1iero" }, 
				{ ".*", "(.*)quir", "$1co" },
				{ ".*", "(.*)o(rm|r)ir", "$1ue$2o" }, 
				{ ".*", "(.*)e(rn|nd|r|rd|rt|rv|nt)ir", "$1ie$2o" }, 
				{ ".*", "(.*)gredir", "$1gredo" }, 
				{ ".*", "(.*)e(�|nch|m|b|t|d|st|rt)ir", "$1i$2o" }, 
				{ ".*", "(.*)ecir", "$1igo" }, 
				{ ".*", "(.*)ucir", "$1uzco" }, 
				{ ".*", "(.*)cir", "$1zo" }, 
				{ ".*", "(.*)egir", "$1ijo" }, 
				{ ".*", "(.*)gir", "$1jo" }, 
				{ ".*", "(.*)guir", "$1go" }, 
				{ ".*", "(.*)uir", "$1uyo" }, 
				{ ".*", "(.*)ohibir", "$1oh�bo" }, 
				{ ".*", "(.*)ir", "$1o" },

				{ "desva�r", "desva�r", "desvayo" }, 
				{ ".*", "(.*)o�r", "$1oigo" }, 
				{ ".*", "(.*)e�r", "$1�o" }, 

				{ ".*", "estar", "estoy" }, 
				{ ".*", "adunar", "aduno" }, 
				{ ".*", "desosar", "deshueso" }, 
				{ ".*", "anegar", "anego" }, 
				{ ".*", "jugar", "juego" },  
				{ ".*", "incensar", "incienso" }, 
				{ ".*", "patiquebrar", "patiquebro" },
				{ ".*", "estatuar", "estatuo" },
				{ ".*", "oler", "huelo" },
				{ ".*", "desaforar", "desafuero" },
				{ ".*", "encorar", "encuero" },
				{ ".*", "legislar", "legislo" }
				,{ ".*", "rogar", "ruego" }
				,{ ".*", "entortar", "entuerto" },
				{ ".*", "deshijar", "deshijo" },
				{ ".*", "(.*)higar", "$1h�go" },
				{ ".*", "(.*)vigorar", "$1vigoro" },
				{ ".*", "(.*)baular", "$1ba�lo" },
				{ ".*", "(.*)au(n|p|ll)ar", "$1a�$2o" },
				{ ".*", "(.*)(n|l)ventar", "$1$2vento" },
				{ ".*", "atentar", "atento" },
				{ ".*", "(.*)(val|pat|int|det|ost|ust|cont|pos|pres|us)entar", "$1$2ento" },				
				{ ".*", "(.*)(s|t|as|at|desat|desas|v|sangr|al|rec|apac)entar", "$1$2iento" },
				{ ".*", "(.*)identar", "$1idento" },
				{ ".*", "(.*)dentar", "$1diento" },
				{ ".*", "(.*)sertar", "$1serto" },
				{ ".*", "(.*)ahuchar", "$1ah�cho" },
				{ ".*", "(.*)husar", "$1h�so" }, 
				{ ".*", "(al|of)ertar", "$1erto" }, 
				{ ".*", "orzar", "orzo" },
				{ ".*", "(.*)(alf|c)orzar", "$1$2orzo" },
				{ ".*", "(.*)(f|m)orzar", "$1$2uerzo" },
				{ ".*", "degollar", "deg�ello" },
				{ ".*", "(.*)(i|tro|gar)fiar", "$1$2fio" },
				{ ".*", "(vig|ch|enlej|m|p|jip|pip|esp|exp|car|contrar|comisar|inventar|aver|agr|enr|glor|arr|descarr|chirr|zurr|extas|ans|amnist|gu|esqu|desv)iar", "$1�o" },
				{ ".*", "(.*)(pal|ol|il|ul|industr|grav|gav|rad)iar", "$1$2io" },
				{ ".*", "rociar", "roc�o" }, 
				{ ".*", "(.*)(er|un|ar|la|sa|pa|gra|or|u|an|en|e|i|o)ciar", "$1$2cio" }, 
				{ ".*", "(.*)(vac|c|roc|cuchich|env|hast|ant|ad|av|cr|fr|f|tr|tor|var|l)iar", "$1$2�o" },				
				{ ".*", "(.*)traillar", "$1tra�llo" },
				{ ".*", "(.*)(a|e)hilar", "$1$2h�lo" },
				{ ".*", "(am|enm|desm|m)elar", "$1ielo" }, 
				{ ".*", "ahincar", "ah�nco" },
				{ ".*", "anhelar", "anhelo" }, 
				{ ".*", "(.*)helar", "$1hielo" }, 
				{ ".*", "(.*)(l|i|u)evar", "$1$2evo" },
				{ ".*", "(.*)(if|h)estar", "$1$2iesto" },
				{ ".*", "(.*)ahitar", "$1ah�to" },
				{ ".*", "(.*)hitar", "$1hito" },
				{ ".*", "(.*)jertar", "$1jerto" }, 
				{ ".*", "(.*)(ani|r)eblar", "$1$2eblo" }, 
				{ ".*", "(.*)(c|i|y)erbar", "$1$2erbo" }, 
				{ ".*", "(.*)(b|g|t|d)regar", "$1$2rego" }, 
				{ ".*", "(.*)(fr|n|pl|r|c|s)egar", "$1$2iego" }, 
				{ ".*", "(rep|p)ensar", "$1ienso" }, 
				{ ".*", "(.*)(m|c|er|rr)endar", "$1$2iendo" },
				{ ".*", "(.*)(i|l)erdar", "$1$2erdo" }, 
				{ ".*", "(.*)trenzar", "$1trenzo" }, 
				{ ".*", "(.*)pezar", "$1piezo" }, 
				{ ".*", "(.*)apretar", "$1aprieto" }, 
				{ ".*", "(.*)mueblar", "$1mueblo" },
				{ ".*", "(.*)quebrar", "$1quiebro" },
				{ ".*", "ferrar", "fierro" },
				{ ".*", "(.*)aizar", "$1a�zo" },
				{ ".*", "(.*)(p|r)eizar", "$1$2e�zo" },
				{ ".*", "(.*)cimentar", "$1cimento" },
				{ ".*", "(.*)emblar", "$1iemblo" },
				{ ".*", "mentar", "miento" },
				{ ".*", "(.*)(pi|ador|se|ar)mentar", "$1$2miento" },
				{ ".*", "(.*)(of|al)ertar", "$1berto" },
				{ ".*", "(.*)bertar", "$1berto" },
				{ ".*", "(.*)confesar", "$1confieso" },
				{ ".*", "(.*)travesar", "$1travieso" },
				{ ".*", "(.*)(di|fen|ma|cu|b)estrar", "$1$2estro" },
				{ ".*", "(.*)empernar", "$1emperno" },
				{ ".*", "(.*)(gob|f|p)ernar", "$1$2ierno" },
				{ ".*", "(.*)lendrar", "$1liendro" }
				,{ ".*", "(.*)pedrar", "$1piedro" } 
				,{ ".*", "(.*)edrar", "$1edro" }
				,{ ".*", "(.*)(m|em|h)embrar", "$1$2embro" }
				,{ ".*", "desbecerrar", "desbecerro" }
				,{ ".*", "(.*)(h|t|s|c)errar", "$1$2ierro" },
				{ ".*", "(.*)e(str|bl|rt|rb|rd|v|nz|mbr|mbl)ar", "$1ie$2o" }, 
				{ ".*", "(desd|d)ar", "$1oy" }, 
				{ ".*", "(.*)ce(s)ar", "$1ce$2o" }, 
				{ ".*", "(.*)e(l)ar", "$1e$2o" },
				{ ".*", "(.*)vergonzar", "$1verg�enzo" }, 
				{ ".*", "(.*)go(ld|r)ar", "$1g�e$2o" }, 
				{ ".*", "espa�olar", "espa�olo" }, 
				{ ".*", "(.*)(v|�)olar", "$1$2uelo" }, 
				{ ".*", "(.*)poblar", "$1pueblo" }, 
				{ ".*", "(desmaj|ded|az|am|trasc|rec|esc|cons|descons|s|subs|sobres|)olar", "$1uelo" }, 
				{ ".*", "(.*)(c|r|j)olar", "$1$2olo" }, 
				{ ".*", "espa�olar", "espa�olo" }, 
				{ ".*", "(.*)tortar", "$1tuerto" }, 
				{ ".*", "(.*)(ma|va|c|b|d|ch|j|g|f|re|pe|u|t|v|s|r|l|m|p)inar", "$1$2ino" }, 
				{ ".*", "(atr|tr|grandis|as|dis|cons|s)onar", "$1ueno" }, 
				{ ".*", "(.*)cornar", "$1cuerno" }, 
				{ ".*", "(.*)(c|f|l)locar", "$1$2lueco" }, 
				{ ".*", "(.*)trocar", "$1trueco" }, 
				{ ".*", "(.*)probar", "$1pruebo" }, 
				{ ".*", "(.*)volcar", "$1vuelco" },
				{ ".*", "emporcar", "empuerco" },
				{ ".*", "(.*)ahumar", "$1ah�mo" },
				{ ".*", "(.*)moblar", "$1mueblo" },
				{ ".*", "(as|r)oldar", "$1oldo" },
				{ ".*", "(.*)(m|t)oldar", "$1$2oldo" },
				{ ".*", "(.*)(y|e|c|m|p|l)odar", "$1$2odo" },
				{ ".*", "(.*)(b|g|s)ordar", "$1$2ordo" },
				{ ".*", "(.*)(d|r|)oblar", "$1$2oblo" },
				{ ".*", "(.*)(ren|enc)ovar", "$1$2uevo" },
				{ ".*", "(.*)contar", "$1cuento" },
				{ ".*", "(.*)sollar", "$1suello" },
				{ ".*", "(h|reh|desc)ollar", "$1uello" },
				{ ".*", "(.*)so�ar", "$1sue�o" },
				{ ".*", "(.*)(ap|t|n|c)ostar", "$1$2uesto" },
				{ ".*", "(.*)grosar", "$1grueso" },
				{ ".*", "premostrar", "premostro" },
				{ ".*", "(.*)mostrar", "$1muestro" },
				{ ".*", "(.*)escoltar", "$1escolto" },
				{ ".*", "(.*)o(ld|ntr|rz|d|rd|lt|bl|lg)ar", "$1ue$2o" }, 
				{ ".*", "(.*)guar", "$1guo" }, 
				{ ".*", "(.*)uar", "$1�o" },
				{ ".*", "(.*)izar", "$1izo" }, 
				{ ".*", "(.*)hincar", "$1hinco" }, 
				{ ".*", "(.*)hi(t|b|j)ar", "$1h�$2o" }, 
				{ ".*", "(.*)ai(n)ar", "$1a�$2o" }, 
				{ ".*", "airar", "a�ro" },
				{ ".*", "(.*)(m|p|l|a|v|t|g)irar", "$1$2iro" }, 
				{ ".*", "(.*)i(sl|r|z|n)ar", "$1�$2o" }, 
				{ ".*", "(.*)ar", "$1o" } 
				};

	}
}