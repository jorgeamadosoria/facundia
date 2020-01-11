package org.jasr.facundia.verbs.conjugators.indicative.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPretUdEl extends ConjugadorBase {

	public IndPretUdEl() {
		super(FormasVerbales.IND_PRETERITO_UD_EL, new IndPretYo());
	}

	public String[][] getReglas() {
		return new String[][] { { "freír", "freí", "frio" }, { "desleír", "desleí", "deslió" }, { "reír", "reí", "rio" }, { ".*oír", "(.*)oí", "$1oyó" }, { "delinquir", "delinquí", "delinquió" }, { "erguir", "erguí", "irguió" }, { "(ser|ir)", "fui", "fue" }, { "dar", "di", "dio" }, { "chiar", "chie", "chio" }, { "ver", "vi", "vio" }, { ".*", "(.*)(c|v)aí", "$1$2ayó" }, { ".*(a|e)er", "(.*)(a|e)í", "$1$2yó" }, { ".*enserir", ".*", "enserió" }, { ".*eguir", "(.*)eguí", "$1iguió" },
				{ ".*emer", "(.*)mí", "$1mió" }, { ".*eger", "(.*)egí", "$1egió" }, { ".*guir", "(.*)guí", "$1guió" }, { ".*(ü|u)ir", "(.*)(ui|üí)", "$1uyó" }, { "evertir", ".*", "evertió" }, { ".*verter", "(.*)vertí", "$1vertió" }, { ".*", "(.*)ve(r|s)tí", "$1vi$2tió" }, { ".*", "(.*)(se|le|u|o)í", "$1$2yó" }, { ".*", "(.*)eñí", "$1iñó" }, { ".*", "(.*)concebí", "$1concibió" }, { ".*", "(.*)(ll|ñ)í", "$1$2ó" }, { ".*reír", "(.*)reí", "$1rió" }, { ".*", "(.*)o(rm|r)í", "$1u$2ió" },
				{ ".*", "(.*)metí", "$1metió" }, { ".*", "(.*)(v|c|f|t|p|h|pr|pl)endí", "$1$2endió" }, { ".*", "(.*)ebí", "$1ebió" }, { ".*", "(.*)e(rgu|st|g|r|nt|rt|nd|rv|m|t|nch|gu)í", "$1i$2ió" }, { ".*", "(.*)(m|p)edí", "$1$2idió" }, { ".*", "(.*)í", "$1ió" }, { ".*", "(.*)qué", "$1có" }, { ".*", "(.*)gué", "$1gó" }, { ".*", "(.*)güé", "$1guó" }, { ".*", "(.*)cé", "$1zó" }, { ".*", "(.*)ce", "$1zo" }, { ".*", "(.*)é", "$1ó" }, { ".*", "(.*)e", "$1o" } };
	}

}
