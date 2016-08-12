package org.jasr.facundia.rules;

public class Rule1 extends BaseRule {

    public Rule1() {
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
