package org.jasr.facundia.rules;

public class Rule6 extends BaseRule {

    public Rule6() {
        super(".*((a|e|i|o|u)(s|x)|ss)");

    }

    public String doApply(String singular) {
        // mostly one syllabe words
        if (singular.length() <= 4)
            return singular + "es";
        // otherwise keep them. Most probably these are tantums anyways
        return singular;
    }

}
