package org.jasr.facundia.rules;

import java.util.regex.Pattern;

public abstract class BaseRule implements Rule {

   
    protected Pattern                   rule;

    public BaseRule(String pattern) {
        rule = Pattern.compile(pattern);
    }

    protected boolean doesApply(String singular) {
        return singular.length() > 1 && rule.matcher(singular).matches();
    }
    
    protected abstract String doApply(String singular);
    
    public String apply(String singular) {
        if (doesApply(singular)) {
            if (Exceptions.tatums.contains(singular))
                return singular;
            if (Exceptions.contains(singular))
                return Exceptions.get(singular);


            return doApply(singular);
        }
        return null;
    }
}
