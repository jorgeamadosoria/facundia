package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public class Rule10 extends BaseRule {

    public Rule10() {
        rule = Pattern.compile(".*(es|is)");
    }

    public String apply(String singular) {
        if (doesApply(singular)) {
            if (Exceptions.tatums.contains(singular))
                return singular;
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);

            return singular;
        }
        return null;
    }

}
