package org.jasr.facundia.rules;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.jasr.facundia.inflector.InflectionResult;
import org.jasr.facundia.inflector.rules.RuleChain;

public class WordListExtract3 {

    public static void main(String[] args) throws Exception {

        LineNumberReader reader = new LineNumberReader(
                new InputStreamReader(new FileInputStream("src/test/resources/sustantivos.txt"), "UTF-8"));

        List<String> singulars = new ArrayList<String>();
        List<String> plurals = new ArrayList<String>();

        while (reader.ready()) {
            String[] value = reader.readLine().split(" ");
            singulars.add(value[0]);
            // System.out.println(value[0]);
            plurals.add(value[1]);
        }
        reader.close();

        RuleChain rule = new RuleChain();
        for (int i = 0; i < singulars.size(); i++) {
            InflectionResult result = rule.apply(singulars.get(i));
            if (!plurals.get(i).equals(result.getPlural()))
                System.out.println(plurals.get(i) + " " + result.getPlural());
            else
                System.out.println(result.getPlural() + " " + result.getRuleApplied().getDescription());
        }

    }
}
