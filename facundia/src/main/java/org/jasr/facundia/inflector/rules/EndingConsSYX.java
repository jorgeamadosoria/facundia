package org.jasr.facundia.inflector.rules;

public class EndingConsSYX extends BaseRule {

    public EndingConsSYX() {
        super(".*(b|c|d|f|g|h|j|k|l|m|n|ñ|p|q|r|t|v|w|x|y|z)(s|x|y)");
    }

    public String doApply(String singular) {
        return singular + "s";
    }

    @Override
    public String getDescription() {
        return "Las palabras terminadas en una consonante seguida de 's', 'y' o 'x', forman plural simplemente adicionando 's' al final de la palabra. La mayor parte de estas palabras son extranjerismos que no producel plurales regulares en español.";
    }

}
