package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public class Rule9 extends BaseRule {

    public Rule9() {
        rule = Pattern.compile(".*(á|é|í|ó|ú)(s|x)");
        exceptions.put("país", "países");
        exceptions.put("rehús", "rehúses");
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
