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

    /*
     * 
     * Verb.GER"] = new VerbForm( [ {re:/^(.*)(a|o|e)(e|í)r$/,array:[1,2,"yendo"]}, {re:/^(.*)ll(i|e)r$/,array:[1,"llendo"]},
     * {re:/^(.*)er$/,array:[1,"iendo"]}, {re:/^(.*)(m|p)edir$/,array:[1,2,"idiendo"]},
     * {re:/^(.*)e(nch|rt|rgu|gu|m|nt|b|st|g|c|n|t|r|rv)ir$/,array:[1,"i",2,"iendo"]},
     * {re:/^(.*)o(r|rm)ir$/,array:[1,"u",2,"iendo"]}, {re:/^(.*)uir$/,array:["uyendo"]}, {re:/^(.*)ir$/,array:[1,"iendo"]} ] );
     * Verb.PART"] = new VerbForm( null,
     * {"romper":"roto","ver":"visto","prever":"previsto","entrever":"entrevisto","antever":"antevisto"}, [
     * {re:/^(.*)ar$/,array:[1,"ado"]}, {re:/^(.*)poner$/,array:[1,"puesto"]}, {re:/^(.*)olver$/,array:[1,"uelto"]},
     * {re:/^(.*)(h|f)acer$/,array:[1,2,"echo"]}, {re:/^(.*)(e|a|o)er$/,array:[1,2,"ído"]},
     * {re:/^(.*)pudrir$/,array:[1,"podrido"]}, {re:/^(.*)morir$/,array:[1,"muerto"]}, {re:/^(.*)ribir$/,array:[1,"rito"]},
     * {re:/^(.*)decir$/,array:[1,"ito"]}, {re:/^(.*)brir$/,array:[1,"bierto"]}, {re:/^(.*)ír$/,array:[1,"ído"]},
     * {re:/^(.*)(e|i)r$/,array:[1,"ido"]} ] );
     * 
     * Verb.PRES_IND_YO"] = new VerbForm( null,
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
     * "resolgar":"resolgo","amelar":"amelo"}, [ {re:/^(.*)asir$/ ,array:[1,"asgo"]}, {re:/^(.*)quir$/ ,array:[1,"co"]},
     * {re:/^(.*)egir$/ ,array:[1,"ijo"]}, {re:/^(.*)gir$/ ,array:[1,"jo"]}, {re:/^(.*)ulcir$/ ,array:[1,"adulzo"]},
     * {re:/^(.*)ucir$/ ,array:[1,"uzco"]}, {re:/^(.*)emir$/ ,array:[1,"imo"]}, {re:/^(.*)dormir$/ ,array:[1,"duermo"]},
     * {re:/^(.*)orir$/ ,array:[1,"uero"]}, {re:/^(.*)(e|i)rir$/ ,array:[1,"iero"]}, {re:/^(.*)ohibir$/ ,array:[1,"ohíbo"]},
     * {re:/^(.*)ebir$/ ,array:[1,"ibo"]}, {re:/^(.*)cernir$/ ,array:[1,"cierno"]}, {re:/^(.*)hervir$/ ,array:[1,"hiervo"]},
     * {re:/^(.*)eñir$/ ,array:[1,"iño"]}, {re:/^(.*)argüir$/ ,array:[1,"arguyo"]}, {re:/^(.*)(p|m)edir$/ ,array:[1,2,"ido"]},
     * {re:/^(.*)vertir$/ ,array:[1,"vierto"]}, {re:/^(.*)etir$/ ,array:[1,"ito"]}, {re:/^(.*)entir$/ ,array:[1,"iento"]},
     * {re:/^(.*)estir$/ ,array:[1,"isto"]}, {re:/^(.*)over$/ ,array:[1,"uevo"]}, {re:/^(.*)olver$/ ,array:[1,"uelvo"]},
     * {re:/^(.*)ver$/ ,array:[1,"veo"]}, {re:/^(.*)saber$/ ,array:[1,"sé"]}, {re:/^(.*)verter$/ ,array:[1,"vierto"]},
     * {re:/^(.*)erder$/ ,array:[1,"ierdo"]}, {re:/^(.*)o(rd|l)er$/ ,array:[1,"ue",2,"o"]}, {re:/^(.*)querer$/
     * ,array:[1,"quiero"]}, {re:/^(.*)erner$/ ,array:[1,"ierno"]}, {re:/^(.*)(t|c)ender$/ ,array:[1,2,"iendo"]},
     * {re:/^(.*)(ven|ten|pon|sal|val)er$/ ,array:[1,2,"go"]}, {re:/^(.*)(tr|c)aer$/ ,array:[1,2,"aigo"]}, {re:/^(.*)poder$/
     * ,array:[1,"puedo"]}, {re:/^(.*)cocer$/ ,array:[1,"cuezo"]}, {re:/^(.*)encer$/ ,array:[1,"enzo"]}, {re:/^(.*)(f|h)acer$/
     * ,array:[1,2,"ago"]}, {re:/^(.*)torcer$/ ,array:[1,"tuerzo"]}, {re:/^(.*)ercer$/ ,array:[1,"erzo"]}, {re:/^(.*)cer$/
     * ,array:[1,"zco"]}, {re:/^(.*)ger$/ ,array:[1,"jo"]}, {re:/^(.*)oír$/ ,array:[1,"oigo"]}, {re:/^(.*)eír$/ ,array:[1,"ío"]},
     * {re:/^(.*)desvaír$/ ,array:[1,"desvayo"]}, {re:/^(.*)olgar$/ ,array:[1,"uelgo"]}, {re:/^(.*)eguir$/ ,array:[1,"igo"]},
     * {re:/^(.*)(c|n|s|pl|fr)egar$/ ,array:[1,2,"ciego"]},
     * {re:/^(.*)(c|graf|gu|ch|j|conf|ist|cuant|hast|atav|env|cr|fr|var|sar|)iar$/ ,array:[1,2,"ío"]},
     * {re:/^(.*)(d|ac|rec|sarm|cal|v|as)entar$/ ,array:[1,2,"iento"]}, {re:/^(.*)(c|t)ostar$/ ,array:[1,2,"uesto"]},
     * {re:/^(.*)(cons|v)olar$/ ,array:[1,2,"uelo"]}, {re:/^(.*)(a|o)hijar$/ ,array:[1,2,"ahíjo"]}, {re:/^(.*)aislar$/
     * ,array:[1,"aíslo"]}, {re:/^(.*)(m|p)oblar$/ ,array:[1,2,"ueblo"]}, {re:/^(.*)(tr|cl|fl|ll)ocar$/ ,array:[1,2,"ueco"]},
     * {re:/^(.*)higar$/ ,array:[1,"hígo"]}, {re:/^(.*)forzar
     * "$/                                                         ,array:[1,"fuerzo"]}, {re:/^(.*)cornar$/ ,array:[1,"cuerno"]},
     * {re:/^(.*)mostrar$/ ,array:[1,"muestro"]}, {re:/^(.*)probar$/ ,array:[1,"pruebo"]}, {re:/^(.*)volcar$/
     * ,array:[1,"vuelco"]}, {re:/^(.*)(atr|dis|etr)onar$/ ,array:[1,2,"ueno"]}, {re:/^(.*)grosar$/ ,array:[1,"grueso"]},
     * {re:/^(.*)ontrar$/ ,array:[1,"uentro"]}, {re:/^(.*)ro(g|d)ar$/ ,array:[1,"rue",2,"o"]}, {re:/^(.*)olgar$/
     * ,array:[1,"uelgo"]}, {re:/^(.*)soñar$/ ,array:[1,"sueño"]}, {re:/^(.*)contar$/ ,array:[1,"cuento"]}, {re:/^(.*)(s|h)ollar$/
     * ,array:[1,2,"uello"]}, {re:/^(.*)(c|p)ertar$/ ,array:[1,2,"ierto"]}, {re:/^(.*)apretar$/ ,array:[1,"aprieto"]},
     * {re:/^(.*)(ap|ep|s|gob|f)ernar$/ ,array:[1,2,"ierno"]}, {re:/^(.*)(s|n)egar$/ ,array:[1,2,"iego"]}, {re:/^(.*)avesar
     * "$/                                                         ,array:[1,"avieso"]}, {re:/^(.*)(m|h)elar$/
     * ,array:[1,2,"ielo"]}, {re:/^(.*)herbar$/ ,array:[1,"hierbo"]}, {re:/^(.*)pedrar$/ ,array:[1,"piedro"]}, {re:/^(.*)lendrar$/
     * ,array:[1,"liendro"]}, {re:/^(.*)pezar$/ ,array:[1,"piezo"]}, {re:/^(.*)hestar$/ ,array:[1,"hiesto"]}, {re:/^(.*)nevar$/
     * ,array:[1,"nievo"]}, {re:/^(.*)(s|c|r|h)errar$/ ,array:[1,2,"ierro"]}, {re:/^(.*)(m|l)enzar$/ ,array:[1,2,"ienzo"]},
     * {re:/^(.*)pensar$/ ,array:[1,"pienso"]}, {re:/^(.*)emblar$/ ,array:[1,"iemblo"]}, {re:/^(.*)sembrar$/
     * ,array:[1,"siembro"]}, {re:/^(.*)quebrar$/ ,array:[1,"quiebro"]}, {re:/^(.*)uar$/ ,array:[1,"úo"]},
     * {re:/^(.*)ahu(m|s|ch)ar$/ ,array:[1,"ahú",2,"o"]}, {re:/^(.*)ehusar$/ ,array:[1,"ehúso"]}, {re:/^(.*)au(n|p|l|ll)ar$/
     * ,array:[1,2,"o"]}, {re:/^(.*)jugar$/ ,array:[1,"juego"]}, {re:/^(.*)euntar$/ ,array:[1,"eúnto"]}, {re:/^(.*)aillar$/
     * ,array:[1,"aíllo"]}, {re:/^(.*)(sa|oh|cafe)inar$/ ,array:[1,2,"íno"]}, {re:/^(.*)(a|e)izar$/ ,array:[1,2,"ízo"]},
     * {re:/^(.*)dar$/ ,array:[1,"doy"]}, {re:/^(.*)(a|e|i)r$/ ,array:[1,"o"]} ]); Verb.PRES_IND_TU"] = new VerbForm(
     * Verb.PRES_IND_YO"],
     * {"ser":"eres","remecer":"remeces","mecer":"meces","estar":"estás","desvaír":"desvaes","ir":"vas","dar":"das","desdar":
     * "desdás","caber":"cabes","ver":"ves"}, [ {re:/^(.*)(ger|gir)$/,array:[1,"ges"]}, {re:/^(.*)saber$/,array:[1,"sabes"]},
     * {re:/^(.*)(asir|salir|poner|valer)$/,array:[1,"es"]}}, {re:/^(.*)(tr|c)aer|aer$/,array:[1,"es"]},
     * {re:/^(.*)decir$/,array:[1,"ces"]}, {re:/^(.*)oír$/,array:[1,"yes"]}, {re:/^(.*)quir$/,array:[1,"ques"]},
     * {re:/^(.*)guir$/,array:[1,"gues"]}, {re:/^(.*)(cer|ucir)$/,array:[1,"ces"]}, {re:/^(.*)cir$/,array:[1,"ces"]},
     * {re:/^(.*)ver$/,array:[1,"és"]}, {re:/^(.*)(venir|tener)$/,array:[1,"ienes"]}, {re:/^(.*)$/,array:[1,"es"]}} ] );
     * 
     * Verb.PRES_IND_VOSEO"] = new VerbForm( null, { haber, ir }, [ {re:/^(.*)(i|í)r$/,array:[1,"ís"]},
     * {re:/^(.*)er$/,array:[1,"és"]}, {re:/^(.*)ar$/,array:[1,"ás"]} //quitar el acento si el resultado es monosilabico ] );
     * 
     * Verb.PRES_IND_VOS"] = new VerbForm( Verb.PRES_IND_VOSEO"], {}, [ {re:/^(.*)uir$/,array:[1,"is"],root:Verb.INF"]}
     * //TODO: solo aplica a monosilabicos {re:/^(.*)(a|á|e|é)s$/,array:[1,2,"is"]} {re:/^(.*)$/,array:[1]}, ] );
     * 
     * Verb.PRES_IND_EL"] = Verb.PRES_IND_TU"];
     * 
     * Verb.PRES_IND_NOSOTROS"] = new VerbForm( null, { "ser":"somos", "haber":"hemos", "ir":"vamos" }, [
     * {re:/^(.*)r$/,array:[1,"mos"]} ] );
     * 
     * Verb.PRES_IND_USTEDES"] = new VerbForm( Verb.PRES_IND_EL"], { "ser":"son" }, [ {re:/^(.*)$/,array:[1,"n"]} ] );
     * 
     * Verb.PRES_IND_ELLOS"] = Verb.PRES_IND_USTEDES"];
     * 
     * Verb.COP_IND_YO"] = new VerbForm( null, { "ser":"era", "ir":"iba" }, [ {re:/^(.*)ar$/,array:[1,"aba"]},
     * {re:/^(.*)ver$/,array:[1,"veía"]}, {re:/^(.*)(e|i)r$/,array:[1,"ía"]}, ] );
     * 
     * Verb.COP_IND_TU"] = new VerbForm( Verb.COP_IND_YO"], {}, [ {re:/^(.*)$/,array:[1,"s"]} ] );
     * 
     * Verb.COP_IND_EL"] = Verb.COP_IND_YO"];
     * 
     * Verb.COP_IND_NOSOTROS"] = new VerbForm( Verb.COP_IND_YO"], { "ser":"", "ir":"" }, [
     * {re:/^(.*)aba$/,array:[1,"ábamos"]}, {re:/^(.*)$/,array:[1,"mos"]} ] );
     * 
     * Verb.COP_IND_VOS"] = new VerbForm( Verb.COP_IND_YO"], {}, [ {re:/^(.*)$/,array:[1,"is"]} ] );
     * 
     * Verb.COP_IND_ELLOS"] = new VerbForm( Verb.COP_IND_YO"], {}, [ {re:/^(.*)$/,array:[1,"n"]} ] ); /* Verb.PRET_IND_YO"]
     * = new VerbForm( null, { "dar":"di", "andar":"anduve", "desandar":"desanduve", "ser":"fui", "ver":"vi", "caber":"quepo",
     * "haber":"hube", "contrahacer":"contrahíce", "ir":"fui" }, [ {re:/^(.*)gar$/,array:[1,"gué"]},
     * {re:/^(.*)guar$/,array:[1,"güé"]}, {re:/^(.*)zar$/,array:[1,"cé"]}, {re:/^(.*)car$/,array:[1,"qué"]},
     * 
     * && this.INF.endsWith("ar") // && this.INF.substring(0,this.INF.length-2) + "é" != this.PRET_IND_YO // sin tilde si es
     * monosilabico
     * 
     * 
     * {re:/^(.*)ducir$/,array:[1,"duje"]}, {re:/^(.*)ecir$/,array:[1,"ije"]}, {re:/^(.*)venir$/,array:[1,"vine"]}, &&
     * this.INF.endsWith("ir") && this.INF.substring(0,this.INF.length-2) + "í" != this.PRET_IND_YO// sin tilde si es monosilabico
     * 
     * 
     * {re:/^(.*)tener$/,array:[1,"tuve"]}, {re:/^(.*)saber$/,array:[1,"supe"]}, {re:/^(.*)poder$/,array:[1,"pude"]},
     * {re:/^(.*)poner$/,array:[1,"puse"]}, {re:/^(.*)traer$/,array:[1,"traje"]}, {re:/^(.*)querer$/,array:[1,"quise"]},
     * {re:/^(.*)(h|f)acer$/,array:[1,2,"hice"]}
     * 
     * {re:/^(.*)er") //   && this.INF.substring(0,this.INF.length-2) + "í" != this.PRET_IND_YO ] );
     * 
     */
    /*
     * Verb.PRET_IND_TU"] = new VerbForm( Verb.PRET_IND_YO"], {"contrahacer":"contrahiciste"}, [
     * {re:/^(.*)(a|e|o)í$/,array:[1,2,"íste"] {re:/^(.*)í$/,array:[1,"iste"]}, {re:/^(.*)cé$/,array:[1,"zaste"]},
     * {re:/^(.*)gué$/,array:[1,"gaste"]}, {re:/^(.*)qué$/,array:[1,"caste"]}, {re:/^(.*)güé$/,array:[1,"guaste"]},
     * {re:/^(.*)é$/,array:[1,"aste"]}, {re:/^(.*)(i|u)e$/,array:[1,2,"aste"]}, {re:/^(.*)(e|i)$/,array:[1,2,"iste"]} ] );
     * 
     * Verb.PRET_IND_VOSEO"] = Verb.PRET_IND_TU"];
     * 
     * Verb.PRET_IND_VOS"] = new VerbForm( Verb.PRET_IND_TU"], {}, [ {re:/^(.*)$/,array:[1,"is"]} ] );
     * 
     * Verb.PRET_IND_EL"] = new VerbForm( Verb.PRET_IND_TU"], { "ser":"fue" "ir":"fue", "rendir":"rindió",
     * "contrahacer":"contrahízo", "gemir":"gimió", "caber":"cupo", "reír":"rio", "freír":"frio", "ver":"vio", "prever":"previo",
     * "haber":"hubo", "poder":"pudo", "dar":"dio" }, [ {re:/^(.*)aste$/,array:[1,"ó"]}, //si monosilabico, se quita el acento
     * {re:/^(.*)(g|q)uiste$/,array:[1,2,"uió"]}, {re:/^(.*)(ui|üi|í)ste$/,array:[1,"yó"]},
     * {re:/^(.*)(uv|j|vin|pus|quis)iste$/,array:[1,2,"o"]}, {re:/^(.*)iciste$/,array:[1,"izo"]},
     * {re:/^(.*)ciste$/,array:[1,"ió"]}, {re:/^(.*)(ll|ñ)iste$/,array:[1,2,"ó"]},
     * {re:/^(.*)e(r|t|nt|st|g|d|b|nch|rv|rt)iste$/,array:[1,"i",2,"ió"]}, {re:/^(.*)vertiste$/,array:[1,"virtió"]},
     * {re:/^(.*)ormiste$/,array:[1,"urmió"]}, {re:/^(.*)moriste$/,array:[1,"murió"]}, {re:/^(.*)supiste$/,array:[1,"supo"]},
     * {re:/^(.*)iste$/,array:[1,"ió"]} ] };
     * 
     * Verb.PRET_IND_NOSOTROS"] = new VerbForm( Verb.PRET_IND_TU"], {}, [ {re:/^(.*)ste$/,array:[1,"mos"]} ] );
     * 
     * 
     * Verb.PRET_IND_USTEDES"] = new VerbForm( null, { "ser":"fueron", "ir":"fueron", "desdar":"desdieron" }, [
     * {re:/^(.*)venir$/ -> quitar venir, sustituir por vinieron {re:/^(.*)ar$/ && this.PRET_IND_EL.endsWith("o") ->
     * this.PRET_IND_ELLOS.endsWith("ieron") {re:/^(.*)ar$/ && this.PRET_IND_EL.endsWith("ó") ->
     * this.PRET_IND_ELLOS.endsWith("aron") {re:/^(.*)ar$/, es monosilabico y && this.PRET_IND_EL.endsWith("o") ->
     * this.PRET_IND_ELLOS.endsWith("aron") //
     * 
     * 
     * {re:/^(.*)ir$/ && !this.PRET_IND_EL.endsWith("ó") //&& this.PRET_IND_ELLOS.endsWith("eron") {re:/^(.*)ir$/ &&
     * this.PRET_IND_EL.endsWith("o") //&& this.PRET_IND_ELLOS.endsWith("eron")
     * 
     * {re:/^(.*)er$/ && this.PRET_IND_EL.endsWith("o") && !this.PRET_IND_ELLOS.endsWith("ieron") {re:/^(.*)er$/ &&
     * this.PRET_IND_EL.endsWith("jo") && !this.PRET_IND_ELLOS.endsWith("jeron") {re:/^(.*)er$/ && this.PRET_IND_EL.endsWith("ó")
     * && this.PRET_IND_ELLOS.endsWith("eron") ] );
     * 
     * Verb.PRET_IND_ELLOS"] = Verb.PRET_IND_USTEDES"];
     * 
     * Verb.FUT_IND_YO"] = new VerbForm( { "ir":"é", "bendecir":"bendeciré", "maldecir":"maldeciré" }, [
     * {re:/^(.*)(ten|pon|val)er$/,array:[1,2,"dré"]}, {re:/^(.*)(ha|fa)cer$/,array:[1,2,"ré"]},
     * {re:/^(.*)(pod|quer|sab|cab|hab)er$/,array:[1,2,"ré"]}, {re:/^(.*)(sal|ven)ir$/,array:[1,2,"dré"]},
     * {re:/^(.*)decir$/,array:[1,"diré"]}, {re:/^(.*)ír$/,array:[1,"iré"]}, {re:/^(.*)$/,array:[1,"é"]} ] );
     * 
     * Verb.FUT_IND_TU"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ {re:/^(.*)é$/,array:[1,"ás"]} ] );
     * 
     * Verb.FUT_IND_VOS"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ {re:/^(.*)$/,array:[1,"is"]} ] );
     * 
     * 
     * Verb.FUT_IND_EL"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ {re:/^(.*)é$/,array:[1,"á"]} ] );
     * 
     * Verb.FUT_IND_NOSOTROS"] = new VerbForm( Verb.FUT_IND_YO"], {}, [ {re:/^(.*)é$/,array:[1,"emos"]} ] );
     * 
     * Verb.FUT_IND_ELLOS"] = new VerbForm( Verb.FUT_IND_EL"], {}, [ {re:/^(.*)$/,array:[1,"n"]} ] );
     * 
     * Verb.POS_IND_YO"] = new VerbForm( null, {}, [ {re:/^(.*)ar$/,array:[1,"ía"]},
     * 
     * {re:/^(.*)(ten|pon|val|po)er$/,array:[1,2,"dría"]}, {re:/^(.*)(querer$/,array:[1,2,"querría"]},
     * {re:/^(.*)(h|f)acer$/,array:[1,2,"ría"]}, {re:/^(.*)(c|h|s)aber$/,array:[1,2,"abría"]}, {re:/^(.*)er$/,array:[1,"ía"]},
     * 
     * {re:/^(.*)(ven|sal)ir$/,array:[1,2,"dría"]}, {re:/^(.*)decir$/,array:[1,"diría"]},
     * {re:/^(.*)enserir$/,array:[1,"enseriaría"]}, {re:/^(.*)ir$/,array:[1,"ía"]}, ] );
     * 
     * Verb.POS_IND_TU"] = new VerbForm( Verb.POS_IND_YO"], {}, [ {re:/^(.*)$/,array:[1,"s"]} ] );
     * 
     * Verb.POS_IND_VOSEO"] = Verb.POS_IND_TU"];
     * 
     * Verb.POS_IND_VOS"] = new VerbForm( Verb.POS_IND_YO"], {}, [ {re:/^(.*)ía$/,array:[1,"íais"]} ] );
     * 
     * Verb.POS_IND_EL"] = Verb.POS_IND_YO"];
     * 
     * 
     * Verb.POS_IND_NOSOTROS"] = new VerbForm( Verb.POS_IND_YO"], {}, [ {re:/^(.*)$/,array:[1,"mos"]} ] );
     * 
     * Verb.POS_IND_USTEDES"] = Verb.PRET_IND_ELLOS"];
     * 
     * 
     * Verb.POS_IND_ELLOS"] = new VerbForm( Verb.POS_IND_YO"], {}, [ {re:/^(.*)$/,array:[1,"n"]} ] );
     * 
     * Verb.PRES_SUB_YO"] = new VerbForm( Verb.PRES_IND_YO"], { "ser":"sea", "ir":"vaya", "enserir":"enserie" }, [
     * {re:/^(.*)$/,array:[1,"n"]}
     * 
     * {re:/^(.*)oy$/,array:[1,"é"]}, {re:/^(.*)go$/,array:[1,"gue"]}, {re:/^(.*)zo$/,array:[1,"ce"]},
     * {re:/^(.*)co$/,array:[1,"que"]}, {re:/^(.*)guo$/,array:[1,"güe"]},
     * 
     * && INF terminar ar y {re:/^(.*)o") -> PRES_IND_YO quitar o, e
     * 
     * && INF terminar er o ir y this.PRES_IND_YO.endsWith("o") -> PRES_IND_YO quitar o, a
     * 
     * ] );
     * 
     * Verb.PRES_SUB_TU"] = new VerbForm( Verb.PRES_SUB_YO"], {"dar":""}, {re:/^(.*)$/,array:[1]} ] );
     * Verb.PRES_SUB_NOSOTROS"] = new VerbForm( null, { "ser":"seamos", "haber":, "caber":"quepamos", "desvaír":"desvayamos",
     * "ir":"vayamos", "mecer":"mezamos", "remecer":"remezamos", "antever":"anteveamos", "entrever":"entreveamos",
     * "prever":"preveamos", "trasver":"trasveamos", "ver":"veamos" }, [ {re:/^(.*)gar$/,array:[1,"guemos"]},
     * {re:/^(.*)zar$/,array:[1,"cemos"]}, {re:/^(.*)car$/,array:[1,"quemos"]}, {re:/^(.*)guar$/,array:[1,"güemos"]},
     * {re:/^(.*)ar$/,array:[1,"emos"]},
     * 
     * {re:/^(.*)(ten|pon|val)er$/,array:[1,2,"gamos"]},
     * 
     * {re:/^(.*)(c|tr)aer$/,array:[1,2,"aigamos"]},
     * 
     * {re:/^(.*)saber$/,array:[1,"sepamos"]},
     * 
     * {re:/^(.*)ger$/,array:[1,"jamos"]}, {re:/^(.*)cocer$/,array:[1,"cozamos"]},
     * 
     * {re:/^(.*)cer$/,array:[1,"zcamos" {re:/^(.*)er$/,array:[1,"amos"
     * 
     * {re:/^(.*)oír$/,array:[1,"oigamos"]}, {re:/^(.*)eír$/,array:[1,"iamos"]},
     * 
     * {re:/^(.*)dormir$/,array:[1,"durmamos"]}, {re:/^(.*)orir$/,array:[1,"uramos"]}, {re:/^(.*)gir$/,array:[1,"jamos"]},
     * {re:/^(.*)(u|ü)ir$/,array:[1,"uyamos"]}, {re:/^(.*)vertir$/,array:[1,"virtamos"]},
     * {re:/^(.*)(as|ven|sal)ir$/,array:[1,2,"gamos"]}, {re:/^(.*)decir$/,array:[1,"digamos"]},
     * {re:/^(.*)ucir$/,array:[1,"uzcamos"]}, {re:/^(.*)cir$/,array:[1,"zamos"]},
     * 
     * {re:/^(.*)e(g|r|rv|gr|st|t|b|d|ñ|nt|m|end|nch)ir$/,array:[1,"i",2,"amos"]}, ] );
     * 
     * 
     * Verb.PRES_SUB_VOS"] = new VerbForm( null, { "dar":"deis", "ir":"vayáis", "desleír":"desliáis", "desvaír":"desvayáis",
     * "ser":"seáis", "caber":"quepáis", "haber":"hayáis", "enserir":"enseráis", "evertir":"evertáis", "rendir":"rindáis" }, [
     * {re:/^(.*)gar$/,array:[1,"guéis"]}, {re:/^(.*)zar$/,array:[1,"céis"]}, {re:/^(.*)car$/,array:[1,"quéis"]},
     * {re:/^(.*)guar$/,array:[1,"güéis"]}, {re:/^(.*)iar$/,array:[1,"iéis"]},// si es monosilabico la e no se acentua
     * 
     * 
     * {re:/^(.*)ar$/,array:[1,"éis"]},
     * 
     * {re:/^(.*)(fa|ha|ten|pon|val)er$/,array:[1,2,"gáis"]}, {re:/^(.*)aer$/,array:[1,"aigáis"]},
     * 
     * {re:/^(.*)saber$/,array:[1,"sepáis"]},
     * 
     * {re:/^(.*)(er|or|en|co)cer$/,array:[1,2,"záis"]}, {re:/^(.*)(a|e|o)cer$/,array:[1,2,"zcáis"]},
     * 
     * {re:/^(.*)ger$/,array:[1,"jáis"]},
     * 
     * {re:/^(.*)er$/,array:[1,"áis"]
     * 
     * {re:/^(.*)ormir$/,array:[1,"urmáis"]}, {re:/^(.*)quir$/,array:[1,"cáis"]}, {re:/^(.*)venir$/,array:[1,"vengáis"]},
     * {re:/^(.*)decir$/,array:[1,"digáis"]},
     * 
     * {re:/^(.*)vertir$/,array:[1,"virtáis"]}, {re:/^(.*)e(st|rv|nt|)ir$/,array:[1,"i",2,"áis"]},
     * {re:/^(.*)u(r|n|l)cir$/,array:[1,"u",2,"záis"]},
     * 
     * 
     * {re:/^(.*)cir$/,array:[1,"zcáis"]}, {re:/^(.*)(m|p)edir$/,array:[1,2,"idáis"]},
     * 
     * {re:/^(.*)erir$/,array:[1,""iráis"]},
     * 
     * {re:/^(.*)asir$/,array:[1,"asgáis"]}, {re:/^(.*)e(m|t|nch|l|r|ñ)ir") //1,"i",2,"áis"]},
     * 
     * {re:/^(.*)egir$/,array:[1,"ijáis"]}, {re:/^(.*)gir$/,array:[1,"jáis"]}, {re:/^(.*)nguir$/,array:[1,"ngáis"]},
     * {re:/^(.*)eguir$/,array:[1,"igáis"]}, {re:/^(.*)erguir$/,array:[1,"yergáis"]}, {re:/^(.*)oír$/,array:[1,"oigáis"]},
     * {re:/^(.*)(u|ü)ir$/,array:[1,"uyáis"]}, {re:/^(.*)ir$/,array:[1,"áis"]},
     * 
     * {re:/^(.*)reír$/,array:[1,"riáis"]} //si el infinitivo es monosilabico la a no se acentua (riais) ] );
     * Verb.PRES_SUB_USTEDES"] = new VerbForm( Verb.PRES_SUB_YO"], { "dar":"den" }, [ {re:/^(.*)$/,array:[1,"n"]}, ] );
     * 
     * Verb.PRES_SUB_ELLOS"] = Verb.PRES_SUB_USTEDES"];
     * 
     * Verb.FUT_SUB_YO"] = new VerbForm( Verb.PRET_IND_YO"], { "ser":"fuere", "ir":"fuere" }, [
     * {re:/^(.*)(uv|vin|íc|ic|up|ud|ub|s)e$/,array:[1,2,"iere"]}, {re:/^(.*)(i|u)e$/,array:[1,2,"are"]},
     * {re:/^(.*)e$/,array:[1,"ere"]}, {re:/^(.*)ui$/,array:[1,"uyere"]}, {re:/^(.*)i$/,array:[1,"iere"]},
     * {re:/^(.*)gué$/,array:[1,"gare"]}, {re:/^(.*)qué$/,array:[1,"care"]}, {re:/^(.*)güé$/,array:[1,"guare"]},
     * {re:/^(.*)cé$/,array:[1,"zare"]}, {re:/^(.*)herí$/,array:[1,"hiriere"]}, {re:/^(.*)dormí$/,array:[1,"durmiere"]},
     * {re:/^(.*)orí$/,array:[1,"uriere"]}, {re:/^(.*)vertí$/,array:[1,"virtiere"]},
     * {re:/^(.*)e(st|nt|nd|nch|rv|m|r|g|d|b|t)í$/,array:[1,"i",2,"iere"]}, {re:/^(.*)(u|o|e|a)í$/,array:[1,2,"yere"]},
     * {re:/^(.*)üí$/,array:[1,"uyere"]}, {re:/^(.*)(ñ|ll)í$/,array:[1,2,"ere"]}, {re:/^(.*)í$/,array:[1,"iere"]},
     * {re:/^(.*)é$/,array:[1,"are"]} ] );
     * 
     * Verb.FUT_SUB_TU"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ {re:/^(.*)$/,array:[1,"s"]}; ] };
     * 
     * Verb.FUT_SUB_NOSOTROS"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ {re:/^(.*)ere$/,array:[1,"éremos"]},
     * {re:/^(.*)are$/,array:[1,"áremos"]} ] );
     * 
     * Verb.FUT_SUB_VOS"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ {re:/^(.*)$/,array:[1,"is"]} ] );
     * 
     * 
     * 
     * Verb.FUT_SUB_ELLOS"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ {re:/^(.*)$/,array:[1,"n"]}; ] );
     * 
     * Verb.CO_SUB_YO"] = new VerbForm( Verb.FUT_SUB_YO"], {}, [ {re:/^(.*)e$/,array:[1,"a"]}; ] );
     * 
     * Verb.CO_SUB_TU"] = new VerbForm( Verb.CO_SUB_YO"], {}, [ {re:/^(.*)$/,array:[1,"s"]}; ] );
     * 
     * Verb.CO_SUB_EL"] = Verb.CO_SUB_YO"];
     * 
     * Verb.CO_SUB_NOSOTROS"] = new VerbForm(
     * 
     * Verb.FUT_SUB_NOSOTROS"], {}, [ {re:/^(.*)emos$/,array:[1,"amos"]}; ] );
     * 
     * Verb.CO_SUB_VOS"] = new VerbForm( Verb.CO_SUB_YO"], {}, [ {re:/^(.*)$/,array:[1,"is"]}; ] );
     * 
     * Verb.CO_SUB_ELLOS"] = new VerbForm( Verb.CO_SUB_YO"], {}, [ {re:/^(.*)$/,array:[1,"n"]}; ] );
     * 
     * Verb.PRES_IMP_TU"] = new VerbForm( null, { "ser":"", "dar":"", "haber":"" }, [
     * 
     * {re:/^(.*)ener$/,array:[1,"én"]}, {re:/^(.*)oner$/,array:[1,"ón"]}, {re:/^(.*)cer$/,array:[1,"az"]},
     * {re:/^(.*)decir$/,array:[1,"dí"]}, //Si el resultado es monosilabico, se quita la tilde (di)
     * {re:/^(.*)venir$/,array:[1,"vén"]},//Si el resultado es monosilabico, se quita la tilde (ven)
     * {re:/^(.*)salir$/,array:[1,"sal"]}, {re:/^(.*)s$/,array:[1],root:Verb.PRES_IND_TU"]} ] );
     * 
     * Verb.PRES_IMP_VOSEO"] = new VerbForm( null, { "ir":"" }, [ {re:/^(.*)r$/,array:[1]} //Si el resultado es multisilabico,
     * acentuar la ultima letra. ] );
     * 
     * Verb.PRES_IMP_USTED"] = Verb.PRES_SUB_YO"];
     * 
     * Verb.PRES_IMP_VOS"] = new VerbForm( null, {}, [ {re:/^(.*)r$/,array:[1,"d"]} ] );
     */ 
     new VerbForm( Verb.PRES_IMP_USTED, new Rule("^(.*)$","1","n"))
    };
    public Map<Verb,String> conjugate(String infinitive) {
        
        Map<Verb,String> result = Arrays.stream(verbForms).collect(Collectors.toMap(verbForm -> verbForm.getName(), verbForm -> verbForm.conjugate(infinitive)));;
        result.put(Verb.INF, infinitive);
        return result;
    }
}
