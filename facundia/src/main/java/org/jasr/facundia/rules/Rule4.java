package org.jasr.facundia.rules;

public class Rule4 extends BaseRule {

    public Rule4() {
        super(".*(d|j|l|r)");
        
    }

    public String doApply(String singular) {
            return singular + "es";
    }

}
