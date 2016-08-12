package org.jasr.facundia.rules;

public class Rule5 extends BaseRule {

    public Rule5() {
        super(".*z");
    }

    public String doApply(String singular){
           return singular.substring(0,singular.lastIndexOf("z")) + "ces";
    }

}
