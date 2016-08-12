package org.jasr.facundia.rules;

public class Rule2 extends BaseRule {

    public Rule2() {
       super("\\w{1,1}");
    }

    public String doApply(String singular) {
            return singular + "es";
    }

}
