package org.jasr.facundia.inflector.rules;

public class OneLetter extends BaseRule {

    public OneLetter() {
       super("\\w{1,1}");
    }

    public String doApply(String singular) {
            return singular + "es";
    }

}
