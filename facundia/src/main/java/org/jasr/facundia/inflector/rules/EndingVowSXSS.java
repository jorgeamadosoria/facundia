package org.jasr.facundia.inflector.rules;

public class EndingVowSXSS extends BaseRule {

    public EndingVowSXSS() {
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
