package org.jasr.facundia.rules;

public class Rule10 extends BaseRule {

    public Rule10() {
        super(".*(es|is)");
    }

    public String doApply(String singular) {
            return singular;
    }

}
