package org.jasr.facundia.rules;

public class Rule9 extends BaseRule {

    public Rule9() {
        super(".*(á|é|í|ó|ú)(s|x)");
        
    }

    public String doApply(String singular) {
            return singular.substring(0, singular.length() - 2)
                    + Exceptions.mapNonAccented.get(singular.charAt(singular.length() - 2)) + "ses";
    }

}
