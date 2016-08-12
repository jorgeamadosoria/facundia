package org.jasr.facundia.inflector.rules;

public class EndingGeneral extends BaseRule {

    public EndingGeneral() {
        super(".*(a|e|i|o|u|á|í|ú|ó|é|b|c|f|g|h|k|m|ñ|p|q|t|v|w)");
    }

    public String doApply(String singular) {
            if (singular.endsWith("st"))
                return singular;
            if (singular.endsWith("club"))
                return singular + "es";
            return singular + "s";
    }

}
