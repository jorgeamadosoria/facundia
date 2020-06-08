package org.jasr.facundia.inflector.rules;

import java.util.regex.Pattern;

import org.jasr.facundia.inflector.InflectionResult;
import org.jasr.facundia.inflector.Utils;

public abstract class BaseRule implements Rule {

    protected Pattern rule;
    protected Utils   utils = Utils.INSTANCE;

    public BaseRule(String pattern) {
        rule = Pattern.compile(pattern);
    }

    protected boolean doesApply(String singular) {
        return rule.matcher(singular).matches();
    }

    protected abstract String doApply(String singular);

    public InflectionResult apply(String word) {
        String singular = word.toLowerCase();
        if (doesApply(singular)) {
            return new InflectionResult(singular, doApply(singular), this);
        }
        return null;
    }
    
    public abstract String getDescription();
}
