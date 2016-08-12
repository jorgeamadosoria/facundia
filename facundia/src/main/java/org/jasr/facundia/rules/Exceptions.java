package org.jasr.facundia.rules;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Exceptions {

    public static Properties                exceptions        = new Properties();
    public static Map<Character, Character> nonAccented       = new HashMap<Character, Character>();
    public static Map<Character, Character> mapAccented       = new HashMap<Character, Character>();
    public static Map<Character, Character> mapNonAccented    = new HashMap<Character, Character>();
    public static Set<Character>            vowelsNonAccented = new HashSet<Character>();
    public static Set<Character>            vowelsAccented    = new HashSet<Character>();

    static {

        try (InputStream stream = new FileInputStream("src/main/resources/exceptions.properties")) {
            exceptions.load(stream);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        mapAccented.put('a', '�');
        mapAccented.put('e', '�');
        mapAccented.put('i', '�');
        mapAccented.put('o', '�');
        mapAccented.put('u', '�');
        mapNonAccented.put('�', 'a');
        mapNonAccented.put('�', 'e');
        mapNonAccented.put('�', 'i');
        mapNonAccented.put('�', 'o');
        mapNonAccented.put('�', 'u');
        vowelsNonAccented.add('a');
        vowelsNonAccented.add('e');
        vowelsNonAccented.add('i');
        vowelsNonAccented.add('o');
        vowelsNonAccented.add('u');
        vowelsAccented.add('�');
        vowelsAccented.add('�');
        vowelsAccented.add('�');
        vowelsAccented.add('�');
        vowelsAccented.add('�');
    }

    public static boolean contains(String singular) {
        return exceptions.containsKey(singular);
    }

    public static String get(String singular) {
        return exceptions.getProperty(singular);
    }

    public static String unaccented(String word) {

        String result = "";
        for (Character c : word.toCharArray()) {
            result = result + (vowelsAccented.contains(c) ? nonAccented.get(c) : c);
        }

        return result;
    }

    public static boolean isAccented(String word) {

        for (Character c : word.toCharArray()) {
            if (vowelsAccented.contains(c))
                return true;
        }

        return false;
    }
}
