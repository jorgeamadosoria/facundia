package org.jasr.facundia.inflector.rules;

public class EndingN extends BaseRule {

    public EndingN() {
        super(".*(n)");

    }

    protected String doApply(String singular) {
        
        if (singular.endsWith("plancton")) {
            return singular.substring(0,singular.lastIndexOf("plancton")) + "plánctones";
        }
        
        if (singular.endsWith("men") && utils.vowelsNonStressed.contains(singular.charAt(singular.length() - 4))) {
            return singular.substring(0, singular.length() - 4) + utils.mapStressed.get(singular.charAt(singular.length() - 4))
                    + "menes";
        }

        if (utils.vowelsStressed.contains(singular.charAt(singular.length() - 2)))
            return singular.substring(0, singular.length() - 2)
                    + utils.mapNonStressed.get(singular.charAt(singular.length() - 2)) + "nes";

        if (singular.endsWith("n") && utils.isAccented(singular)) {
            return utils.unaccented(singular) + "es";
        }

        return singular + "es";
    }

    @Override
    public String getDescription() {
        return "Las palabras terminadas en 'n' forman plural adicionando -es al final. Las palabras agudas acentuadas pasan a ser llanas (sin acentuación). Las palabras llanas sin acentuación pasan a ser esdrújulas acentuadas, especialmente las terminadas en -men como germen o examen.";
    }

    
}
