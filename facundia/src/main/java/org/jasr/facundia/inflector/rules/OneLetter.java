package org.jasr.facundia.inflector.rules;

public class OneLetter extends BaseRule {

    public OneLetter() {
       super("\\w{1,1}");
    }

    public String doApply(String singular) {
            return singular + "es";
    }

    @Override
    public String getDescription() {
        return "Las palabras conformadas por una sola letra siempre forman plural adicionando -es al singular.";
    }

}
