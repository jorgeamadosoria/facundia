package org.jasr.facundia.inflector.rules;

public class EndingVowY extends BaseRule {

    public EndingVowY() {
        super(".*(a|e|i|o|u)y");
        
    }

    public String doApply(String singular) {
            return singular + "es";
    }

}
