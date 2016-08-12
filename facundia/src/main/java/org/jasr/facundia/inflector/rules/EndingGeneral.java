package org.jasr.facundia.inflector.rules;

public class EndingGeneral extends BaseRule {

    public EndingGeneral() {
        super(".*(a|e|i|o|u|�|�|�|�|�|b|c|f|g|h|k|m|�|p|q|t|v|w)");
    }

    public String doApply(String singular) {
            if (singular.endsWith("st"))
                return singular;
            if (singular.endsWith("club"))
                return singular + "es";
            return singular + "s";
    }

}
