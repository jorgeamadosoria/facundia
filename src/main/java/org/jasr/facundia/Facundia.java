package org.jasr.facundia;

import java.math.BigInteger;
import java.util.List;

import org.jasr.facundia.cardinal.CardinalNumber;
import org.jasr.facundia.inflector.rules.RuleChain;
import org.jasr.facundia.syllabes.Syllaber;
import org.jasr.facundia.verbs.Conjugator;
import org.jasr.facundia.verbs.FormasVerbales;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Facundia {
	Logger logger = LoggerFactory.getLogger(Facundia.class);
    private RuleChain      rules    = new RuleChain();
    private CardinalNumber cardinal = new CardinalNumber();
    private Syllaber       syllaber = new Syllaber();
    private Conjugator conjugator = new Conjugator();

    public String inflectWord(String singular) {
        if (rules.apply(singular) != null)
            return rules.apply(singular).getPlural();
        return null;
    }
    
    public String getVersion() {
    	return "2.2.0";
    }
    public FormasVerbales[] verbHeaders() {
        return FormasVerbales.values();
    }
    public String[] conjugate(String infinitive) {
        return conjugator.conjugate(infinitive).getVerbArray();
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
