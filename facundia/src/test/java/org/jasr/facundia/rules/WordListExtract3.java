package org.jasr.facundia.rules;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.jasr.facundia.inflector.rules.RuleChain;

public class WordListExtract3 {

    public static void main(String[] args) throws Exception {

        LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("src/test/resources/sustantivos.txt"),"UTF-8"));

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
        for (int i = 0; i < singulars.size(); i++){
            String plural = rule.apply(singulars.get(i)).getPlural();
            if (!plurals.get(i).equals(plural))
            System.out.println(plurals.get(i) + " " + plural);
        }

    }
}
