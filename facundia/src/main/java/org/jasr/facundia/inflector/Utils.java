package org.jasr.facundia.inflector;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Utils {

    
    public final Map<Character, Character> mapStressed       = new HashMap<Character, Character>();
    public final Map<Character, Character> mapNonStressed    = new HashMap<Character, Character>();
    public final Set<Character>            vowelsNonStressed = new HashSet<Character>();
    public final Set<Character>            vowelsStressed    = new HashSet<Character>();
    public final static Utils          INSTANCE          = new Utils();

    private Utils() {

        

        mapStressed.put('a', '�');
        mapStressed.put('e', '�');
        mapStressed.put('i', '�');
        mapStressed.put('o', '�');
        mapStressed.put('u', '�');
        mapStressed.put('�', '�');
        mapStressed.put('�', '�');
        mapStressed.put('�', '�');
        mapStressed.put('�', '�');
        mapStressed.put('�', '�');
        mapNonStressed.put('�', 'a');
        mapNonStressed.put('�', 'e');
        mapNonStressed.put('�', 'i');
        mapNonStressed.put('�', 'o');
        mapNonStressed.put('�', 'u');
        mapNonStressed.put('a', 'a');
        mapNonStressed.put('e', 'e');
        mapNonStressed.put('i', 'i');
        mapNonStressed.put('o', 'o');
        mapNonStressed.put('u', 'u');
        vowelsNonStressed.add('a');
        vowelsNonStressed.add('e');
        vowelsNonStressed.add('i');
        vowelsNonStressed.add('o');
        vowelsNonStressed.add('u');
        vowelsStressed.add('�');
        vowelsStressed.add('�');
        vowelsStressed.add('�');
        vowelsStressed.add('�');
        vowelsStressed.add('�');
    }

    

    public String unaccented(String word) {

        String result = "";
        for (Character c : word.toCharArray()) {
            result = result + (vowelsStressed.contains(c) ? mapNonStressed.get(c) : c);
        }

        return result;
    }

    public boolean isAccented(String word) {

        for (Character c : word.toCharArray()) {
            if (vowelsStressed.contains(c))
                return true;
        }

        return false;
    }

}
