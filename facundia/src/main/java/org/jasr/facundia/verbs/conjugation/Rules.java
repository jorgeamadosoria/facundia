package org.jasr.facundia.verbs.conjugation;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Rules {

    public static Exception e(String form, String replace) {
        return new Exception(form, replace);
    }

    public static Rule r(String replacePattern, String... groups) {
        return new Rule(replacePattern, groups);
    }

    public static Rule r(String replacePattern, String[] patterns, String[] groups) {
        return new Rule(replacePattern, patterns, groups);
    }
    
    public static MonosylRule mr(String replacePattern, String... groups) {
        return new MonosylRule(replacePattern, groups);
    }

    public static MonosylRule mr(String replacePattern, String[] patterns, String[] groups) {
        return new MonosylRule(replacePattern, patterns, groups);
    }
    
}
