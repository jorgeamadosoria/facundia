package org.jasr.facundia.rules;

import java.util.regex.Pattern;

import org.jasr.facundia.inflector.rules.EndingN;
import org.jasr.facundia.ordinal.OrdinalNumber;

public class WordListExtract3 {

    public static void main(String[] args) throws Exception {

    /*    String str = new String("15000");

        
        OrdinalNumber ord = new OrdinalNumber();
        System.out.println(ord.getText(str));*/
        
        
        EndingN rule = new EndingN();
        
        System.out.println(rule.apply("kibutz"));
        
    }
}
