package org.jasr.facundia.inflector.rules;

public class EndingConsY extends BaseRule {

    public EndingConsY() {
        super(".*(b|c|d|f|g|h|j|k|l|m|n|�|p|q|r|s|t|v|w|x|y|z)y");
    }

    public String doApply(String singular) {
            return singular + "s";
    }

}
