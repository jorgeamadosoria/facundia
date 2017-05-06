package org.jasr.facundia.verbs.conjugation;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.math.NumberUtils;

public class Rule implements Conjugation {
    protected List<Pattern> matchPatterns;
    protected Pattern       replacePattern;
    protected String[]      groups;

    public Rule(String replacePattern, String... groups) {
        this.replacePattern = Pattern.compile(replacePattern);
        this.matchPatterns = Arrays.asList(this.replacePattern);
        this.groups = groups;
    }

    public Rule(String replacePattern, String[] patterns, String[] groups) {
        this.replacePattern = Pattern.compile(replacePattern);
        this.matchPatterns = Arrays.stream(patterns).map(pattern -> Pattern.compile(pattern)).collect(Collectors.toList());
        this.groups = groups;
    }

    @Override
    public boolean matches(String form) {
        return matchPatterns.stream().allMatch(pattern -> pattern.matcher(form).matches());
    }

    @Override
    public String conjugate(String form) {
        Matcher matcher = replacePattern.matcher(form);
        return String.join("",
                Arrays.stream(groups).map(group -> NumberUtils.isNumber(group) ? matcher.group(Integer.valueOf(group)) : group)
                        .collect(Collectors.toList()));
    }

}
