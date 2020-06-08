package org.jasr.facundia.inflector.rules;

import org.jasr.facundia.inflector.Utils;

public class OneSyllabe extends BaseRule {

    public OneSyllabe() {
       super(".*");
    }

    public String doApply(String singular) {
            return singular + "es";
    }

    @Override protected boolean doesApply(String singular)
    {
        return Utils.INSTANCE.monosyllabic(singular) && super.doesApply(singular);
    }

    @Override
    public String getDescription() {
        return "Las palabras conformadas por una sola silaba siempre forman plural adicionando -es al singular.";
    }

}
