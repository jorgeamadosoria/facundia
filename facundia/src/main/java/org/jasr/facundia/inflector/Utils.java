package org.jasr.facundia.inflector;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Utils {

    
    public final Map<Character, Character> nonAccented       = new HashMap<Character, Character>();
    public final Map<Character, Character> mapAccented       = new HashMap<Character, Character>();
    public final Map<Character, Character> mapNonAccented    = new HashMap<Character, Character>();
    public final Set<Character>            vowelsNonAccented = new HashSet<Character>();
    public final Set<Character>            vowelsAccented    = new HashSet<Character>();
    public final static Utils          INSTANCE          = new Utils();

    private Utils() {

        

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

    

    public String unaccented(String word) {

        String result = "";
        for (Character c : word.toCharArray()) {
            result = result + (vowelsAccented.contains(c) ? nonAccented.get(c) : c);
        }

        return result;
    }

    public boolean isAccented(String word) {

        for (Character c : word.toCharArray()) {
            if (vowelsAccented.contains(c))
                return true;
        }

        return false;
    }

}
