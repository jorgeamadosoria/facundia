package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public class Rule8 extends BaseRule {

    public Rule8() {
        rule = Pattern.compile(".*(a|e|i|o|u)y");
        exceptions.put("aguapey", "aguapeys");
        exceptions.put("boy", "boys");
        exceptions.put("caituy", "caitúis");
        exceptions.put("coicoy", "coicóis");
        exceptions.put("gay", "gais");
        exceptions.put("guay", "guais");
        exceptions.put("guirigay", "guirigais");
        exceptions.put("jersey", "jerseys");
        exceptions.put("malay", "malays");
        exceptions.put("patay", "patays");
    }

    public String apply(String singular) {
        if (doesApply(singular)) {
            if (Exceptions.tatums.contains(singular))
                return singular;
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);

            return singular + "es";
        }
        return null;
    }

}
