package org.jasr.facundia.rules;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.jasr.facundia.rules.Rule;
import org.jasr.facundia.rules.Rule1;
import org.jasr.facundia.rules.Rule2;
import org.jasr.facundia.rules.Rule3;
import org.jasr.facundia.rules.Rule4;
import org.jasr.facundia.rules.Rule5;
import org.jasr.facundia.rules.Rule6;
import org.jasr.facundia.rules.Rule7;
import org.jasr.facundia.rules.Rule8;
import org.jasr.facundia.rules.Rule9;

public class WordListExtract2 {

    public static void main(String[] args) throws Exception {

        File file = new File("C:/Users/jorge.amado/Desktop/Inflector/tables.txt");
   //     File notApplied = new File("C:/Users/jorge.amado/Desktop/Inflector/tables.txt");

        LineNumberReader reader = new LineNumberReader(new FileReader(file));

        List<String> singulars = new ArrayList<String>();
        List<String> plurals = new ArrayList<String>();
        while (reader.ready()) {
            String[] value = reader.readLine().split(" ");
            singulars.add(value[0]);
        //    System.out.println(value[0]);
            plurals.add(value[1]);
        }
        reader.close();
   //     FileWriter writer = new FileWriter(notApplied);

        Rule rule2 = new Rule2();
        FileWriter excRule2 = new FileWriter(new File("C:/Users/jorge.amado/Desktop/Inflector/excRule2.txt"));;
        Rule rule1 = new Rule1();
        FileWriter excRule1 = new FileWriter(new File("C:/Users/jorge.amado/Desktop/Inflector/excRule1.txt"));;
        Rule rule3 = new Rule3();
        FileWriter excRule3 = new FileWriter(new File("C:/Users/jorge.amado/Desktop/Inflector/excRule3.txt"));;

        Rule rule4 = new Rule4();
        FileWriter excRule4 = new FileWriter(new File("C:/Users/jorge.amado/Desktop/Inflector/excRule4.txt"));;
        Rule rule5 = new Rule5();
        FileWriter excRule5 = new FileWriter(new File("C:/Users/jorge.amado/Desktop/Inflector/excRule5.txt"));;
        Rule rule6 = new Rule6();
        FileWriter excRule6 = new FileWriter(new File("C:/Users/jorge.amado/Desktop/Inflector/excRule6.txt"));;
        Rule rule7 = new Rule7();
        FileWriter excRule7 = new FileWriter(new File("C:/Users/jorge.amado/Desktop/Inflector/excRule7.txt"));;
        Rule rule8 = new Rule8();
        FileWriter excRule8 = new FileWriter(new File("C:/Users/jorge.amado/Desktop/Inflector/excRule8.txt"));;
        Rule rule9 = new Rule9();
        FileWriter excRule9 = new FileWriter(new File("C:/Users/jorge.amado/Desktop/Inflector/excRule9.txt"));;

        boolean flag = true;
        for (int i = 0; i < singulars.size(); i++) {
            flag = applyRule(excRule1, rule1, singulars.get(i), plurals.get(i))
                    || applyRule(excRule2, rule2, singulars.get(i), plurals.get(i))
                    || applyRule(excRule3, rule3, singulars.get(i), plurals.get(i))
                    || applyRule(excRule4, rule4, singulars.get(i), plurals.get(i))
                    || applyRule(excRule5, rule5, singulars.get(i), plurals.get(i))
                    || applyRule(excRule6, rule6, singulars.get(i), plurals.get(i))
                    || applyRule(excRule7, rule7, singulars.get(i), plurals.get(i))
                    || applyRule(excRule8, rule8, singulars.get(i), plurals.get(i))
            || applyRule(excRule9, rule9, singulars.get(i), plurals.get(i));

    //        if (!flag) {
    //            writer.write(singulars.get(i) + " " + plurals.get(i) + "\n");
    //        }
    //        writer.flush();
            excRule1.flush();
            excRule2.flush();
            excRule3.flush();
            excRule4.flush();
            excRule5.flush();
            excRule6.flush();
            excRule7.flush();
            excRule8.flush();
            excRule9.flush();
        }
        
        excRule1.close();
        excRule2.close();
        excRule3.close();
        excRule4.close();
        excRule5.close();
        excRule6.close();
        excRule7.close();
        excRule8.close();
        excRule9.close();
   //     writer.close();
    }

    public static boolean applyRule(FileWriter exceptions, Rule rule, String singular, String plural) throws Exception {
        if (rule.doesApply(singular)) {
            String curPlural = rule.apply(singular);
            
            if (!plural.equals(curPlural)) {
                exceptions.write(singular + " " + plural + " != " + curPlural + "\n");
            }
            return true;
        }
        return false;
    }

}
