package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public class Rule3 extends BaseRule {

    public Rule3() {
        super(".*(b|c|d|f|g|h|j|k|l|m|n|ñ|p|q|r|s|t|v|w|x|y|z)y");
    }

    public String doApply(String singular) {
            return singular + "s";
    }

}
