package org.jasr.facundia.rules;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public abstract class BaseRule implements Rule {

    protected Map<Character, Character> nonAccented    = new HashMap<Character, Character>();
    protected Map<Character, Character> accented       = new HashMap<Character, Character>();
    protected Map<Character, Character> vowelsNonAccented       = new HashMap<Character, Character>();
    protected Set<Character>            vowels         = new HashSet<Character>();
    protected Set<Character>            vowelsAccented = new HashSet<Character>();
    protected Map<String, String>       exceptions     = new HashMap<String, String>();
    protected Pattern                   rule;

    public BaseRule() {
        accented.put('a', 'á');
        accented.put('e', 'é');
        accented.put('i', 'í');
        accented.put('o', 'ó');
        accented.put('u', 'ú');
        vowelsNonAccented.put('á','a');
        vowelsNonAccented.put('é','e');
        vowelsNonAccented.put('í','i');
        vowelsNonAccented.put('ó','o');
        vowelsNonAccented.put('ú','u');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowelsAccented.add('á');
        vowelsAccented.add('é');
        vowelsAccented.add('í');
        vowelsAccented.add('ó');
        vowelsAccented.add('ú');
        nonAccented.put('á', 'a');
        nonAccented.put('a', 'a');
        nonAccented.put('b', 'b');
        nonAccented.put('c', 'c');
        nonAccented.put('d', 'd');
        nonAccented.put('é', 'e');
        nonAccented.put('e', 'e');
        nonAccented.put('f', 'f');
        nonAccented.put('h', 'h');
        nonAccented.put(new Character('g'), new Character('g'));
        nonAccented.put('í', 'i');
        nonAccented.put('i', 'i');
        nonAccented.put('j', 'j');
        nonAccented.put('k', 'k');
        nonAccented.put('l', 'l');
        nonAccented.put('m', 'm');
        nonAccented.put('n', 'n');
        nonAccented.put('ñ', 'ñ');
        nonAccented.put('ó', 'o');
        nonAccented.put('o', 'o');
        nonAccented.put('p', 'p');
        nonAccented.put('q', 'q');
        nonAccented.put('r', 'r');
        nonAccented.put('s', 's');
        nonAccented.put('t', 't');
        nonAccented.put('ú', 'u');
        nonAccented.put('ü', 'ü');
        nonAccented.put('u', 'u');
        nonAccented.put('v', 'v');
        nonAccented.put('w', 'w');
        nonAccented.put('x', 'x');
        nonAccented.put('y', 'y');
        nonAccented.put('z', 'z');
    }

    public boolean doesApply(String singular) {
        return singular.length() > 1 && rule.matcher(singular).matches();
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
