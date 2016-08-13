package org.jasr.facundia.inflector.rules;

import java.util.ArrayList;
import java.util.List;

import org.jasr.facundia.inflector.InflectionResult;

public class RuleChain implements Rule {

    private List<Rule> rules = new ArrayList<Rule>();

    public RuleChain() {
        rules.add(new Exceptions());
        rules.add(new OneLetter());
        rules.add(new EndingConsSYX());
        rules.add(new EndingDJLRVowYClubFax());
        rules.add(new EndingSTSISX());
        rules.add(new EndingN());
        rules.add(new EndingVowS());
        rules.add(new EndingZ());
        rules.add(new EndingGeneral());
    }

    @Override
    public InflectionResult apply(String singular) {
        int i = 0;
        InflectionResult result = null;
        do {
            result = rules.get(i).apply(singular);
        }
        while (result == null && ++i < rules.size());
        return result;
    }

    @Override
    public String getDescription() {
        return "Cadena de reglas para aplicar a todas las palabras";
    }

}
