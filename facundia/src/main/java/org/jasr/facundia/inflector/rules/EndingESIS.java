package org.jasr.facundia.inflector.rules;

public class EndingESIS extends BaseRule {

    public EndingESIS() {
        super(".*(es|is)");
    }

    public String doApply(String singular) {
            return singular;
    }

}
