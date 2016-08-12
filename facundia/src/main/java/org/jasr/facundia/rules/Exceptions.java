package org.jasr.facundia.rules;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exceptions {

    public static Set<String>               tatums            = new HashSet<String>();
    public static Map<String, String>       exceptions        = new HashMap<String, String>();
    public static Map<Character, Character> nonAccented       = new HashMap<Character, Character>();
    public static Map<Character, Character> accented          = new HashMap<Character, Character>();
    public static Map<Character, Character> vowelsNonAccented = new HashMap<Character, Character>();
    public static Set<Character>            vowels            = new HashSet<Character>();
    public static Set<Character>            vowelsAccented    = new HashSet<Character>();

    static {
        tatums.add("kibutz");
        tatums.add("basoto");
        tatums.add("golf");
        tatums.add("platino");
        tatums.add("porno");
        tatums.add("zar�vich");
        tatums.add("multimedia");
        tatums.add("c�ber");
        tatums.add("ox�moron");
        tatums.add("paparazzi");
        tatums.add("multimedia");
        tatums.add("polis�ndeton");
        tatums.add("golf");
        tatums.add("windsurf");
        tatums.add("edelweiss");
        tatums.add("volapuk");
        tatums.add("han");
        tatums.add("hardware");
        tatums.add("software");
        tatums.add("reggae");
        tatums.add("p�mez");
        tatums.add("jazz");
        tatums.add("semen");
        tatums.add("nadie");
        tatums.add("nada");
        tatums.add("croquet");
        tatums.add("necton necton");
        tatums.add("mansalva");
        tatums.add("apartheid");
        tatums.add("man�");
        tatums.add("umpen");
        tatums.add("alzh�imer");

        exceptions.put("acarpo", "acarpa");
        exceptions.put("oc", "oques");
        exceptions.put("no�meno", "noumena");
        exceptions.put("no", "noes");
        exceptions.put("cu", "c�es");
        exceptions.put("pa", "pans");
        exceptions.put("o", "oes");
        exceptions.put("s�", "s�es");
        exceptions.put("mamb�", "mambises");
        exceptions.put("s�ndwich", "s�ndwiches");
        exceptions.put("maquech", "maqueches");
        exceptions.put("imam", "imames");
        exceptions.put("�lbum", "�lbumes");
        exceptions.put("car�cter", "caracteres");
        exceptions.put("amor�", "amoraim");
        exceptions.put("stotinka", "stotinki");
        exceptions.put("curriculum", "curricula");
        exceptions.put("curr�culum", "curr�cula");
        exceptions.put("agnusd�i", "agnusd�ies");
        exceptions.put("frac", "fraques");
        exceptions.put("almicantarat", "almicantarates");
        exceptions.put("pailebot", "pailebotes");
        exceptions.put("paquebot", "paquebotes");
        exceptions.put("rob", "robes");
        exceptions.put("ferry", "ferris");
        exceptions.put("lobby", "lobbies");
        exceptions.put("proxy", "proxies");
        exceptions.put("baguel", "baguels");
        exceptions.put("el", "los");
        exceptions.put("hip�rbaton", "hip�rbatos");
        exceptions.put("�stracon", "�straca");
        exceptions.put("senior", "seniors");
        exceptions.put("spoiler", "spoilers");
        exceptions.put("troll", "trolls");
        exceptions.put("tour", "tours");
        exceptions.put("aquel", "aquellos");
        exceptions.put("lord", "lores");
        exceptions.put("�fter", "�fters");
        exceptions.put("veinti�n", "veintiunos");
        exceptions.put("w�stern", "w�sterns");
        exceptions.put("western", "westerns");
        exceptions.put("raid", "raids");
        exceptions.put("hacker", "hackers");
        exceptions.put("estand", "estands");
        exceptions.put("arr�ez", "arraeces");
        exceptions.put("canon", "c�nones");
        exceptions.put("desorden", "des�rdenes");
        exceptions.put("dolmen", "d�lmenes");
        exceptions.put("eslogan", "esl�ganes");
        exceptions.put("esmoquin", "esm�quines");
        exceptions.put("fitoplancton", "fitopl�nctones");
        exceptions.put("germen", "g�rmenes");
        exceptions.put("gluten", "gl�tenes");
        exceptions.put("imagen", "im�genes");
        exceptions.put("joven", "j�venes");
        exceptions.put("margen", "m�rgenes");
        exceptions.put("mitin", "m�tines");
        exceptions.put("orden", "�rdenes");
        exceptions.put("origen", "or�genes");
        exceptions.put("virgen", "v�rgenes");
        exceptions.put("acromion", "acr�miones");
        exceptions.put("esp�cimen", "espec�menes");
        exceptions.put("r�gimen", "reg�menes");
        exceptions.put("�leon", "�leones");
        exceptions.put("as�ndeton", "as�ndetones");
        exceptions.put("beicon", "b�icones");
        exceptions.put("car�cter", "caracteres");
        exceptions.put("i", "�es");
        exceptions.put("u", "�es");
        exceptions.put("pa�s", "pa�ses");
        exceptions.put("reh�s", "reh�ses");
        exceptions.put("aguapey", "aguapeys");
        exceptions.put("boy", "boys");
        exceptions.put("caituy", "cait�is");
        exceptions.put("coicoy", "coic�is");
        exceptions.put("gay", "gais");
        exceptions.put("guay", "guais");
        exceptions.put("guirigay", "guirigais");
        exceptions.put("jersey", "jerseys");
        exceptions.put("malay", "malays");
        exceptions.put("patay", "patays");
        exceptions.put("estriptis", "estriptises");
        exceptions.put("estript�s", "estriptises");

        accented.put('a', '�');
        accented.put('e', '�');
        accented.put('i', '�');
        accented.put('o', '�');
        accented.put('u', '�');
        vowelsNonAccented.put('�', 'a');
        vowelsNonAccented.put('�', 'e');
        vowelsNonAccented.put('�', 'i');
        vowelsNonAccented.put('�', 'o');
        vowelsNonAccented.put('�', 'u');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowelsAccented.add('�');
        vowelsAccented.add('�');
        vowelsAccented.add('�');
        vowelsAccented.add('�');
        vowelsAccented.add('�');
        nonAccented.put('�', 'a');
        nonAccented.put('a', 'a');
        nonAccented.put('b', 'b');
        nonAccented.put('c', 'c');
        nonAccented.put('d', 'd');
        nonAccented.put('�', 'e');
        nonAccented.put('e', 'e');
        nonAccented.put('f', 'f');
        nonAccented.put('h', 'h');
        nonAccented.put(new Character('g'), new Character('g'));
        nonAccented.put('�', 'i');
        nonAccented.put('i', 'i');
        nonAccented.put('j', 'j');
        nonAccented.put('k', 'k');
        nonAccented.put('l', 'l');
        nonAccented.put('m', 'm');
        nonAccented.put('n', 'n');
        nonAccented.put('�', '�');
        nonAccented.put('�', 'o');
        nonAccented.put('o', 'o');
        nonAccented.put('p', 'p');
        nonAccented.put('q', 'q');
        nonAccented.put('r', 'r');
        nonAccented.put('s', 's');
        nonAccented.put('t', 't');
        nonAccented.put('�', 'u');
        nonAccented.put('�', '�');
        nonAccented.put('u', 'u');
        nonAccented.put('v', 'v');
        nonAccented.put('w', 'w');
        nonAccented.put('x', 'x');
        nonAccented.put('y', 'y');
        nonAccented.put('z', 'z');
    }

    public static boolean contains(String singular) {
        return exceptions.containsKey(singular);
    }

    public static String get(String singular) {
        return exceptions.get(singular);
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
