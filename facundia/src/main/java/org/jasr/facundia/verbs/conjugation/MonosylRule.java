package org.jasr.facundia.verbs.conjugation;

import org.jasr.facundia.inflector.Utils;

public class MonosylRule extends Rule {

    public MonosylRule(String replacePattern, String... groups) {
       super(replacePattern, groups);
    }

    public MonosylRule(String replacePattern, String[] patterns, String[] groups) {
        super(replacePattern,patterns,groups);
    }

    @Override
    public String conjugate(String form) {
        return Utils.INSTANCE.removeAccentIfMonoSyllabic(super.conjugate(form));
    }

}
