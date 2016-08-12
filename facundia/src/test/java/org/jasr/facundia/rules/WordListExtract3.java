package org.jasr.facundia.rules;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.jasr.facundia.inflector.rules.RuleChain;

public class WordListExtract3 {

    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/jorge.amado/Desktop/Inflector/sustantivos.txt");

        LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream(file),"ISO-8859-1"));

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
       //     if (!plurals.get(i).equals(plural))
            System.out.println(plural);
        }

    }
}
