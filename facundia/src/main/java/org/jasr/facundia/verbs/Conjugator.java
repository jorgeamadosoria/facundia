package org.jasr.facundia.verbs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.jasr.facundia.syllabes.Syllaber;
import org.jasr.facundia.verbs.conjugation.Rules;

public class Conjugator {

    private Map<Verb, VerbForm> forms = new HashMap<>();

    public Conjugator() {

        forms.put(Verb.INF, new VerbForm(Verb.INF, Rules.r("^(.*)$", "1")));

        forms.put(Verb.GER,
                new VerbForm(Verb.GER, Rules.e("poder", "pudiendo"), Rules.e("ir", "yendo"), Rules.e("evertir", "everto"),
                        Rules.e("rendir", "rindiendo"), Rules.r("^(.*)(ar)$", "1", "ando"), Rules.r("^(.*)(ar)$", "1", "ando"),
                        Rules.r("^(.*)(a|o|e)(e|í)r$", "1", "2", "yendo"), Rules.r("^(.*)ll(i|e)r$", "1", "llendo"),
                        Rules.r("^(.*)er$", "1", "iendo"), Rules.r("^(.*)(m|p)edir$", "1", "2", "idiendo"),
                        Rules.r("^(.*)e(nch|rt|rgu|gu|m|nt|b|st|g|c|n|t|r|rv)ir$", "1", "i", "2", "iendo"),
                        Rules.r("^(.*)o(r|rm)ir$", "1", "u", "2", "iendo"), Rules.r("^(.*)uir$", "uyendo"),
                        Rules.r("^(.*)ir$", "1", "iendo")));

        forms.put(Verb.PART, new VerbForm(Verb.PART, Rules.e("romper", "roto"), Rules.e("ver", "visto"),
                Rules.e("prever", "previsto"), Rules.e("entrever", "entrevisto"), Rules.e("antever", "antevisto"),
                Rules.r("^(.*)ar$", "1", "ado"), Rules.r("^(.*)poner$", "1", "puesto"), Rules.r("^(.*)olver$", "1", "uelto"),
                Rules.r("^(.*)(h|f)acer$", "1", "2", "echo"), Rules.r("^(.*)(e|a|o)er$", "1", "2", "ído"),
                Rules.r("^(.*)pudrir$", "1", "podrido"), Rules.r("^(.*)morir", "1", "muerto"),
                Rules.r("^(.*)ribir$", "1", "rito"), Rules.r("^(.*)decir$", "1", "ito"), Rules.r("^(.*)brir$", "1", "bierto"),
                Rules.r("^(.*)ír$", "1", "ído"), Rules.r("^(.*)(e|i)r$", "1", "ido")));

        /*
         * new VerbForm(Verb.PRES_IND_YO, Rules.e("hendir","hiendo"), Rules.e("rendir","rindo"), Rules.e("rehundir","rehúndo") ,
         * Rules.e("evertir","everto"), Rules.e("reunir","reúno", "henchir","hincho", "rehenchir","rehíncho", "erguir","yergo"),
         * Rules.e("ir","voy", "ser","soy", "haber","he", "caber","quepo", "mecer","mezo", "remecer","remezo",
         * "pretender","pretendo", "hender","hiendo", "heder","hiedo", "defender","defiendo", "atrever","atrevo",
         * "precaver","precavo", "airar","aíro", "ahitar","ahíto", "ahilar","ahílo", "rehilar","rehílo", "sobrehilar","sobrehílo",
         * "amohinar","amohíno", "incensar","incienso", "desbecerrar","desbecerro", "soterrar","soterro", "ferrar","fierro",
         * "manifestar","manifiesto", "estar","estoy", "aneblar","anieblo", "confesar","confieso"), Rules.e("adestrar","adiestro",
         * "patiquebrar","patiquebro", "resolgar","resolgo", "avergonzar","avergüenzo", "desoldar","desueldo",
         * "regoldar","regüeldo", "soldar","sueldo", "chollar","chollo", "descollar","descuello", "degollar","degüello",
         * "entortar","entuerto", "soltar","suelto", "renovar","renuevo", "emporcar","empuerco", "desosar","deshueso",
         * "tronar","trueno", "alforzar","alforzo", "almorzar","almuerzo", "ahincar","ahínco", "abuñolar","abuñuelo",
         * "azolar","azuelo", "dedolar","deduelo", "desmajolar","desmajuelo", "escolar","escuelo", "recolar","recuelo",
         * "trascolar","trascuelo", "sobresolar","sobresuelo", "solar","suelo", "subsolar","subsuelo", "denostar","denuesto",
         * "apostar","apuesto", "ensangrentar","ensangriento", "accidentar","accidento", "tentar","tiento",
         * "desatentar","desatiento", "retentar","retiento", "adormentar","adormiento", "escarmentar","escarmiento",
         * "mentar","miento", "salpimentar","salpimiento", "sementar","semiento", "inventar","invento", "solventar","solvento",
         * "alentar","aliento", "desalentar","desaliento", "violentar","violento", "sentar","siento", "vigiar","vigío",
         * "miar","mío", "esquiar","esquío", "espiar","espío", "expiar","expío", "jipiar","jipío", "piar","pío", "pipiar","pipío",
         * "fiar","fío", "porfiar","porfío", "desafiar","desafío", "arriar","arrío", "chirriar","chirrío",
         * "descarriar","descarrío","zurriar","zurrío","enriar","enrío",
         * "gloriar","glorío","averiar","averío","estriar","estrío","triar","trío","cariar","carío",
         * "inventariar","inventarío","contrariar","contrarío","aviar","avío","desviar","avío",
         * "desaviar","desavío","extraviar","extravío","ansiar","ansío","extasiar","extasío","aliar","alío",
         * "ampliar","amplío","desliar","deslío","liar","lío","adiar","adío","almadiar","almadío",
         * "agorar","agüero","engorar","engüero","desaforar","desafuero","encorar","encuero",
         * "asonar","asueno","consonar","consueno","resonar","resueno","sonar","sueno", "jugar","juego",
         * "rogar","ruego","regar","riego","restregar","restriego","sorregar","sorriego", "anegar","anego",
         * "resolgar","resolgo","amelar","amelo"}, [ new Rule("^(.*)asir$","1,"asgo"), new Rule("^(.*)quir$/ "1,"co"]}, Rules.r("
         * ^(.*)egir$","1,"ijo"), Rules.r("^(.*)gir$","1,"jo"), new Rule( "^(.*)ulcir$","1,"adulzo"]}, Rules.r("
         * ^(.*)ucir$","1,"uzco"), Rules.r("^(.*)emir$","1,"imo"), Rules.r("^(.*)dormir$","1," duermo "]}, Rules.r("
         * ^(.*)orir$","1,"uero"), new Rule( "^(.*)(e|i)rir$","1,"iero"), new Rule( "^(.*)ohibir$","1,"ohíbo"]},
         * Rules.r("^(.*)ebir$/ "1,"ibo"), Rules.r("^(.*)cernir$","1,"cierno"), Rules.r("^(.*)hervir$","1,"hiervo "]}, Rules.r("
         * ^(.*)eñir$","1,"iño"), Rules.r("^(.*)argüir$","1,"arguyo"), new Rule( "^(.*)(p|m)edir$","1,2,"ido "]}, Rules.r("
         * ^(.*)vertir$","1,"vierto "), Rules.r("^(.*)etir$","1,"ito"), Rules.r( "^(.*)entir$","1,"iento"]}, Rules.r("
         * ^(.*)estir$","1," isto"), Rules.r("^(.*)over$","1,"uevo"), Rules.r("^(.*)olver$","1,"uelvo"]}, new Rule( "
         * ^(.*)ver$","1,"veo "), Rules.r("^(.*)saber$/ "1,"sé"), Rules.r("^(.*)verter$","1,"vierto"]}, new Rule(
         * "^(.*)erder$","1,"ierdo"), Rules.r(" ^(.*)o(rd|l)er$","1,"ue",2,"o"), Rules.r("^(.*)querer$","1,"quiero"), Rules.r("
         * ^(.*)erner$","1," ierno"), Rules.r("^(.*)(t|c)ender$","1,2,"iendo"]}, new Rule("^(.*)(ven|ten|pon|sal|val)er$","1,2,"go
         * "), Rules.r("^(.*)(tr|c)aer$","1,2,"aigo"), new Rule( "^(.*)poder$","1,"puedo"), Rules.r("^(.*)cocer$/ "1,"cuezo
         * "), new Rule( "^(.*)encer$","1,"enzo"), Rules.r("^(.*)(f|h)acer$","1,2,"ago"), Rules.r( "^(.*)torcer$","1,"tuerzo
         * "), Rules.r("^(.*)ercer$","1,"erzo"), Rules.r("^(.*)cer$","1,"zco"), Rules.r("^(.*)ger$","1,"jo"), Rules.r("
         * ^(.*)oír$","1,"oigo"), Rules.r("^(.*)eír$","1,"ío "]}, Rules.r("^(.*)desvaír$","1,"desvayo"), Rules.r("^(.*)olgar$","1,
         * "uelgo "), new Rule( "^(.*)eguir$/ "1," igo"]}, Rules.r("^(.*)(c|n|s|pl|fr)egar$","1,2," ciego"]}, Rules.r("
         * ^(.*)(c|graf|gu|ch|j|conf|ist|cuant|hast|atav|env|cr|fr|var|sar|)iar$","1,2,"ío"]}, new Rule(
         * "^(.*)(d|ac|rec|sarm|cal|v|as)entar$","1,2,"iento"), Rules.r("^(.*)(c|t)ostar$","1,2,"uesto"]}, new Rule(
         * "^(.*)(cons|v)olar$","1,2,"uelo"), Rules.r("^(.*)(a|o)hijar$","1,2,"ahíjo"), new Rule( "^(.*)aislar$","1,"aíslo
         * "), Rules.r("^(.*)(m|p)oblar$","1,2,"ueblo"), Rules.r("^(.*)(tr|cl|fl|ll)ocar$/ "1,2,"ueco"]}, Rules.r("
         * ^(.*)higar$","1,"hígo"), Rules.r("^(.*)forzar "$/                                                         "1,"fuerzo"),
         * Rules.r("^(.*)cornar$/ "1,"cuerno"]}, Rules.r("^(.*)mostrar$","1,"muestro"), Rules.r("^(.*)probar$","1,"pruebo"), new
         * Rule( "^(.*)volcar$","1,"vuelco"), Rules.r("^(.*)(atr|dis|etr)onar$","1,2,"ueno"), new Rule( "^(.*)grosar$","1,"grueso
         * "]}, Rules.r("^(.*)ontrar$","1,"uentro"), Rules.r("^(.*)ro(g|d)ar$/ "1,"rue",2,"o"), Rules.r("^(.*)olgar$","1,"uelgo"),
         * Rules.r("^(.*)soñar$","1,"sueño"), new Rule( "^(.*)contar$","1,"cuento"), Rules.r("^(.*)(s|h)ollar$","1,2,"uello"),
         * Rules.r("^(.*)(c|p)ertar$/ "1,2,"ierto "), Rules.r("^(.*)apretar$","1,"aprieto"]}, new Rule(
         * "^(.*)(ap|ep|s|gob|f)ernar$","1,2,"ierno"), Rules.r("^(.*)(s|n)egar$","1,2,"iego"), new Rule( "^(.*)avesar "
         * $","1,"avieso"), Rules.r("^(.*)(m|h)elar$","1,2,"ielo"), Rules.r( "^(.*)herbar$","1,"hierbo"), Rules.r("
         * ^(.*)pedrar$","1,"piedro"), new Rule( "^(.*)lendrar$","1," liendro"), Rules.r("^(.*)pezar$","1,"piezo"), new
         * Rule("^(.*)hestar$","1," hiesto"), Rules.r(" ^(.*)nevar$","1,"nievo"), Rules.r("^(.*)(s|c|r|h)errar$","1,2,"ierro "),
         * Rules.r( "^(.*)(m|l)enzar$","1,2,"ienzo"]}, Rules.r("^(.*)pensar$","1,"pienso "), Rules.r("^(.*)emblar$/ "1,"iemblo
         * "), Rules.r("^(.*)sembrar$","1,"siembro"), Rules.r("^(.*)quebrar$","1,"quiebro "), Rules.r("^(.*)uar$","1,"úo
         * "]}, new Rule( "^(.*)ahu(m|s|ch)ar$","1,"ahú",2,"o"), Rules.r("^(.*)ehusar$/ "1,"ehúso"), new Rule( "
         * ^(.*)au(n|p|l|ll)ar$","1,2,"o"), Rules.r("^(.*)jugar$","1,"juego"), Rules.r("^(.*)euntar$","1,"eúnto"), Rules.r("
         * ^(.*)aillar$","1,"aíllo "), new Rule( " ^(.*)(sa|oh|cafe)inar$","1,2,"íno "), Rules.r("^(.*)(a|e)izar$","1,2,"ízo"]},
         * new Rule( "^(.*)dar$","1,"doy"), Rules.r("^(.*)(a|e|i)r$","1,"o"]} ]); Verb.PRES_IND_TU
         * "] = new VerbForm( new VerbForm(Verb.PRES_IND_YO"],
         * {"ser","eres","remecer","remeces","mecer","meces","estar","estás","desvaír","desvaes","ir","vas","dar","das", "desdar":
         * "desdás","caber","cabes","ver","ves"}, [ new Rule("^(.*)(ger|gir)","1","ges"), new Rule("^(.*)saber","1","sabes"]},
         * Rules.r("^(.*)(asir|salir|poner|valer)","1","es"]}}, new Rule("^(.*)(tr|c)aer|aer","1","es"]},
         * Rules.r("^(.*)decir","1","ces "), Rules.r("^(.*)oír","1","yes"), Rules.r("^(.*)quir","1","ques"]}, Rules.r("
         * ^(.*)guir","1","gues"), Rules.r("^(.*)(cer|ucir)","1","ces"), Rules.r("^(.*)cir","1","ces"]}, Rules.r("
         * ^(.*)ver","1","és"), Rules.r("^(.*)(venir|tener)","1","ienes"), Rules.r("^(.*)","1","es"]}} ] );
         * 
         * new VerbForm(Verb.PRES_IND_VOSEO, { haber, ir }, [ new Rule("^(.*)(i|í)r","1","ís"]}, Rules.r("^(.*)er","1","és
         * "), Rules.r("^(.*)ar","1","ás"]} //quitar el acento si el resultado es monosilabico ] );
         * 
         * new VerbForm(Verb.PRES_IND_VOS"] = new VerbForm( Verb.PRES_IND_VOSEO"], {}, [ new
         * Rule("^(.*)uir","1","is"],root:Verb.INF "]} //TODO: solo aplica a monosilabicos new Rule("^(.*)(a|á|e|é)s","1",2,"is
         * "]} new Rule("^(.*)","1]}, ] );
         * 
         * new VerbForm(Verb.PRES_IND_EL"] = Verb.PRES_IND_TU"];
         * 
         * new VerbForm(Verb.PRES_IND_NOSOTROS, { "ser","somos", "haber","hemos", "ir","vamos" }, [ new Rule("^(.*)r","1","mos"]}
         * ] );
         * 
         * new VerbForm(Verb.PRES_IND_USTEDES"] = new VerbForm( Verb.PRES_IND_EL"], { "ser","son" }, [ new Rule("^(.*)","1","n"]}
         * ] );
         * 
         * new VerbForm(Verb.PRES_IND_ELLOS"] = Verb.PRES_IND_USTEDES"];
         * 
         * new VerbForm(Verb.COP_IND_YO, { "ser","era", "ir","iba" }, [ new Rule("^(.*)ar","1","aba"]}, new Rule("^(.*)ver","1",
         * "veía "), Rules.r("^(.*)(e|i)r","1","ía"]}, ] );
         * 
         * new VerbForm(Verb.COP_IND_TU"] = new VerbForm( Verb.COP_IND_YO"], {}, [ new Rule("^(.*)","1","s"]} ] );
         * 
         * new VerbForm(Verb.COP_IND_EL"] = Verb.COP_IND_YO"];
         * 
         * new VerbForm(Verb.COP_IND_NOSOTROS"] = new VerbForm( Verb.COP_IND_YO"], { "ser","", "ir","" }, [ new
         * Rule("^(.*)aba","1","ábamos"), Rules.r("^(.*)","1","mos"]} ] );
         * 
         * new VerbForm(Verb.COP_IND_VOS"] = new VerbForm( Verb.COP_IND_YO"], {}, [ new Rule("^(.*)","1","is"]} ] );
         * 
         * new VerbForm(Verb.COP_IND_ELLOS"] = new VerbForm( Verb.COP_IND_YO"], {}, [ new Rule("^(.*)","1","n
         * "]} ] ); /* Verb.PRET_IND_YO"] = new VerbForm( null, { "dar","di", "andar","anduve", "desandar","desanduve",
         * "ser","fui", "ver","vi", "caber","quepo", "haber","hube", "contrahacer","contrahíce", "ir","fui" }, [ new
         * Rule("^(.*)gar","1","gué"]}, Rules.r("^(.*)guar","1","güé"), Rules.r("^(.*)zar","1","cé"), new
         * Rule("^(.*)car","1","qué"]},
         * 
         * && this.INF.endsWith("ar") // && this.INF.substring(0,this.INF.length-2) + "é" != this.PRET_IND_YO // sin tilde si es
         * monosilabico
         * 
         * 
         * new Rule("^(.*)ducir","1","duje"), Rules.r("^(.*)ecir","1","ije"), Rules.r("^(.*)venir","1","vine"]}, &&
         * this.INF.endsWith("ir") && this.INF.substring(0,this.INF.length-2) + "í" != this.PRET_IND_YO// sin tilde si es
         * monosilabico
         * 
         * 
         * new Rule("^(.*)tener","1","tuve"), Rules.r("^(.*)saber","1","supe"), Rules.r("^(.*)poder","1","pude"]}, new
         * Rule("^(.*)poner","1","puse"), Rules.r("^(.*)traer","1","traje"), Rules.r("^(.*)querer","1","quise"]}, new
         * Rule("^(.*)(h|f)acer","1",2,"hice"]}
         * 
         * new Rule("^(.*)er") // && this.INF.substring(0,this.INF.length-2) + "í" != this.PRET_IND_YO ] );
         * 
         */
        /*
         * new VerbForm(Verb.PRET_IND_TU"] = new VerbForm( Verb.PRET_IND_YO"], {"contrahacer","contrahiciste"}, [ new
         * Rule("^(.*)(a|e|o)í","1",2,"íste"] new Rule("^(.*)í","1","iste"), Rules.r("^(.*)cé","1","zaste"]}, new
         * Rule("^(.*)gué","1","gaste"), Rules.r("^(.*)qué","1","caste"), Rules.r("^(.*)güé","1","guaste"]}, new
         * Rule("^(.*)é","1", "aste "), Rules.r("^(.*)(i|u)e","1",2,"aste"), Rules.r("^(.*)(e|i)","1",2,"iste"]} ] );
         * 
         * new VerbForm(Verb.PRET_IND_VOSEO"] = Verb.PRET_IND_TU"];
         * 
         * new VerbForm(Verb.PRET_IND_VOS"] = new VerbForm( Verb.PRET_IND_TU"], {}, [ new Rule("^(.*)","1","is"]} ] );
         * 
         * new VerbForm(Verb.PRET_IND_EL"] = new VerbForm( Verb.PRET_IND_TU"], { "ser","fue" "ir","fue", "rendir","rindió",
         * "contrahacer","contrahízo", "gemir","gimió", "caber","cupo", "reír","rio", "freír","frio", "ver","vio",
         * "prever","previo", "haber","hubo", "poder","pudo", "dar","dio" }, [ new Rule("^(.*)aste","1","ó"]}, //si monosilabico,
         * se quita el acento new Rule("^(.*)(g|q)uiste","1",2,"uió"), Rules.r("^(.*)(ui|üi|í)ste","1","yó"]}, new
         * Rule("^(.*)(uv|j|vin|pus|quis)iste","1",2,"o "), Rules.r("^(.*)iciste","1","izo"]}, new Rule("^(.*)ciste","1", "ió "),
         * Rules.r("^(.*)(ll|ñ)iste","1",2,"ó"]}, Rules.r("^(.*)e(r|t|nt|st|g|d|b|nch|rv|rt)iste","1","i",2,"ió "), Rules.r("
         * ^(.*)vertiste","1","virtió"]}, new Rule("^(.*)ormiste","1","urmió"), Rules.r("^(.*)moriste","1","murió"),
         * Rules.r("^(.*)supiste","1","supo"]}, new Rule("^(.*)iste","1","ió"]} ] };
         * 
         * new VerbForm(Verb.PRET_IND_NOSOTROS"] = new VerbForm( Verb.PRET_IND_TU"], {}, [ new Rule("^(.*)ste","1","mos"]} ] );
         * 
         * 
         * new VerbForm(Verb.PRET_IND_USTEDES, { "ser","fueron", "ir","fueron", "desdar","desdieron" }, [ new Rule(
         * "^(.*)venir$/ -> quitar venir, sustituir por vinieron new Rule("^(.*)ar$/ && this.PRET_IND_EL.endsWith("o") ->
         * this.PRET_IND_ELLOS.endsWith("ieron") new Rule("^(.*)ar$/ && this.PRET_IND_EL.endsWith("ó") ->
         * this.PRET_IND_ELLOS.endsWith("aron") new Rule("^(.*)ar$/, es monosilabico y && this.PRET_IND_EL.endsWith("o") ->
         * this.PRET_IND_ELLOS.endsWith("aron") //
         * 
         * 
         * new Rule("^(.*)ir$/ && !this.PRET_IND_EL.endsWith("ó") //&& this.PRET_IND_ELLOS.endsWith("eron") new Rule("^(.*)ir$/ &&
         * this.PRET_IND_EL.endsWith("o") //&& this.PRET_IND_ELLOS.endsWith("eron")
         * 
         * new Rule("^(.*)er$/ && this.PRET_IND_EL.endsWith("o") && !this.PRET_IND_ELLOS.endsWith("ieron") new Rule("^(.*)er$/ &&
         * this.PRET_IND_EL.endsWith("jo") && !this.PRET_IND_ELLOS.endsWith("jeron") new Rule(
         * "^(.*)er$/ && this.PRET_IND_EL.endsWith("ó") && this.PRET_IND_ELLOS.endsWith("eron") ] );
         * 
         * new VerbForm(Verb.PRET_IND_ELLOS"] = Verb.PRET_IND_USTEDES"];
         * 
         * new VerbForm(Verb.FUT_IND_YO"] = new VerbForm( { "ir","é", "bendecir","bendeciré", "maldecir","maldeciré" }, [ new
         * Rule("^(.*)(ten|pon|val)er","1",2,"dré"), Rules.r("^(.*)(ha|fa)cer","1",2,"ré"]}, new
         * Rule("^(.*)(pod|quer|sab|cab|hab)er","1",2,"ré"), Rules.r("^(.*)(sal|ven)ir","1",2,"dré"]}, new Rule("^(.*)decir","1",
         * "diré "), Rules.r("^(.*)ír","1","iré"), Rules.r("^(.*)","1","é"]} ] );
         * 
         * new VerbForm(Verb.FUT_IND_TU"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ new Rule("^(.*)é","1","ás"]} ] );
         * 
         * new VerbForm(Verb.FUT_IND_VOS"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ new Rule("^(.*)","1","is"]} ] );
         * 
         * 
         * new VerbForm(Verb.FUT_IND_EL"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ new Rule("^(.*)é","1","á"]} ] );
         * 
         * new VerbForm(Verb.FUT_IND_NOSOTROS"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ new Rule("^(.*)é","1","emos"]} ] );
         * 
         * new VerbForm(Verb.FUT_IND_ELLOS"] = new VerbForm( Verb.FUT_IND_EL"], {}, [ new Rule("^(.*)","1","n"]} ] );
         * 
         * new VerbForm(Verb.POS_IND_YO, {}, [ new Rule("^(.*)ar","1","ía"]},
         * 
         * new Rule("^(.*)(ten|pon|val|po)er","1",2,"dría"), Rules.r("^(.*)(querer","1",2,"querría"]}, new
         * Rule("^(.*)(h|f)acer","1",2,"ría"), Rules.r("^(.*)(c|h|s)aber","1",2,"abría"), Rules.r("^(.*)er","1","ía"]},
         * 
         * new Rule("^(.*)(ven|sal)ir","1",2,"dría"), Rules.r("^(.*)decir","1","diría"]}, new Rule("^(.*)enserir","1",
         * "enseriaría "), Rules.r("^(.*)ir","1","ía"]}, ] );
         * 
         * new VerbForm(Verb.POS_IND_TU"] = new VerbForm( Verb.POS_IND_YO"], {}, [ new Rule("^(.*)","1","s"]} ] );
         * 
         * new VerbForm(Verb.POS_IND_VOSEO"] = Verb.POS_IND_TU"];
         * 
         * new VerbForm(Verb.POS_IND_VOS"] = new VerbForm( Verb.POS_IND_YO"], {}, [ new Rule("^(.*)ía","1","íais"]} ] );
         * 
         * new VerbForm(Verb.POS_IND_EL"] = Verb.POS_IND_YO"];
         * 
         * 
         * new VerbForm(Verb.POS_IND_NOSOTROS"] = new VerbForm( Verb.POS_IND_YO"], {}, [ new Rule("^(.*)","1","mos"]} ] );
         * 
         * new VerbForm(Verb.POS_IND_USTEDES"] = Verb.PRET_IND_ELLOS"];
         * 
         * 
         * new VerbForm(Verb.POS_IND_ELLOS"] = new VerbForm( Verb.POS_IND_YO"], {}, [ new Rule("^(.*)","1","n"]} ] );
         * 
         * new VerbForm(Verb.PRES_SUB_YO"] = new VerbForm( Verb.PRES_IND_YO"], { "ser","sea", "ir","vaya", "enserir","enserie" },
         * [ new Rule("^(.*)","1","n"]}
         * 
         * new Rule("^(.*)oy","1","é"), Rules.r("^(.*)go","1","gue"), Rules.r("^(.*)zo","1","ce"]}, new Rule("^(.*)co","1", "que "
         * ), Rules.r("^(.*)guo","1","güe"]},
         * 
         * && INF terminar ar y new Rule("^(.*)o") -> PRES_IND_YO quitar o, e
         * 
         * && INF terminar er o ir y this.PRES_IND_YO.endsWith("o") -> PRES_IND_YO quitar o, a
         * 
         * ] );
         * 
         * new VerbForm(Verb.PRES_SUB_TU"] = new VerbForm( Verb.PRES_SUB_YO"], {"dar",""}, Rules.r("^(.*)","1]} ] ); new
         * VerbForm(Verb.PRES_SUB_NOSOTROS, { "ser","seamos", "haber":, "caber","quepamos", "desvaír","desvayamos",
         * "ir","vayamos", "mecer","mezamos", "remecer","remezamos", "antever","anteveamos", "entrever","entreveamos",
         * "prever","preveamos", "trasver","trasveamos", "ver","veamos" }, [ new Rule("^(.*)gar","1","guemos"]}, new
         * Rule("^(.*)zar","1","cemos"), new Rule( "^(.*)car","1","quemos"), Rules.r("^(.*)guar","1","güemos"]}, new
         * Rule("^(.*)ar","1","emos"]},
         * 
         * new Rule("^(.*)(ten|pon|val)er","1",2,"gamos"]},
         * 
         * new Rule("^(.*)(c|tr)aer","1",2,"aigamos"]},
         * 
         * new Rule("^(.*)saber","1","sepamos"]},
         * 
         * new Rule("^(.*)ger","1","jamos"), Rules.r("^(.*)cocer","1","cozamos"]},
         * 
         * new Rule("^(.*)cer","1","zcamos" new Rule("^(.*)er","1","amos"
         * 
         * new Rule("^(.*)oír","1","oigamos"), Rules.r("^(.*)eír","1","iamos"]},
         * 
         * new Rule("^(.*)dormir","1","durmamos"), Rules.r("^(.*)orir","1","uramos"), Rules.r("^(.*)gir","1","jamos"]}, new
         * Rule("^(.*)(u|ü)ir","1","uyamos"), Rules.r("^(.*)vertir","1","virtamos"]}, new Rule("^(.*)(as|ven|sal)ir","1",2,
         * "gamos "), Rules.r("^(.*)decir","1","digamos"]}, Rules.r("^(.*)ucir","1","uzcamos"), Rules.r(" ^(.*)cir","1","zamos"]},
         * 
         * new Rule("^(.*)e(g|r|rv|gr|st|t|b|d|ñ|nt|m|end|nch)ir","1","i",2,"amos"]}, ] );
         * 
         * 
         * new VerbForm(Verb.PRES_SUB_VOS, { "dar","deis", "ir","vayáis", "desleír","desliáis", "desvaír","desvayáis",
         * "ser","seáis", "caber","quepáis", "haber","hayáis", "enserir","enseráis", "evertir","evertáis", "rendir","rindáis" }, [
         * new Rule("^(.*)gar","1","guéis"), Rules.r("^(.*)zar","1","céis"), Rules.r("^(.*)car","1","quéis"]}, new
         * Rule("^(.*)guar","1","güéis"), Rules.r("^(.*)iar","1","iéis"]},// si es monosilabico la e no se acentua
         * 
         * 
         * new Rule("^(.*)ar","1","éis"]},
         * 
         * new Rule("^(.*)(fa|ha|ten|pon|val)er","1",2,"gáis"), Rules.r("^(.*)aer","1","aigáis"]},
         * 
         * new Rule("^(.*)saber","1","sepáis"]},
         * 
         * new Rule("^(.*)(er|or|en|co)cer","1",2,"záis"), Rules.r("^(.*)(a|e|o)cer","1",2,"zcáis"]},
         * 
         * new Rule("^(.*)ger","1","jáis"]},
         * 
         * new Rule("^(.*)er","1","áis"]
         * 
         * new Rule("^(.*)ormir","1","urmáis"), Rules.r("^(.*)quir","1","cáis"), Rules.r("^(.*)venir","1","vengáis"]}, new
         * Rule("^(.*)decir","1","digáis"]},
         * 
         * new Rule("^(.*)vertir","1","virtáis"), Rules.r("^(.*)e(st|rv|nt|)ir","1","i",2,"áis"]}, new
         * Rule("^(.*)u(r|n|l)cir","1","u",2,"záis"]},
         * 
         * 
         * new Rule("^(.*)cir","1","zcáis"), Rules.r("^(.*)(m|p)edir","1",2,"idáis"]},
         * 
         * new Rule("^(.*)erir","1",""iráis"]},
         * 
         * new Rule("^(.*)asir","1","asgáis"), Rules.r("^(.*)e(m|t|nch|l|r|ñ)ir") //1,"i",2,"áis"]},
         * 
         * new Rule("^(.*)egir","1","ijáis"), Rules.r("^(.*)gir","1","jáis"), Rules.r("^(.*)nguir","1","ngáis"]}, new
         * Rule("^(.*)eguir","1","igáis"), Rules.r("^(.*)erguir","1","yergáis"), Rules.r("^(.*)oír","1","oigáis"]}, new
         * Rule("^(.*)(u|ü)ir","1","uyáis"), Rules.r("^(.*)ir","1","áis"]},
         * 
         * new Rule("^(.*)reír","1","riáis"]} //si el infinitivo es monosilabico la a no se acentua (riais) ] );
         * Verb.PRES_SUB_USTEDES "] = new VerbForm( Verb.PRES_SUB_YO"], { "dar","den" }, [ new Rule("^(.*)","1","n"]}, ] );
         * 
         * new VerbForm(Verb.PRES_SUB_ELLOS"] = Verb.PRES_SUB_USTEDES"];
         * 
         * Verb.FUT_SUB_YO"] = new VerbForm( Verb.PRET_IND_YO"], { "ser","fuere", "ir","fuere" }, [ new
         * Rule("^(.*)(uv|vin|íc|ic|up|ud|ub|s)e","1",2,"iere"), Rules.r("^(.*)(i|u)e","1",2,"are"]}, new Rule("^(.*)e","1",
         * "ere "), Rules.r("^(.*)ui","1","uyere"), Rules.r("^(.*)i","1","iere"]}, Rules.r("^(.*)gué","1","gare"), Rules.r("
         * ^(.*)qué","1","care"), Rules.r("^(.*)güé","1","guare"]}, Rules.r("^(.*)cé","1","zare"), Rules.r("
         * ^(.*)herí","1","hiriere"), Rules.r("^(.*)dormí","1","durmiere"]}, Rules.r("^(.*)orí","1","uriere"), Rules.r("
         * ^(.*)vertí","1","virtiere"]}, new Rule("^(.*)e(st|nt|nd|nch|rv|m|r|g|d|b|t)í","1","i",2,"iere"),
         * Rules.r("^(.*)(u|o|e|a)í","1",2,"yere"]}, new Rule("^(.*)üí","1","uyere"), Rules.r("^(.*)(ñ|ll)í","1",2,"ere"),
         * Rules.r("^(.*)í","1","iere"]}, new Rule("^(.*)é","1","are"]} ] );
         * 
         * new VerbForm(Verb.FUT_SUB_TU"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ new Rule("^(.*)","1","s"]}; ] };
         * 
         * new VerbForm(Verb.FUT_SUB_NOSOTROS"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ new Rule("^(.*)ere","1","éremos"]}, new
         * Rule("^(.*)are","1","áremos"]} ] );
         * 
         * new VerbForm(Verb.FUT_SUB_VOS"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ new Rule("^(.*)","1","is"]} ] );
         * 
         * 
         * 
         * new VerbForm(Verb.FUT_SUB_ELLOS"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ new Rule("^(.*)","1","n"]}; ] );
         * 
         * new VerbForm(Verb.CO_SUB_YO"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ new Rule("^(.*)e","1","a"]}; ] );
         */
        forms.put(Verb.CO_SUB_TU, new VerbForm(Verb.CO_SUB_TU, forms.get(Verb.CO_SUB_YO), Rules.r("^(.*)", "1", "s")));

        forms.put(Verb.CO_SUB_EL, new VerbForm(Verb.CO_SUB_EL, new VerbForm(Verb.CO_SUB_YO)));

        forms.put(Verb.CO_SUB_NOSOTROS, forms.get(Verb.CO_SUB_NOSOTROS));

        forms.put(Verb.FUT_SUB_NOSOTROS, new VerbForm(Verb.FUT_SUB_NOSOTROS, Rules.r("^(.*)emos", "1", "amos")));

        forms.put(Verb.CO_SUB_VOS, new VerbForm(Verb.CO_SUB_VOS, new VerbForm(Verb.CO_SUB_YO), Rules.r("^(.*)$", "1", "is")));

        forms.put(Verb.CO_SUB_ELLOS, new VerbForm(Verb.CO_SUB_ELLOS, new VerbForm(Verb.CO_SUB_YO), Rules.r("^(.*)$", "1", "n")));

        forms.put(Verb.PRES_IMP_TU,
                new VerbForm(Verb.PRES_IMP_TU, forms.get(Verb.PRES_IND_TU), Rules.e("ser", ""), Rules.e("dar", ""),
                        Rules.e("haber", ""), Rules.r("^(.*)ener$", "1", "én"), Rules.r("^(.*)oner", "1", "ón"),
                        Rules.r("^(.*)cer", "1", "az"), Rules.mr("^(.*)decir", "1", "dí"), Rules.mr("^(.*)venir", "1", "vén"),
                        Rules.r("^(.*)salir", "1", "sal"), Rules.r("^(.*)s$", "1")));

        forms.put(Verb.PRES_IMP_VOSEO, new VerbForm(Verb.PRES_IMP_VOSEO, Rules.e("ir", ""), Rules.mr("^(.*)r", "1")));

        forms.put(Verb.PRES_IMP_USTED, new VerbForm(Verb.PRES_IMP_USTED, forms.get(Verb.PRES_SUB_YO)));

        forms.put(Verb.PRES_IMP_VOS, new VerbForm(Verb.PRES_IMP_VOS, Rules.r("^(.*)r$", "1", "d")));

        forms.put(Verb.PRES_IMP_USTED, new VerbForm(Verb.PRES_IMP_USTED, Rules.r("^(.*)$", "1", "n")));
    }

    public Map<Verb, String> conjugate(String infinitive) {

        Map<Verb, String> result = forms.values().stream()
                .collect(Collectors.toMap(verbForm -> verbForm.getName(), verbForm -> verbForm.conjugate(infinitive)));

        result.put(Verb.INF, infinitive);
        return result;
    }
}
