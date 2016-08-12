package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public class Rule6 extends BaseRule {

    public Rule6() {
        rule = Pattern.compile(".*((a|e|i|o|u)(s|x)|ss)");
        exceptions.put("estriptis", "estriptises");
        exceptions.put("estriptís", "estriptises");
    }

    public String apply(String singular) {
        if (doesApply(singular)) {
            if (Exceptions.tatums.contains(singular))
                return singular;
            if (exceptions.containsKey(singular))
                return exceptions.get(singular);
            /*
             * if (singular.endsWith("is")) return singular; return singular + "es";
             */
            // mostly one syllabe words
            if (singular.length() <= 4)
                return singular + "es";
//otherwise keep them. Most probably these are tantums anyways
            return singular;
        }
        return null;
    }

}
