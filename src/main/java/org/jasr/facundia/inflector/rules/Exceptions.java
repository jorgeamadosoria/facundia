package org.jasr.facundia.inflector.rules;

import java.util.HashMap;
import java.util.Map;

public class Exceptions extends BaseRule {

    public final Map<String,String> exceptions = new HashMap<>();

    public Exceptions() {
        super(".*");
        //excepciones linguisticas historicas
        exceptions.put("el","los");
        exceptions.put("curriculum","curricula");
        exceptions.put("currículum","currícula");
        //----------------------
        //esdrujulas terminadas en -n
        exceptions.put("polisíndeton","polisíndeton");
        exceptions.put("oxímoron","oxímoron");

        //----------------------
        //invariantes
        exceptions.put("estriptis","estriptis");
        exceptions.put("kibutz","kibutz");
        exceptions.put("basoto","basoto");
        exceptions.put("golf","golf");
        exceptions.put("platino","platino");
        exceptions.put("porno","porno");
        exceptions.put("zarévich","zarévich");
        exceptions.put("cíber","cíber");
        exceptions.put("paparazzi","paparazzi");
        exceptions.put("multimedia","multimedia");
        exceptions.put("windsurf","windsurf");
        exceptions.put("edelweiss","edelweiss");
        exceptions.put("volapuk","volapuk");
        exceptions.put("han","han");
        exceptions.put("hardware","hardware");
        exceptions.put("software","software");
        exceptions.put("reggae","reggae");
        exceptions.put("pómez","pómez");
        exceptions.put("semen","semen");
        exceptions.put("nadie","nadie");
        exceptions.put("nada","nada");
        exceptions.put("croquet","croquet");
        exceptions.put("necton","necton");
        exceptions.put("mansalva","mansalva");
        exceptions.put("apartheid","apartheid");
        exceptions.put("maná","maná");
        exceptions.put("lumpen","lumpen");
        exceptions.put("alzhéimer","alzhéimer");
        exceptions.put("márquetin","márquetin");
        exceptions.put("cáterin","cáterin");
        exceptions.put("dieciséis","dieciséis");
        exceptions.put("acusetas","acusetas");
        exceptions.put("arrastramuertos","arrastramuertos");
        exceptions.put("atizacandiles","atizacandiles");
        exceptions.put("bocazas","bocazas");
        exceptions.put("buscapleitos","buscapleitos");
        exceptions.put("buscarruidos","buscarruidos");
        exceptions.put("chotis","chotis");
        exceptions.put("comejibias","comejibias");
        exceptions.put("cortarriendas","cortarriendas");
        exceptions.put("delays","delays");
        exceptions.put("géminis","géminis");
        exceptions.put("gilipollas","gilipollas");
        exceptions.put("hinchapelotas","hinchapelotas");
        exceptions.put("iris","iris");
        exceptions.put("beis","beis");
        exceptions.put("lavacoches","lavacoches");
        exceptions.put("ómnibus","ómnibus");
        exceptions.put("pagafantas","pagafantas");
        exceptions.put("paratiroides","paratiroides");
        exceptions.put("piscolabis","piscolabis");
        exceptions.put("rompetechos","rompetechos");
        exceptions.put("tiroides","tiroides");
        exceptions.put("tontopollas","tontopollas");
        exceptions.put("voltiarepas","voltiarepas");
        //-----------
        //terminaciones en -x
        exceptions.put("cérvix","cérvix");
        exceptions.put("saxafrax","saxafraxes");
        exceptions.put("patax","pataxes");
        exceptions.put("carcax","carcaxes");
        exceptions.put("gambox","gamboxes");
        exceptions.put("gambux","gambuxes");
        exceptions.put("decitex","decitexes");
        exceptions.put("moradux","moraduxes");
        exceptions.put("almoradux","almoraduxes");

        //-------------------
        //terminaciones en -c
        exceptions.put("oc","oques");
        exceptions.put("frac","fraques");
        //-------------------
        //extranjerismos terminados en -y
        exceptions.put("ferry","ferris");
        exceptions.put("dandy","dandis");
        exceptions.put("lobby","lobbies");
        exceptions.put("proxy","proxies");
        //-------------------------------

        exceptions.put("baguel","baguels");
        exceptions.put("acarpo","acarpa");

        exceptions.put("noúmeno","noumena");

        exceptions.put("mambí","mambises");
        exceptions.put("sándwich","sándwiches");
        exceptions.put("maquech","maqueches");
        exceptions.put("imam","imames");
        exceptions.put("álbum","álbumes");
        exceptions.put("carácter","caracteres");
        exceptions.put("amorá","amoraim");
        exceptions.put("stotinka","stotinki");

        exceptions.put("agnusdéi","agnusdéies");

        exceptions.put("record","records");

        exceptions.put("almicantarat","almicantarates");
        exceptions.put("pailebot","pailebotes");
        exceptions.put("paquebot","paquebotes");
        exceptions.put("hipérbaton","hipérbatos");
        exceptions.put("óstracon","óstraca");
        exceptions.put("senior","seniors");
        exceptions.put("spoiler","spoilers");

        exceptions.put("aquel","aquellos");

        exceptions.put("áfter","áfters");
        exceptions.put("veintiún","veintiunos");
        exceptions.put("wéstern","wésterns");
        exceptions.put("western","westerns");
        exceptions.put("hacker","hackers");
        exceptions.put("estand","estands");
        exceptions.put("arráez","arraeces");
        exceptions.put("canon","cánones");
        exceptions.put("desorden","desórdenes");
        exceptions.put("dolmen","dólmenes");
        exceptions.put("eslogan","eslóganes");
        exceptions.put("esmoquin","esmóquines");
        exceptions.put("fitoplancton","fitoplánctones");
        exceptions.put("germen","gérmenes");
        exceptions.put("gluten","glútenes");

        exceptions.put("jazz","jazz");

        exceptions.put("cu","cúes");
        exceptions.put("pa","pans");


        exceptions.put("troll","trolls");
        exceptions.put("tour","tours");
        exceptions.put("lord","lores");
        exceptions.put("raid","raids");
        exceptions.put("i","íes");
        exceptions.put("u","úes");
        exceptions.put("boy","boys");
        exceptions.put("gay","gais");
        exceptions.put("guay","guais");


        exceptions.put("lao","laos");

        exceptions.put("imagen","imágenes");
        exceptions.put("joven","jóvenes");
        exceptions.put("margen","márgenes");
        exceptions.put("mitin","mítines");
        exceptions.put("orden","órdenes");
        exceptions.put("origen","orígenes");
        exceptions.put("virgen","vírgenes");
        exceptions.put("acromion","acrómiones");
        exceptions.put("espécimen","especímenes");
        exceptions.put("régimen","regímenes");
        exceptions.put("íleon","íleones");
        exceptions.put("asíndeton","asíndetones");
        exceptions.put("beicon","béicones");
        exceptions.put("carácter","caracteres");

        exceptions.put("país","países");
        exceptions.put("rehús","rehúses");
        exceptions.put("guirigay","guirigáis");
        exceptions.put("jersey","jerséis");
        exceptions.put("estriptís","estriptises");
    }

    @Override
    protected boolean doesApply(String singular) {
        return exceptions.containsKey(singular);
    }

    public String doApply(String singular) {
        return exceptions.get(singular);
    }

    @Override
    public String getDescription() {
        return "Algunas palabras tienen formas plurales particulares, principalmente extranjerismos griegos, hebreos o anglicismos. Estas excepciones no se conforman con ninguna regla.";
    }

}
