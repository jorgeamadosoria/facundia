package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public class Rule1 extends BaseRule {

    public Rule1() {
        rule = Pattern.compile(".*(a|e|i|o|u|á|í|ú|ó|é|b|c|f|g|h|k|m|ñ|p|q|t|v|w)");

        exceptions.put("acarpo", "acarpa");
        exceptions.put("oc", "oques");
        exceptions.put("noúmeno", "noumena");
        exceptions.put("no", "noes");
        exceptions.put("cu", "cúes");
        exceptions.put("pa", "pans");
        exceptions.put("o", "oes");
        exceptions.put("sí", "síes");
        exceptions.put("mambí", "mambises");
        exceptions.put("sándwich", "sándwiches");
        exceptions.put("maquech", "maqueches");
        exceptions.put("imam", "imames");
        exceptions.put("álbum", "álbumes");
        exceptions.put("carácter", "caracteres");
        exceptions.put("amorá", "amoraim");
        exceptions.put("stotinka", "stotinki");
        exceptions.put("curriculum", "curricula");
        exceptions.put("currículum", "currícula");
        exceptions.put("agnusdéi", "agnusdéies");
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
