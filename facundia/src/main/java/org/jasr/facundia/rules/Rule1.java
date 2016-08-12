package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public class Rule1 extends BaseRule {

    public Rule1() {
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
