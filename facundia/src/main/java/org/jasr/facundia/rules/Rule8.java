package org.jasr.facundia.rules;

public class Rule8 extends BaseRule {

    public Rule8() {
        super(".*(a|e|i|o|u)y");
        
    }

    public String doApply(String singular) {
            return singular + "es";
    }

}
