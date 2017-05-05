package org.jasr.facundia.verbs;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.jasr.facundia.inflector.Utils;
import org.jasr.facundia.syllabes.Syllaber;
import org.jasr.facundia.verbs.conjugation.Exception;
import org.jasr.facundia.verbs.conjugation.Rule;

public class Conjugator {
    private Syllaber syllaber = new Syllaber();

    public boolean monosyllabic(String form) {
        syllaber.reset();
        return syllaber.divide(form).size() == 1;
    }

    public String removeAccentIfMonoSyllabic(String form) {
        return monosyllabic(form) ? Utils.INSTANCE.unaccented(form) : form;
    }

    private VerbForm[] verbForms = new VerbForm[] { new VerbForm(Verb.GER, new Exception("poder", "pudiendo"),
            new Exception("ir", "yendo"), new Exception("evertir", "everto"), new Exception("rendir", "rindiendo"),
            new Rule("^(.*)(ar)$", "1", "ando"), new Rule("^(.*)(ar)$", "1", "ando"),
            new Rule("^(.*)(a|o|e)(e|í)r$", "1", "2", "yendo"), new Rule("^(.*)ll(i|e)r$", "1", "llendo"),
            new Rule("^(.*)er$", "1", "iendo"), new Rule("^(.*)(m|p)edir$", "1", "2", "idiendo"),
            new Rule("^(.*)e(nch|rt|rgu|gu|m|nt|b|st|g|c|n|t|r|rv)ir$", "1", "i", "2", "iendo"),
            new Rule("^(.*)o(r|rm)ir$", "1", "u", "2", "iendo"), new Rule("^(.*)uir$", "uyendo"),
            new Rule("^(.*)ir$", "1", "iendo")),
    		
    	//	new VerbForm(Verb., new Exception("", ""), new Rule("^$", "1", "ando")),

    /*
     * new VerbForm(Verb.PART,
     * {"romper":"roto","ver":"visto","prever":"previsto","entrever":"entrevisto","antever":"antevisto"}, [
     * new Rule("^(.*)ar","1,"ado"]}, new Rule("^(.*)poner","1,"puesto"]}, new Rule("^(.*)olver","1,"uelto"]},
     * new Rule("^(.*)(h|f)acer","1,2,"echo"]}, new Rule("^(.*)(e|a|o)er","1,2,"ído"]},
     * new Rule("^(.*)pudrir","1,"podrido"]}, new Rule("^(.*)morir","1,"muerto"]}, new Rule("^(.*)ribir","1,"rito"]},
     * new Rule("^(.*)decir","1,"ito"]}, new Rule("^(.*)brir","1,"bierto"]}, new Rule("^(.*)ír","1,"ído"]},
     * new Rule("^(.*)(e|i)r","1,"ido"]} ] );
     * 
     * new VerbForm(Verb.PRES_IND_YO,
     * {"hendir":"hiendo","rendir":"rindo","rehundir":"rehúndo","evertir":"everto","reunir":"reúno",
     * "henchir":"hincho","rehenchir":"rehíncho","erguir":"yergo","ir":"voy","ser":"soy","haber":"he",
     * "caber":"quepo","mecer":"mezo","remecer":"remezo","pretender":"pretendo","hender":"hiendo",
     * "heder":"hiedo","defender":"defiendo","atrever":"atrevo","precaver":"precavo","airar":"aíro",
     * "ahitar":"ahíto","ahilar":"ahílo","rehilar":"rehílo","sobrehilar":"sobrehílo","amohinar":"amohíno",
     * "incensar":"incienso","desbecerrar":"desbecerro","soterrar":"soterro","ferrar":"fierro",
     * "manifestar":"manifiesto","estar":"estoy","aneblar":"anieblo","confesar":"confieso",
     * "adestrar":"adiestro","patiquebrar":"patiquebro","resolgar":"resolgo","avergonzar":"avergüenzo",
     * "desoldar":"desueldo","regoldar":"regüeldo","soldar":"sueldo","chollar":"chollo",
     * "descollar":"descuello","degollar":"degüello","entortar":"entuerto","soltar":"suelto",
     * "renovar":"renuevo","emporcar":"empuerco","desosar":"deshueso","tronar":"trueno",
     * "alforzar":"alforzo","almorzar":"almuerzo","ahincar":"ahínco","abuñolar":"abuñuelo",
     * "azolar":"azuelo","dedolar":"deduelo","desmajolar":"desmajuelo","escolar":"escuelo",
     * "recolar":"recuelo","trascolar":"trascuelo","sobresolar":"sobresuelo","solar":"suelo",
     * "subsolar":"subsuelo","denostar":"denuesto","apostar":"apuesto","ensangrentar":"ensangriento",
     * "accidentar":"accidento","tentar":"tiento","desatentar":"desatiento","retentar":"retiento",
     * "adormentar":"adormiento","escarmentar":"escarmiento","mentar":"miento","salpimentar":"salpimiento",
     * "sementar":"semiento","inventar":"invento","solventar":"solvento","alentar":"aliento",
     * "desalentar":"desaliento","violentar":"violento","sentar":"siento","vigiar":"vigío",
     * "miar":"mío","esquiar":"esquío","espiar":"espío","expiar":"expío","jipiar":"jipío","piar":"pío",
     * "pipiar":"pipío","fiar":"fío","porfiar":"porfío","desafiar":"desafío","arriar":"arrío",
     * "chirriar":"chirrío","descarriar":"descarrío","zurriar":"zurrío","enriar":"enrío",
     * "gloriar":"glorío","averiar":"averío","estriar":"estrío","triar":"trío","cariar":"carío",
     * "inventariar":"inventarío","contrariar":"contrarío","aviar":"avío","desviar":"avío",
     * "desaviar":"desavío","extraviar":"extravío","ansiar":"ansío","extasiar":"extasío","aliar":"alío",
     * "ampliar":"amplío","desliar":"deslío","liar":"lío","adiar":"adío","almadiar":"almadío",
     * "agorar":"agüero","engorar":"engüero","desaforar":"desafuero","encorar":"encuero",
     * "asonar":"asueno","consonar":"consueno","resonar":"resueno","sonar":"sueno","jugar":"juego",
     * "rogar":"ruego","regar":"riego","restregar":"restriego","sorregar":"sorriego","anegar":"anego",
     * "resolgar":"resolgo","amelar":"amelo"}, [ new Rule("^(.*)asir$/ ,array:[1,"asgo"]}, new Rule("^(.*)quir$/ ,array:[1,"co"]},
     * new Rule("^(.*)egir$/ ,array:[1,"ijo"]}, new Rule("^(.*)gir$/ ,array:[1,"jo"]}, new Rule("^(.*)ulcir$/ ,array:[1,"adulzo"]},
     * new Rule("^(.*)ucir$/ ,array:[1,"uzco"]}, new Rule("^(.*)emir$/ ,array:[1,"imo"]}, new Rule("^(.*)dormir$/ ,array:[1,"duermo"]},
     * new Rule("^(.*)orir$/ ,array:[1,"uero"]}, new Rule("^(.*)(e|i)rir$/ ,array:[1,"iero"]}, new Rule("^(.*)ohibir$/ ,array:[1,"ohíbo"]},
     * new Rule("^(.*)ebir$/ ,array:[1,"ibo"]}, new Rule("^(.*)cernir$/ ,array:[1,"cierno"]}, new Rule("^(.*)hervir$/ ,array:[1,"hiervo"]},
     * new Rule("^(.*)eñir$/ ,array:[1,"iño"]}, new Rule("^(.*)argüir$/ ,array:[1,"arguyo"]}, new Rule("^(.*)(p|m)edir$/ ,array:[1,2,"ido"]},
     * new Rule("^(.*)vertir$/ ,array:[1,"vierto"]}, new Rule("^(.*)etir$/ ,array:[1,"ito"]}, new Rule("^(.*)entir$/ ,array:[1,"iento"]},
     * new Rule("^(.*)estir$/ ,array:[1,"isto"]}, new Rule("^(.*)over$/ ,array:[1,"uevo"]}, new Rule("^(.*)olver$/ ,array:[1,"uelvo"]},
     * new Rule("^(.*)ver$/ ,array:[1,"veo"]}, new Rule("^(.*)saber$/ ,array:[1,"sé"]}, new Rule("^(.*)verter$/ ,array:[1,"vierto"]},
     * new Rule("^(.*)erder$/ ,array:[1,"ierdo"]}, new Rule("^(.*)o(rd|l)er$/ ,array:[1,"ue",2,"o"]}, new Rule("^(.*)querer$/
     * ,array:[1,"quiero"]}, new Rule("^(.*)erner$/ ,array:[1,"ierno"]}, new Rule("^(.*)(t|c)ender$/ ,array:[1,2,"iendo"]},
     * new Rule("^(.*)(ven|ten|pon|sal|val)er$/ ,array:[1,2,"go"]}, new Rule("^(.*)(tr|c)aer$/ ,array:[1,2,"aigo"]}, new Rule("^(.*)poder$/
     * ,array:[1,"puedo"]}, new Rule("^(.*)cocer$/ ,array:[1,"cuezo"]}, new Rule("^(.*)encer$/ ,array:[1,"enzo"]}, new Rule("^(.*)(f|h)acer$/
     * ,array:[1,2,"ago"]}, new Rule("^(.*)torcer$/ ,array:[1,"tuerzo"]}, new Rule("^(.*)ercer$/ ,array:[1,"erzo"]}, new Rule("^(.*)cer$/
     * ,array:[1,"zco"]}, new Rule("^(.*)ger$/ ,array:[1,"jo"]}, new Rule("^(.*)oír$/ ,array:[1,"oigo"]}, new Rule("^(.*)eír$/ ,array:[1,"ío"]},
     * new Rule("^(.*)desvaír$/ ,array:[1,"desvayo"]}, new Rule("^(.*)olgar$/ ,array:[1,"uelgo"]}, new Rule("^(.*)eguir$/ ,array:[1,"igo"]},
     * new Rule("^(.*)(c|n|s|pl|fr)egar$/ ,array:[1,2,"ciego"]},
     * new Rule("^(.*)(c|graf|gu|ch|j|conf|ist|cuant|hast|atav|env|cr|fr|var|sar|)iar$/ ,array:[1,2,"ío"]},
     * new Rule("^(.*)(d|ac|rec|sarm|cal|v|as)entar$/ ,array:[1,2,"iento"]}, new Rule("^(.*)(c|t)ostar$/ ,array:[1,2,"uesto"]},
     * new Rule("^(.*)(cons|v)olar$/ ,array:[1,2,"uelo"]}, new Rule("^(.*)(a|o)hijar$/ ,array:[1,2,"ahíjo"]}, new Rule("^(.*)aislar$/
     * ,array:[1,"aíslo"]}, new Rule("^(.*)(m|p)oblar$/ ,array:[1,2,"ueblo"]}, new Rule("^(.*)(tr|cl|fl|ll)ocar$/ ,array:[1,2,"ueco"]},
     * new Rule("^(.*)higar$/ ,array:[1,"hígo"]}, new Rule("^(.*)forzar
     * "$/                                                         ,array:[1,"fuerzo"]}, new Rule("^(.*)cornar$/ ,array:[1,"cuerno"]},
     * new Rule("^(.*)mostrar$/ ,array:[1,"muestro"]}, new Rule("^(.*)probar$/ ,array:[1,"pruebo"]}, new Rule("^(.*)volcar$/
     * ,array:[1,"vuelco"]}, new Rule("^(.*)(atr|dis|etr)onar$/ ,array:[1,2,"ueno"]}, new Rule("^(.*)grosar$/ ,array:[1,"grueso"]},
     * new Rule("^(.*)ontrar$/ ,array:[1,"uentro"]}, new Rule("^(.*)ro(g|d)ar$/ ,array:[1,"rue",2,"o"]}, new Rule("^(.*)olgar$/
     * ,array:[1,"uelgo"]}, new Rule("^(.*)soñar$/ ,array:[1,"sueño"]}, new Rule("^(.*)contar$/ ,array:[1,"cuento"]}, new Rule("^(.*)(s|h)ollar$/
     * ,array:[1,2,"uello"]}, new Rule("^(.*)(c|p)ertar$/ ,array:[1,2,"ierto"]}, new Rule("^(.*)apretar$/ ,array:[1,"aprieto"]},
     * new Rule("^(.*)(ap|ep|s|gob|f)ernar$/ ,array:[1,2,"ierno"]}, new Rule("^(.*)(s|n)egar$/ ,array:[1,2,"iego"]}, new Rule("^(.*)avesar
     * "$/                                                         ,array:[1,"avieso"]}, new Rule("^(.*)(m|h)elar$/
     * ,array:[1,2,"ielo"]}, new Rule("^(.*)herbar$/ ,array:[1,"hierbo"]}, new Rule("^(.*)pedrar$/ ,array:[1,"piedro"]}, new Rule("^(.*)lendrar$/
     * ,array:[1,"liendro"]}, new Rule("^(.*)pezar$/ ,array:[1,"piezo"]}, new Rule("^(.*)hestar$/ ,array:[1,"hiesto"]}, new Rule("^(.*)nevar$/
     * ,array:[1,"nievo"]}, new Rule("^(.*)(s|c|r|h)errar$/ ,array:[1,2,"ierro"]}, new Rule("^(.*)(m|l)enzar$/ ,array:[1,2,"ienzo"]},
     * new Rule("^(.*)pensar$/ ,array:[1,"pienso"]}, new Rule("^(.*)emblar$/ ,array:[1,"iemblo"]}, new Rule("^(.*)sembrar$/
     * ,array:[1,"siembro"]}, new Rule("^(.*)quebrar$/ ,array:[1,"quiebro"]}, new Rule("^(.*)uar$/ ,array:[1,"úo"]},
     * new Rule("^(.*)ahu(m|s|ch)ar$/ ,array:[1,"ahú",2,"o"]}, new Rule("^(.*)ehusar$/ ,array:[1,"ehúso"]}, new Rule("^(.*)au(n|p|l|ll)ar$/
     * ,array:[1,2,"o"]}, new Rule("^(.*)jugar$/ ,array:[1,"juego"]}, new Rule("^(.*)euntar$/ ,array:[1,"eúnto"]}, new Rule("^(.*)aillar$/
     * ,array:[1,"aíllo"]}, new Rule("^(.*)(sa|oh|cafe)inar$/ ,array:[1,2,"íno"]}, new Rule("^(.*)(a|e)izar$/ ,array:[1,2,"ízo"]},
     * new Rule("^(.*)dar$/ ,array:[1,"doy"]}, new Rule("^(.*)(a|e|i)r$/ ,array:[1,"o"]} ]); Verb.PRES_IND_TU"] = new VerbForm(
     * new VerbForm(Verb.PRES_IND_YO"],
     * {"ser":"eres","remecer":"remeces","mecer":"meces","estar":"estás","desvaír":"desvaes","ir":"vas","dar":"das","desdar":
     * "desdás","caber":"cabes","ver":"ves"}, [ new Rule("^(.*)(ger|gir)","1,"ges"]}, new Rule("^(.*)saber","1,"sabes"]},
     * new Rule("^(.*)(asir|salir|poner|valer)","1,"es"]}}, new Rule("^(.*)(tr|c)aer|aer","1,"es"]},
     * new Rule("^(.*)decir","1,"ces"]}, new Rule("^(.*)oír","1,"yes"]}, new Rule("^(.*)quir","1,"ques"]},
     * new Rule("^(.*)guir","1,"gues"]}, new Rule("^(.*)(cer|ucir)","1,"ces"]}, new Rule("^(.*)cir","1,"ces"]},
     * new Rule("^(.*)ver","1,"és"]}, new Rule("^(.*)(venir|tener)","1,"ienes"]}, new Rule("^(.*)","1,"es"]}} ] );
     * 
     * new VerbForm(Verb.PRES_IND_VOSEO, { haber, ir }, [ new Rule("^(.*)(i|í)r","1,"ís"]},
     * new Rule("^(.*)er","1,"és"]}, new Rule("^(.*)ar","1,"ás"]} //quitar el acento si el resultado es monosilabico ] );
     * 
     * new VerbForm(Verb.PRES_IND_VOS"] = new VerbForm( Verb.PRES_IND_VOSEO"], {}, [ new Rule("^(.*)uir","1,"is"],root:Verb.INF"]}
     * //TODO: solo aplica a monosilabicos new Rule("^(.*)(a|á|e|é)s","1,2,"is"]} new Rule("^(.*)","1]}, ] );
     * 
     * new VerbForm(Verb.PRES_IND_EL"] = Verb.PRES_IND_TU"];
     * 
     * new VerbForm(Verb.PRES_IND_NOSOTROS, { "ser":"somos", "haber":"hemos", "ir":"vamos" }, [
     * new Rule("^(.*)r","1,"mos"]} ] );
     * 
     * new VerbForm(Verb.PRES_IND_USTEDES"] = new VerbForm( Verb.PRES_IND_EL"], { "ser":"son" }, [ new Rule("^(.*)","1,"n"]} ] );
     * 
     * new VerbForm(Verb.PRES_IND_ELLOS"] = Verb.PRES_IND_USTEDES"];
     * 
     * new VerbForm(Verb.COP_IND_YO, { "ser":"era", "ir":"iba" }, [ new Rule("^(.*)ar","1,"aba"]},
     * new Rule("^(.*)ver","1,"veía"]}, new Rule("^(.*)(e|i)r","1,"ía"]}, ] );
     * 
     * new VerbForm(Verb.COP_IND_TU"] = new VerbForm( Verb.COP_IND_YO"], {}, [ new Rule("^(.*)","1,"s"]} ] );
     * 
     * new VerbForm(Verb.COP_IND_EL"] = Verb.COP_IND_YO"];
     * 
     * new VerbForm(Verb.COP_IND_NOSOTROS"] = new VerbForm( Verb.COP_IND_YO"], { "ser":"", "ir":"" }, [
     * new Rule("^(.*)aba","1,"ábamos"]}, new Rule("^(.*)","1,"mos"]} ] );
     * 
     * new VerbForm(Verb.COP_IND_VOS"] = new VerbForm( Verb.COP_IND_YO"], {}, [ new Rule("^(.*)","1,"is"]} ] );
     * 
     * new VerbForm(Verb.COP_IND_ELLOS"] = new VerbForm( Verb.COP_IND_YO"], {}, [ new Rule("^(.*)","1,"n"]} ] ); /* Verb.PRET_IND_YO"]
     * = new VerbForm( null, { "dar":"di", "andar":"anduve", "desandar":"desanduve", "ser":"fui", "ver":"vi", "caber":"quepo",
     * "haber":"hube", "contrahacer":"contrahíce", "ir":"fui" }, [ new Rule("^(.*)gar","1,"gué"]},
     * new Rule("^(.*)guar","1,"güé"]}, new Rule("^(.*)zar","1,"cé"]}, new Rule("^(.*)car","1,"qué"]},
     * 
     * && this.INF.endsWith("ar") // && this.INF.substring(0,this.INF.length-2) + "é" != this.PRET_IND_YO // sin tilde si es
     * monosilabico
     * 
     * 
     * new Rule("^(.*)ducir","1,"duje"]}, new Rule("^(.*)ecir","1,"ije"]}, new Rule("^(.*)venir","1,"vine"]}, &&
     * this.INF.endsWith("ir") && this.INF.substring(0,this.INF.length-2) + "í" != this.PRET_IND_YO// sin tilde si es monosilabico
     * 
     * 
     * new Rule("^(.*)tener","1,"tuve"]}, new Rule("^(.*)saber","1,"supe"]}, new Rule("^(.*)poder","1,"pude"]},
     * new Rule("^(.*)poner","1,"puse"]}, new Rule("^(.*)traer","1,"traje"]}, new Rule("^(.*)querer","1,"quise"]},
     * new Rule("^(.*)(h|f)acer","1,2,"hice"]}
     * 
     * new Rule("^(.*)er") //   && this.INF.substring(0,this.INF.length-2) + "í" != this.PRET_IND_YO ] );
     * 
     */
    /*
     * new VerbForm(Verb.PRET_IND_TU"] = new VerbForm( Verb.PRET_IND_YO"], {"contrahacer":"contrahiciste"}, [
     * new Rule("^(.*)(a|e|o)í","1,2,"íste"] new Rule("^(.*)í","1,"iste"]}, new Rule("^(.*)cé","1,"zaste"]},
     * new Rule("^(.*)gué","1,"gaste"]}, new Rule("^(.*)qué","1,"caste"]}, new Rule("^(.*)güé","1,"guaste"]},
     * new Rule("^(.*)é","1,"aste"]}, new Rule("^(.*)(i|u)e","1,2,"aste"]}, new Rule("^(.*)(e|i)","1,2,"iste"]} ] );
     * 
     * new VerbForm(Verb.PRET_IND_VOSEO"] = Verb.PRET_IND_TU"];
     * 
     * new VerbForm(Verb.PRET_IND_VOS"] = new VerbForm( Verb.PRET_IND_TU"], {}, [ new Rule("^(.*)","1,"is"]} ] );
     * 
     * new VerbForm(Verb.PRET_IND_EL"] = new VerbForm( Verb.PRET_IND_TU"], { "ser":"fue" "ir":"fue", "rendir":"rindió",
     * "contrahacer":"contrahízo", "gemir":"gimió", "caber":"cupo", "reír":"rio", "freír":"frio", "ver":"vio", "prever":"previo",
     * "haber":"hubo", "poder":"pudo", "dar":"dio" }, [ new Rule("^(.*)aste","1,"ó"]}, //si monosilabico, se quita el acento
     * new Rule("^(.*)(g|q)uiste","1,2,"uió"]}, new Rule("^(.*)(ui|üi|í)ste","1,"yó"]},
     * new Rule("^(.*)(uv|j|vin|pus|quis)iste","1,2,"o"]}, new Rule("^(.*)iciste","1,"izo"]},
     * new Rule("^(.*)ciste","1,"ió"]}, new Rule("^(.*)(ll|ñ)iste","1,2,"ó"]},
     * new Rule("^(.*)e(r|t|nt|st|g|d|b|nch|rv|rt)iste","1,"i",2,"ió"]}, new Rule("^(.*)vertiste","1,"virtió"]},
     * new Rule("^(.*)ormiste","1,"urmió"]}, new Rule("^(.*)moriste","1,"murió"]}, new Rule("^(.*)supiste","1,"supo"]},
     * new Rule("^(.*)iste","1,"ió"]} ] };
     * 
     * new VerbForm(Verb.PRET_IND_NOSOTROS"] = new VerbForm( Verb.PRET_IND_TU"], {}, [ new Rule("^(.*)ste","1,"mos"]} ] );
     * 
     * 
     * new VerbForm(Verb.PRET_IND_USTEDES, { "ser":"fueron", "ir":"fueron", "desdar":"desdieron" }, [
     * new Rule("^(.*)venir$/ -> quitar venir, sustituir por vinieron new Rule("^(.*)ar$/ && this.PRET_IND_EL.endsWith("o") ->
     * this.PRET_IND_ELLOS.endsWith("ieron") new Rule("^(.*)ar$/ && this.PRET_IND_EL.endsWith("ó") ->
     * this.PRET_IND_ELLOS.endsWith("aron") new Rule("^(.*)ar$/, es monosilabico y && this.PRET_IND_EL.endsWith("o") ->
     * this.PRET_IND_ELLOS.endsWith("aron") //
     * 
     * 
     * new Rule("^(.*)ir$/ && !this.PRET_IND_EL.endsWith("ó") //&& this.PRET_IND_ELLOS.endsWith("eron") new Rule("^(.*)ir$/ &&
     * this.PRET_IND_EL.endsWith("o") //&& this.PRET_IND_ELLOS.endsWith("eron")
     * 
     * new Rule("^(.*)er$/ && this.PRET_IND_EL.endsWith("o") && !this.PRET_IND_ELLOS.endsWith("ieron") new Rule("^(.*)er$/ &&
     * this.PRET_IND_EL.endsWith("jo") && !this.PRET_IND_ELLOS.endsWith("jeron") new Rule("^(.*)er$/ && this.PRET_IND_EL.endsWith("ó")
     * && this.PRET_IND_ELLOS.endsWith("eron") ] );
     * 
     * new VerbForm(Verb.PRET_IND_ELLOS"] = Verb.PRET_IND_USTEDES"];
     * 
     * new VerbForm(Verb.FUT_IND_YO"] = new VerbForm( { "ir":"é", "bendecir":"bendeciré", "maldecir":"maldeciré" }, [
     * new Rule("^(.*)(ten|pon|val)er","1,2,"dré"]}, new Rule("^(.*)(ha|fa)cer","1,2,"ré"]},
     * new Rule("^(.*)(pod|quer|sab|cab|hab)er","1,2,"ré"]}, new Rule("^(.*)(sal|ven)ir","1,2,"dré"]},
     * new Rule("^(.*)decir","1,"diré"]}, new Rule("^(.*)ír","1,"iré"]}, new Rule("^(.*)","1,"é"]} ] );
     * 
     * new VerbForm(Verb.FUT_IND_TU"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ new Rule("^(.*)é","1,"ás"]} ] );
     * 
     * new VerbForm(Verb.FUT_IND_VOS"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ new Rule("^(.*)","1,"is"]} ] );
     * 
     * 
     * new VerbForm(Verb.FUT_IND_EL"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ new Rule("^(.*)é","1,"á"]} ] );
     * 
     * new VerbForm(Verb.FUT_IND_NOSOTROS"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ new Rule("^(.*)é","1,"emos"]} ] );
     * 
     * new VerbForm(Verb.FUT_IND_ELLOS"] = new VerbForm( Verb.FUT_IND_EL"], {}, [ new Rule("^(.*)","1,"n"]} ] );
     * 
     * new VerbForm(Verb.POS_IND_YO, {}, [ new Rule("^(.*)ar","1,"ía"]},
     * 
     * new Rule("^(.*)(ten|pon|val|po)er","1,2,"dría"]}, new Rule("^(.*)(querer","1,2,"querría"]},
     * new Rule("^(.*)(h|f)acer","1,2,"ría"]}, new Rule("^(.*)(c|h|s)aber","1,2,"abría"]}, new Rule("^(.*)er","1,"ía"]},
     * 
     * new Rule("^(.*)(ven|sal)ir","1,2,"dría"]}, new Rule("^(.*)decir","1,"diría"]},
     * new Rule("^(.*)enserir","1,"enseriaría"]}, new Rule("^(.*)ir","1,"ía"]}, ] );
     * 
     * new VerbForm(Verb.POS_IND_TU"] = new VerbForm( Verb.POS_IND_YO"], {}, [ new Rule("^(.*)","1,"s"]} ] );
     * 
     * new VerbForm(Verb.POS_IND_VOSEO"] = Verb.POS_IND_TU"];
     * 
     * new VerbForm(Verb.POS_IND_VOS"] = new VerbForm( Verb.POS_IND_YO"], {}, [ new Rule("^(.*)ía","1,"íais"]} ] );
     * 
     * new VerbForm(Verb.POS_IND_EL"] = Verb.POS_IND_YO"];
     * 
     * 
     * new VerbForm(Verb.POS_IND_NOSOTROS"] = new VerbForm( Verb.POS_IND_YO"], {}, [ new Rule("^(.*)","1,"mos"]} ] );
     * 
     * new VerbForm(Verb.POS_IND_USTEDES"] = Verb.PRET_IND_ELLOS"];
     * 
     * 
     * new VerbForm(Verb.POS_IND_ELLOS"] = new VerbForm( Verb.POS_IND_YO"], {}, [ new Rule("^(.*)","1,"n"]} ] );
     * 
     * new VerbForm(Verb.PRES_SUB_YO"] = new VerbForm( Verb.PRES_IND_YO"], { "ser":"sea", "ir":"vaya", "enserir":"enserie" }, [
     * new Rule("^(.*)","1,"n"]}
     * 
     * new Rule("^(.*)oy","1,"é"]}, new Rule("^(.*)go","1,"gue"]}, new Rule("^(.*)zo","1,"ce"]},
     * new Rule("^(.*)co","1,"que"]}, new Rule("^(.*)guo","1,"güe"]},
     * 
     * && INF terminar ar y new Rule("^(.*)o") -> PRES_IND_YO quitar o, e
     * 
     * && INF terminar er o ir y this.PRES_IND_YO.endsWith("o") -> PRES_IND_YO quitar o, a
     * 
     * ] );
     * 
     * new VerbForm(Verb.PRES_SUB_TU"] = new VerbForm( Verb.PRES_SUB_YO"], {"dar":""}, new Rule("^(.*)","1]} ] );
     * new VerbForm(Verb.PRES_SUB_NOSOTROS, { "ser":"seamos", "haber":, "caber":"quepamos", "desvaír":"desvayamos",
     * "ir":"vayamos", "mecer":"mezamos", "remecer":"remezamos", "antever":"anteveamos", "entrever":"entreveamos",
     * "prever":"preveamos", "trasver":"trasveamos", "ver":"veamos" }, [ new Rule("^(.*)gar","1,"guemos"]},
     * new Rule("^(.*)zar","1,"cemos"]}, new Rule("^(.*)car","1,"quemos"]}, new Rule("^(.*)guar","1,"güemos"]},
     * new Rule("^(.*)ar","1,"emos"]},
     * 
     * new Rule("^(.*)(ten|pon|val)er","1,2,"gamos"]},
     * 
     * new Rule("^(.*)(c|tr)aer","1,2,"aigamos"]},
     * 
     * new Rule("^(.*)saber","1,"sepamos"]},
     * 
     * new Rule("^(.*)ger","1,"jamos"]}, new Rule("^(.*)cocer","1,"cozamos"]},
     * 
     * new Rule("^(.*)cer","1,"zcamos" new Rule("^(.*)er","1,"amos"
     * 
     * new Rule("^(.*)oír","1,"oigamos"]}, new Rule("^(.*)eír","1,"iamos"]},
     * 
     * new Rule("^(.*)dormir","1,"durmamos"]}, new Rule("^(.*)orir","1,"uramos"]}, new Rule("^(.*)gir","1,"jamos"]},
     * new Rule("^(.*)(u|ü)ir","1,"uyamos"]}, new Rule("^(.*)vertir","1,"virtamos"]},
     * new Rule("^(.*)(as|ven|sal)ir","1,2,"gamos"]}, new Rule("^(.*)decir","1,"digamos"]},
     * new Rule("^(.*)ucir","1,"uzcamos"]}, new Rule("^(.*)cir","1,"zamos"]},
     * 
     * new Rule("^(.*)e(g|r|rv|gr|st|t|b|d|ñ|nt|m|end|nch)ir","1,"i",2,"amos"]}, ] );
     * 
     * 
     * new VerbForm(Verb.PRES_SUB_VOS, { "dar":"deis", "ir":"vayáis", "desleír":"desliáis", "desvaír":"desvayáis",
     * "ser":"seáis", "caber":"quepáis", "haber":"hayáis", "enserir":"enseráis", "evertir":"evertáis", "rendir":"rindáis" }, [
     * new Rule("^(.*)gar","1,"guéis"]}, new Rule("^(.*)zar","1,"céis"]}, new Rule("^(.*)car","1,"quéis"]},
     * new Rule("^(.*)guar","1,"güéis"]}, new Rule("^(.*)iar","1,"iéis"]},// si es monosilabico la e no se acentua
     * 
     * 
     * new Rule("^(.*)ar","1,"éis"]},
     * 
     * new Rule("^(.*)(fa|ha|ten|pon|val)er","1,2,"gáis"]}, new Rule("^(.*)aer","1,"aigáis"]},
     * 
     * new Rule("^(.*)saber","1,"sepáis"]},
     * 
     * new Rule("^(.*)(er|or|en|co)cer","1,2,"záis"]}, new Rule("^(.*)(a|e|o)cer","1,2,"zcáis"]},
     * 
     * new Rule("^(.*)ger","1,"jáis"]},
     * 
     * new Rule("^(.*)er","1,"áis"]
     * 
     * new Rule("^(.*)ormir","1,"urmáis"]}, new Rule("^(.*)quir","1,"cáis"]}, new Rule("^(.*)venir","1,"vengáis"]},
     * new Rule("^(.*)decir","1,"digáis"]},
     * 
     * new Rule("^(.*)vertir","1,"virtáis"]}, new Rule("^(.*)e(st|rv|nt|)ir","1,"i",2,"áis"]},
     * new Rule("^(.*)u(r|n|l)cir","1,"u",2,"záis"]},
     * 
     * 
     * new Rule("^(.*)cir","1,"zcáis"]}, new Rule("^(.*)(m|p)edir","1,2,"idáis"]},
     * 
     * new Rule("^(.*)erir","1,""iráis"]},
     * 
     * new Rule("^(.*)asir","1,"asgáis"]}, new Rule("^(.*)e(m|t|nch|l|r|ñ)ir") //1,"i",2,"áis"]},
     * 
     * new Rule("^(.*)egir","1,"ijáis"]}, new Rule("^(.*)gir","1,"jáis"]}, new Rule("^(.*)nguir","1,"ngáis"]},
     * new Rule("^(.*)eguir","1,"igáis"]}, new Rule("^(.*)erguir","1,"yergáis"]}, new Rule("^(.*)oír","1,"oigáis"]},
     * new Rule("^(.*)(u|ü)ir","1,"uyáis"]}, new Rule("^(.*)ir","1,"áis"]},
     * 
     * new Rule("^(.*)reír","1,"riáis"]} //si el infinitivo es monosilabico la a no se acentua (riais) ] );
     * Verb.PRES_SUB_USTEDES"] = new VerbForm( Verb.PRES_SUB_YO"], { "dar":"den" }, [ new Rule("^(.*)","1,"n"]}, ] );
     * 
     * new VerbForm(Verb.PRES_SUB_ELLOS"] = Verb.PRES_SUB_USTEDES"];
     * 
     * Verb.FUT_SUB_YO"] = new VerbForm( Verb.PRET_IND_YO"], { "ser":"fuere", "ir":"fuere" }, [
     * new Rule("^(.*)(uv|vin|íc|ic|up|ud|ub|s)e","1,2,"iere"]}, new Rule("^(.*)(i|u)e","1,2,"are"]},
     * new Rule("^(.*)e","1,"ere"]}, new Rule("^(.*)ui","1,"uyere"]}, new Rule("^(.*)i","1,"iere"]},
     * new Rule("^(.*)gué","1,"gare"]}, new Rule("^(.*)qué","1,"care"]}, new Rule("^(.*)güé","1,"guare"]},
     * new Rule("^(.*)cé","1,"zare"]}, new Rule("^(.*)herí","1,"hiriere"]}, new Rule("^(.*)dormí","1,"durmiere"]},
     * new Rule("^(.*)orí","1,"uriere"]}, new Rule("^(.*)vertí","1,"virtiere"]},
     * new Rule("^(.*)e(st|nt|nd|nch|rv|m|r|g|d|b|t)í","1,"i",2,"iere"]}, new Rule("^(.*)(u|o|e|a)í","1,2,"yere"]},
     * new Rule("^(.*)üí","1,"uyere"]}, new Rule("^(.*)(ñ|ll)í","1,2,"ere"]}, new Rule("^(.*)í","1,"iere"]},
     * new Rule("^(.*)é","1,"are"]} ] );
     * 
     * new VerbForm(Verb.FUT_SUB_TU"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ new Rule("^(.*)","1,"s"]}; ] };
     * 
     * new VerbForm(Verb.FUT_SUB_NOSOTROS"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ new Rule("^(.*)ere","1,"éremos"]},
     * new Rule("^(.*)are","1,"áremos"]} ] );
     * 
     * new VerbForm(Verb.FUT_SUB_VOS"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ new Rule("^(.*)","1,"is"]} ] );
     * 
     * 
     * 
     * new VerbForm(Verb.FUT_SUB_ELLOS"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ new Rule("^(.*)","1,"n"]}; ] );
     * 
     * new VerbForm(Verb.CO_SUB_YO"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ new Rule("^(.*)e","1,"a"]}; ] );
     * 
     * new VerbForm(Verb.CO_SUB_TU"] = new VerbForm( Verb.CO_SUB_YO"], {}, [ new Rule("^(.*)","1,"s"]}; ] );
     */ 
      new VerbForm(Verb.CO_SUB_EL,new VerbForm(Verb.CO_SUB_YO)),
     /* 
     * new VerbForm(Verb.CO_SUB_NOSOTROS"] = new VerbForm(
     */ 
      new VerbForm(Verb.FUT_SUB_NOSOTROS, new Rule("^(.*)emos","1","amos")),
     /* 
     * new VerbForm(Verb.CO_SUB_VOS"] = new VerbForm( Verb.CO_SUB_YO"], {}, [ new Rule("^(.*)","1,"is"]}; ] );
     * 
     * new VerbForm(Verb.CO_SUB_ELLOS"] = new VerbForm( Verb.CO_SUB_YO"], {}, [ new Rule("^(.*)","1,"n"]}; ] );
     * 
     * new VerbForm(Verb.PRES_IMP_TU, { "ser":"", "dar":"", "haber":"" }, [
     * 
     * new Rule("^(.*)ener","1,"én"]}, new Rule("^(.*)oner","1,"ón"]}, new Rule("^(.*)cer","1,"az"]},
     * new Rule("^(.*)decir","1,"dí"]}, //Si el resultado es monosilabico, se quita la tilde (di)
     * new Rule("^(.*)venir","1,"vén"]},//Si el resultado es monosilabico, se quita la tilde (ven)
     * new Rule("^(.*)salir","1,"sal"]}, new Rule("^(.*)s","1],root:Verb.PRES_IND_TU"]} ] );
     * 
     * new VerbForm(Verb.PRES_IMP_VOSEO, { "ir":"" }, [ new Rule("^(.*)r","1]} //Si el resultado es multisilabico,
     * acentuar la ultima letra. ] );
     */  
      new VerbForm(Verb.PRES_IMP_USTED,new VerbForm(Verb.PRES_SUB_YO)),
     
      new VerbForm(Verb.PRES_IMP_VOS,  new Rule("^(.*)r$","1","d")),
     
     new VerbForm( Verb.PRES_IMP_USTED, new Rule("^(.*)$","1","n"))
    };
    
    public Map<Verb,String> conjugate(String infinitive) {
        
        Map<Verb,String> result = Arrays.stream(verbForms).collect(Collectors.toMap(verbForm -> verbForm.getName(), verbForm -> verbForm.conjugate(infinitive)));;
        result.put(Verb.INF, infinitive);
        return result;
    }
}
