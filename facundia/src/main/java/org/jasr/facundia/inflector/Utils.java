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

        

        mapAccented.put('a', 'á');
        mapAccented.put('e', 'é');
        mapAccented.put('i', 'í');
        mapAccented.put('o', 'ó');
        mapAccented.put('u', 'ú');
        mapNonAccented.put('á', 'a');
        mapNonAccented.put('é', 'e');
        mapNonAccented.put('í', 'i');
        mapNonAccented.put('ó', 'o');
        mapNonAccented.put('ú', 'u');
        vowelsNonAccented.add('a');
        vowelsNonAccented.add('e');
        vowelsNonAccented.add('i');
        vowelsNonAccented.add('o');
        vowelsNonAccented.add('u');
        vowelsAccented.add('á');
        vowelsAccented.add('é');
        vowelsAccented.add('í');
        vowelsAccented.add('ó');
        vowelsAccented.add('ú');
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
