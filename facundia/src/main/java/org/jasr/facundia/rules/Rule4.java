package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public class Rule4 extends BaseRule {

    public Rule4() {
        rule = Pattern.compile(".*(d|j|l|r|n)");
        exceptions.put("hip�rbaton", "hip�rbatos");
        exceptions.put("�stracon", "�straca");
        exceptions.put("senior", "seniors");
        exceptions.put("spoiler", "spoilers");
        exceptions.put("troll", "trolls");
        exceptions.put("tour", "tours");
        exceptions.put("aquel", "aquellos");
        exceptions.put("lord", "lores");
        exceptions.put("�fter", "�fters");
        exceptions.put("veinti�n", "veintiunos");
        exceptions.put("w�stern", "w�sterns");
        exceptions.put("western", "westerns");
        exceptions.put("raid", "raids");
        exceptions.put("hacker", "hackers");
        exceptions.put("estand", "estands");

        exceptions.put("canon", "c�nones");
        exceptions.put("desorden", "des�rdenes");
        exceptions.put("dolmen", "d�lmenes");
        exceptions.put("eslogan", "esl�ganes");
        exceptions.put("esmoquin", "esm�quines");
        exceptions.put("fitoplancton", "fitopl�nctones");
        exceptions.put("germen", "g�rmenes");
        exceptions.put("gluten", "gl�tenes");
        exceptions.put("imagen", "im�genes");
        exceptions.put("joven", "j�venes");
        exceptions.put("margen", "m�rgenes");
        exceptions.put("mitin", "m�tines");
        exceptions.put("orden", "�rdenes");
        exceptions.put("origen", "or�genes");
        exceptions.put("virgen", "v�rgenes");
        exceptions.put("acromion", "acr�miones");
        exceptions.put("esp�cimen", "espec�menes");
        exceptions.put("r�gimen", "reg�menes");
        exceptions.put("�leon", "�leones");
        exceptions.put("as�ndeton", "as�ndetones");
        exceptions.put("beicon", "b�icones");
        exceptions.put("car�cter", "caracteres");
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
            if (singular.endsWith("�n"))
                return unaccented(singular.substring(0, singular.lastIndexOf("�n")) + "anes");
            if (singular.endsWith("�n"))
                return unaccented(singular.substring(0, singular.lastIndexOf("�n")) + "enes");
            if (singular.endsWith("�n"))
                return unaccented(singular.substring(0, singular.lastIndexOf("�n")) + "ines");
            if (singular.endsWith("�n"))
                return unaccented(singular.substring(0, singular.lastIndexOf("�n")) + "ones");
            if (singular.endsWith("�n"))
                return unaccented(singular.substring(0, singular.lastIndexOf("�n")) + "unes");

            if (singular.endsWith("n") && isAccented(singular)) {
                return unaccented(singular) + "es";
            }

            return singular + "es";

        }
        return null;
    }

}
