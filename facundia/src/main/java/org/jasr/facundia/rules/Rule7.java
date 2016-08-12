package org.jasr.facundia.rules;

public class Rule7 extends BaseRule {

    public Rule7() {
        super(".*(b|c|d|f|g|h|j|k|l|m|n|ñ|p|q|r|t|v|w|x|y|z)(s|x)");
    }

    public String doApply(String singular) {
            return singular + "s";
    }

}
