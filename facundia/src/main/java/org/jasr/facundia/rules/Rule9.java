package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public class Rule9 extends BaseRule {

    public Rule9() {
        rule = Pattern.compile(".*(�|�|�|�|�)(s|x)");
        exceptions.put("pa�s", "pa�ses");
        exceptions.put("reh�s", "reh�ses");
    }

    public String apply(String singular) {
        if (doesApply(singular)) {
            if (Exceptions.tatums.contains(singular))
                return singular;
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);

            return singular.substring(0, singular.length() - 2)
                    + vowelsNonAccented.get(singular.charAt(singular.length() - 2)) + "ses";
        }
        return null;
    }

}
