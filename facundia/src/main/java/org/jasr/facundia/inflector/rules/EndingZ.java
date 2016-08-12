package org.jasr.facundia.inflector.rules;

public class EndingZ extends BaseRule {

    public EndingZ() {
        super(".*z");
    }

    public String doApply(String singular){
           return singular.substring(0,singular.lastIndexOf("z")) + "ces";
    }

}
