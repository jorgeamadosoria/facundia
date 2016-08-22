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
    public final Set<Character>            vowels    = new HashSet<Character>();
    public final static Utils          INSTANCE          = new Utils();

    private Utils() {

        

        mapStressed.put('a', 'á');
        mapStressed.put('e', 'é');
        mapStressed.put('i', 'í');
        mapStressed.put('o', 'ó');
        mapStressed.put('u', 'ú');
        mapStressed.put('á', 'á');
        mapStressed.put('é', 'é');
        mapStressed.put('í', 'í');
        mapStressed.put('ó', 'ó');
        mapStressed.put('ú', 'ú');
        mapNonStressed.put('á', 'a');
        mapNonStressed.put('é', 'e');
        mapNonStressed.put('í', 'i');
        mapNonStressed.put('ó', 'o');
        mapNonStressed.put('ú', 'u');
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
        vowelsStressed.add('á');
        vowelsStressed.add('é');
        vowelsStressed.add('í');
        vowelsStressed.add('ó');
        vowelsStressed.add('ú');
        
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('á');
        vowels.add('é');
        vowels.add('í');
        vowels.add('ó');
        vowels.add('ú');
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
