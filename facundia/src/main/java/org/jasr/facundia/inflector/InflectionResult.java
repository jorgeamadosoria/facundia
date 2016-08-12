package org.jasr.facundia.inflector;

import org.jasr.facundia.inflector.rules.Rule;

public class InflectionResult {

    private String  singular;
    private String  plural;
    private Rule    ruleApplied;

    public InflectionResult() {
        singular = "";
        plural = "";
        ruleApplied = null;
    }

    public InflectionResult(String singular, String plural, Rule ruleApplied) {
        this.singular = singular;
        this.plural = plural;
        this.ruleApplied = ruleApplied;
    }

    public String getSingular() {
        return singular;
    }

    public void setSingular(String singular) {
        this.singular = singular;
    }

    public String getPlural() {
        return plural;
    }

    public void setPlural(String plural) {
        this.plural = plural;
    }

    public Rule getRuleApplied() {
        return ruleApplied;
    }

    public void setRuleApplied(Rule ruleApplied) {
        this.ruleApplied = ruleApplied;
    }

    @Override
    public String toString() {
        return "singular:" + singular + "; plural: " + plural + "; rule:" + ruleApplied.getDescription();
    }

}
