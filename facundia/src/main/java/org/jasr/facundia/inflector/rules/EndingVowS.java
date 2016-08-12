package org.jasr.facundia.inflector.rules;

public class EndingVowS extends BaseRule {

    public EndingVowS() {
        super(".*(a|e|i|o|u|á|é|í|ó|ú)s");

    }

    public String doApply(String singular) {
        
        // otherwise keep them. Most probably these are tantums anyways
        return singular.substring(0, singular.length() - 2) + utils.mapNonStressed.get(singular.charAt(singular.length() - 2))
                + singular.charAt(singular.length() - 1) + "es";
    }

    @Override
    public String getDescription() {
        return "Las palabras terminadas en vocal seguida de 's' forman plural adicionando -es al final. Si la vocal que antecede a la 's' en la forma singular está acentuada, pierde este acento en el plural.";
    }

}
