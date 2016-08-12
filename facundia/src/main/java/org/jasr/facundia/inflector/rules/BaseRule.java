package org.jasr.facundia.inflector.rules;

import java.util.regex.Pattern;

import org.jasr.facundia.inflector.Utils;

public abstract class BaseRule implements Rule {

   
    protected Pattern                   rule;
    protected Utils exceptions = Utils.INSTANCE;

    public BaseRule(String pattern) {
        rule = Pattern.compile(pattern);
    }

    protected boolean doesApply(String singular) {
        return singular.length() > 1 && rule.matcher(singular).matches();
    }
    
    protected abstract String doApply(String singular);
    
    public String apply(String singular) {
        if (doesApply(singular)) {
            return doApply(singular);
        }
        return null;
    }
}
