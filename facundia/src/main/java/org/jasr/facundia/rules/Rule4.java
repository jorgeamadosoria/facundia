package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public class Rule4 extends BaseRule {

    public Rule4() {
        rule = Pattern.compile(".*(d|j|l|r|n)");
        exceptions.put("hipérbaton", "hipérbatos");
        exceptions.put("óstracon", "óstraca");
        exceptions.put("senior", "seniors");
        exceptions.put("spoiler", "spoilers");
        exceptions.put("troll", "trolls");
        exceptions.put("tour", "tours");
        exceptions.put("aquel", "aquellos");
        exceptions.put("lord", "lores");
        exceptions.put("áfter", "áfters");
        exceptions.put("veintiún", "veintiunos");
        exceptions.put("wéstern", "wésterns");
        exceptions.put("western", "westerns");
        exceptions.put("raid", "raids");
        exceptions.put("hacker", "hackers");
        exceptions.put("estand", "estands");

        exceptions.put("canon", "cánones");
        exceptions.put("desorden", "desórdenes");
        exceptions.put("dolmen", "dólmenes");
        exceptions.put("eslogan", "eslóganes");
        exceptions.put("esmoquin", "esmóquines");
        exceptions.put("fitoplancton", "fitoplánctones");
        exceptions.put("germen", "gérmenes");
        exceptions.put("gluten", "glútenes");
        exceptions.put("imagen", "imágenes");
        exceptions.put("joven", "jóvenes");
        exceptions.put("margen", "márgenes");
        exceptions.put("mitin", "mítines");
        exceptions.put("orden", "órdenes");
        exceptions.put("origen", "orígenes");
        exceptions.put("virgen", "vírgenes");
        exceptions.put("acromion", "acrómiones");
        exceptions.put("espécimen", "especímenes");
        exceptions.put("régimen", "regímenes");
        exceptions.put("íleon", "íleones");
        exceptions.put("asíndeton", "asíndetones");
        exceptions.put("beicon", "béicones");
        exceptions.put("carácter", "caracteres");
    }

    public String apply(String singular) {
        if ("fitoplancton".equals(singular))
            System.out.println("dd");
        if (doesApply(singular)) {
            if (Exceptions.tatums.contains(singular))
                return singular;
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);
            if (singular.endsWith("men") && vowels.contains(singular.charAt(singular.length() - 4))) {
                return singular.substring(0, singular.length() - 4) + accented.get(singular.charAt(singular.length() - 4))
                        + "menes";
            }
            if (singular.endsWith("án"))
                return unaccented(singular.substring(0, singular.lastIndexOf("án")) + "anes");
            if (singular.endsWith("én"))
                return unaccented(singular.substring(0, singular.lastIndexOf("én")) + "enes");
            if (singular.endsWith("ín"))
                return unaccented(singular.substring(0, singular.lastIndexOf("ín")) + "ines");
            if (singular.endsWith("ón"))
                return unaccented(singular.substring(0, singular.lastIndexOf("ón")) + "ones");
            if (singular.endsWith("ún"))
                return unaccented(singular.substring(0, singular.lastIndexOf("ún")) + "unes");

            if (singular.endsWith("n") && isAccented(singular)) {
                return unaccented(singular) + "es";
            }

            return singular + "es";

        }
        return null;
    }

}
