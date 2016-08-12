package org.jasr.facundia.inflector.rules;

public class EndingStVowSX extends BaseRule {

    public EndingStVowSX() {
        super(".*(�|�|�|�|�)(s|x)");
        
    }

    public String doApply(String singular) {
            return singular.substring(0, singular.length() - 2)
                    + exceptions.mapNonAccented.get(singular.charAt(singular.length() - 2)) + "ses";
    }

}
