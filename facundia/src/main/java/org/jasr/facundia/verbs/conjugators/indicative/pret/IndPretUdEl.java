package org.jasr.facundia.verbs.conjugators.indicative.pret;

import org.jasr.facundia.verbs.FormasVerbales;
import org.jasr.facundia.verbs.conjugators.ConjugadorBase;

public class IndPretUdEl extends ConjugadorBase {

	public IndPretUdEl() {
		super(FormasVerbales.IND_PRETERITO_UD_EL, new IndPretYo());
	}

	public String[][] getReglas() {
		return new String[][] { { "fre�r", "fre�", "frio" }, { "desle�r", "desle�", "desli�" }, { "re�r", "re�", "rio" }, { ".*o�r", "(.*)o�", "$1oy�" }, { "delinquir", "delinqu�", "delinqui�" }, { "erguir", "ergu�", "irgui�" }, { "(ser|ir)", "fui", "fue" }, { "dar", "di", "dio" }, { "chiar", "chie", "chio" }, { "ver", "vi", "vio" }, { ".*", "(.*)(c|v)a�", "$1$2ay�" }, { ".*(a|e)er", "(.*)(a|e)�", "$1$2y�" }, { ".*enserir", ".*", "enseri�" }, { ".*eguir", "(.*)egu�", "$1igui�" },
				{ ".*emer", "(.*)m�", "$1mi�" }, { ".*eger", "(.*)eg�", "$1egi�" }, { ".*guir", "(.*)gu�", "$1gui�" }, { ".*(�|u)ir", "(.*)(ui|��)", "$1uy�" }, { "evertir", ".*", "everti�" }, { ".*verter", "(.*)vert�", "$1verti�" }, { ".*", "(.*)ve(r|s)t�", "$1vi$2ti�" }, { ".*", "(.*)(se|le|u|o)�", "$1$2y�" }, { ".*", "(.*)e��", "$1i��" }, { ".*", "(.*)conceb�", "$1concibi�" }, { ".*", "(.*)(ll|�)�", "$1$2�" }, { ".*re�r", "(.*)re�", "$1ri�" }, { ".*", "(.*)o(rm|r)�", "$1u$2i�" },
				{ ".*", "(.*)met�", "$1meti�" }, { ".*", "(.*)(v|c|f|t|p|h|pr|pl)end�", "$1$2endi�" }, { ".*", "(.*)eb�", "$1ebi�" }, { ".*", "(.*)e(rgu|st|g|r|nt|rt|nd|rv|m|t|nch|gu)�", "$1i$2i�" }, { ".*", "(.*)(m|p)ed�", "$1$2idi�" }, { ".*", "(.*)�", "$1i�" }, { ".*", "(.*)qu�", "$1c�" }, { ".*", "(.*)gu�", "$1g�" }, { ".*", "(.*)g��", "$1gu�" }, { ".*", "(.*)c�", "$1z�" }, { ".*", "(.*)ce", "$1zo" }, { ".*", "(.*)�", "$1�" }, { ".*", "(.*)e", "$1o" } };
	}

}
