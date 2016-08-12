package org.jasr.facundia.rules;

public class Rule2 extends BaseRule {

    public Rule2() {
        exceptions.put("i", "íes");
        exceptions.put("u", "úes");
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

    public boolean doesApply(String singular) {
        return singular.length() == 1;
    }

}
