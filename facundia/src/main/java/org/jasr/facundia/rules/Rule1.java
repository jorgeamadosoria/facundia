package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public class Rule1 extends BaseRule {

    public Rule1() {
        rule = Pattern.compile(".*(a|e|i|o|u|�|�|�|�|�|b|c|f|g|h|k|m|�|p|q|t|v|w)");

        exceptions.put("acarpo", "acarpa");
        exceptions.put("oc", "oques");
        exceptions.put("no�meno", "noumena");
        exceptions.put("no", "noes");
        exceptions.put("cu", "c�es");
        exceptions.put("pa", "pans");
        exceptions.put("o", "oes");
        exceptions.put("s�", "s�es");
        exceptions.put("mamb�", "mambises");
        exceptions.put("s�ndwich", "s�ndwiches");
        exceptions.put("maquech", "maqueches");
        exceptions.put("imam", "imames");
        exceptions.put("�lbum", "�lbumes");
        exceptions.put("car�cter", "caracteres");
        exceptions.put("amor�", "amoraim");
        exceptions.put("stotinka", "stotinki");
        exceptions.put("curriculum", "curricula");
        exceptions.put("curr�culum", "curr�cula");
        exceptions.put("agnusd�i", "agnusd�ies");
        exceptions.put("frac", "fraques");
        exceptions.put("almicantarat", "almicantarates");
        exceptions.put("pailebot", "pailebotes");
        exceptions.put("paquebot", "paquebotes");
        exceptions.put("rob", "robes");

    }

    public String apply(String singular) {
        if (doesApply(singular)) {

            if (Exceptions.tatums.contains(singular))
                return singular;
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);

            if (singular.endsWith("st"))
                return singular;
            if (singular.endsWith("club"))
                return singular + "es";

            return singular + "s";
        }
        return null;
    }

}
