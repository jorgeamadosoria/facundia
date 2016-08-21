package org.jasr.facundia;

import java.math.BigInteger;
import java.util.List;

import org.jasr.facundia.cardinal.CardinalNumber;
import org.jasr.facundia.inflector.rules.RuleChain;
import org.jasr.facundia.syllabes.Syllaber;

public class Facundia {

    private RuleChain      rules    = new RuleChain();
    private CardinalNumber cardinal = new CardinalNumber();
    private Syllaber       syllaber = new Syllaber();

    public String inflectWord(String singular) {
        if (rules.apply(singular) != null)
            return rules.apply(singular).getPlural();
        return null;
    }

    public String cardinal(String number) {
        return cardinal.getText(number);
    }

    public String cardinal(int number) {
        return cardinal.getText(number);
    }

    public String cardinal(long number) {
        return cardinal.getText(number);
    }

    public String cardinal(BigInteger number) {
        return cardinal.getText(number);
    }

    public List<String> syllabicate(String word) {
        syllaber.reset();
        return syllaber.divide(word);
    }
}
