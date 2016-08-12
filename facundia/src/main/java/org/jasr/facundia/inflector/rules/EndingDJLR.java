package org.jasr.facundia.inflector.rules;

public class EndingDJLR extends BaseRule {

    public EndingDJLR() {
        super(".*(d|j|l|r)");
        
    }

    public String doApply(String singular) {
            return singular + "es";
    }

}
