package org.jasr.facundia.verbs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.jasr.facundia.syllabes.Syllaber;
import org.jasr.facundia.verbs.conjugation.Rules;

public class Conjugator {

	private Map<Verb, VerbForm> forms = new HashMap<>();

	public Conjugator() {

		forms.put(Verb.INF, new VerbForm("(.*)->1"));

		forms.put(Verb.GER,
				new VerbForm("poder->pudiendo", "ir->yendo", "evertir->everto", "rendir->rindiendo", "(.*)(ar)->1,ando",
						"(.*)(ar)->1,ando", "(.*)(a|o|e)(e|í)r->1,2,yendo", "(.*)ll(i|e)r->1,llendo", "(.*)er->1,iendo",
						"(.*)(m|p)edir->1,2,idiendo", "(.*)e(nch|rt|rgu|gu|m|nt|b|st|g|c|n|t|r|rv)ir->1,i,2,iendo",
						"(.*)o(r|rm)ir->1,u,2,iendo", "(.*)uir->1,uyendo", "(.*)ir->1,iendo"));

		forms.put(Verb.PART, new VerbForm("romper->roto", "ver->visto", "(pre|entre|ante)ver->1,visto", "(.*)ar->1,ado", "(.*)poner->1,puesto", "(.*)olver->1,uelto",
				"(.*)(h|f)acer->1,2,echo", "(.*)(e|a|o)er->1,2,ído", "(.*)pudrir->1,podrido", "(.*)morir->1,muerto",
				"(.*)ribir->1,rito", "(.*)decir->1,ito", "(.*)brir->1,bierto", "(.*)ír->1,ído", "(.*)(e|i)r->1,ido"));

		forms.put(Verb.PRES_IND_YO, new VerbForm("hendir->hiendo", "rendir", "rindo", "rehundir->rehúndo",
				"evertir->everto", "reunir->reúno", "henchir->hincho", "rehenchir->rehíncho", "erguir->yergo",
				"ir->voy", "ser->soy", "haber->he", "caber->quepo", "mecer->mezo", "remecer->remezo",
				"pretender->pretendo", "hender->hiendo", "heder->hiedo", "defender->defiendo", "atrever->atrevo",
				"precaver->precavo", "airar->aíro", "ahitar->ahíto", "ahilar->ahílo", "rehilar->rehílo",
				"sobrehilar->sobrehílo", "amohinar->amohíno", "incensar->incienso", "desbecerrar->desbecerro",
				"soterrar->soterro", "ferrar->fierro", "manifestar->manifiesto", "estar->estoy", "aneblar->anieblo",
				"confesar->confieso", "adestrar->adiestro", "patiquebrar->patiquebro", "resolgar->resolgo",
				"avergonzar->avergüenzo", "desoldar->desueldo", "regoldar->regüeldo", "soldar->sueldo",
				"chollar->chollo", "descollar->descuello", "degollar->degüello", "entortar->entuerto", "soltar->suelto",
				"renovar->renuevo", "emporcar->empuerco", "desosar->deshueso", "tronar->trueno", "alforzar->alforzo",
				"almorzar->almuerzo", "ahincar->ahínco", "abuñolar->abuñuelo", "azolar->azuelo", "dedolar->deduelo",
				"desmajolar->desmajuelo", "escolar->escuelo", "recolar->recuelo", "trascolar->trascuelo",
				"sobresolar->sobresuelo", "solar->suelo", "subsolar->subsuelo", "denostar->denuesto",
				"apostar->apuesto", "ensangrentar->ensangriento", "accidentar->accidento", "tentar->tiento",
				"desatentar->desatiento", "retentar->retiento", "adormentar->adormiento", "escarmentar->escarmiento",
				"mentar->miento", "salpimentar->salpimiento", "sementar->semiento", "inventar->invento",
				"solventar->solvento", "alentar->aliento", "desalentar->desaliento", "violentar->violento",
				"sentar->siento", "vigiar->vigío", "miar->mío", "esquiar->esquío", "espiar->espío", "expiar->expío",
				"jipiar->jipío", "piar->pío", "pipiar->pipío", "fiar->fío", "porfiar->porfío", "desafiar->desafío",
				"arriar->arrío", "chirriar->chirrío", "descarriar->descarrío", "zurriar->zurrío", "enriar->enrío",
				"gloriar->glorío", "averiar->averío", "estriar->estrío", "triar->trío", "cariar->carío",
				"inventariar->inventarío", "contrariar->contrarío", "aviar->avío", "desviar->desvío",
				"desaviar->desavío", "extraviar->extravío", "ansiar->ansío", "extasiar->extasío", "aliar->alío",
				"ampliar->amplío", "desliar->deslío", "liar->lío", "adiar->adío", "almadiar->almadío", "agorar->agüero",
				"engorar->engüero", "desaforar->desafuero", "encorar->encuero", "asonar->asueno", "consonar->consueno",
				"resonar->resueno", "sonar->sueno", "jugar->juego", "rogar->ruego", "regar->riego",
				"restregar->restriego", "sorregar->sorriego", "anegar->anego", "resolgar->resolgo", "amelar->amelo",
				"(.*)asir->1,asgo", "(.*)quir->1,co", " (.*)egir->1,ijo", "(.*)gir->1,jo", "(.*)ulcir->1,adulzo",
				" (.*)ucir->1,uzco", "(.*)emir->1,imo", "(.*)dormir->1, duermo", "(.*)orir->1,uero",
				"(.*)(e|i)rir->1,iero", "(.*)ohibir->1,ohíbo", "(.*)ebir->1,ibo", "(.*)cernir->1,cierno",
				"(.*)hervir->1,hiervo", "(.*)eñir->1,iño", "(.*)argüir->1,arguyo", "(.*)(p|m)edir->1, 2,ido",
				"(.*)vertir->1,vierto", "(.*)etir->1,ito", "(.*)entir->1,iento", "(.*)estir->1, isto",
				"(.*)over->1,uevo", "(.*)olver->1,uelvo", "(.*)ver->1,veo ", "(.*)saber->1,sé", "(.*)verter->1,vierto",
				"(.*)erder->1,ierdo", "(.*)o(rd|l)er->1,ue,2,o", "(.*)querer->1,quiero", "(.*)erner->1,ierno",
				"(.*)(t|c)ender->1,2,iendo", "(.*)(ven|ten|pon|sal|val)er->1,2,go", "(.*)(tr|c)aer->1,2,aigo",
				"(.*)poder->1,puedo", "(.*)cocer->1,cuezo", "(.*)encer->1,enzo", "(.*)(f|h)acer->1,2,ago",
				"(.*)torcer->1, tuerzo", "(.*)ercer->1,erzo", "(.*)cer->1,zco", "(.*)ger->1,jo", "(.*)oír->1,oigo",
				"(.*)eír->1,ío", "(.*)desvaír->1,desvayo", "(.*)olgar->1,uelgo", "(.*)eguir->1,igo",
				"(.*)(c|n|s|pl|fr)egar->1,2,ciego",
				"(.*)(c|graf|gu|ch|j|conf|ist|cuant|hast|atav|env|cr|fr|var|sar|)iar->1,2,ío",
				"(.*)(d|ac|rec|sarm|cal|v|as)entar->1,2,iento", "(.*)(c|t)ostar->1,2,uesto",
				"(.*)(cons|v)olar->1,2,uelo", "(.*)(a|o)hijar->1,2,ahíjo", "(.*)aislar->1,aíslo",
				"(.*)(m|p)oblar->1,2,ueblo", "(.*)(tr|cl|fl|ll)ocar->1,2,ueco", "(.*)higar->1,hígo",
				"(.*)forzar->1,fuerzo", "(.*)cornar->1,cuerno", "(.*)mostrar->1,muestro", "(.*)probar->1,pruebo",
				"(.*)volcar->1,vuelco", "(.*)(atr|dis|etr)onar->1,2,ueno", "(.*)grosar->1,grueso ",
				"(.*)ontrar->1,uentro", "(.*)ro(g|d)ar->1,rue,2,o", "(.*)olgar->1,uelgo", "(.*)soñar->1,sueño",
				"(.*)contar->1,cuento", "(.*)(s|h)ollar->1,2,uello", "(.*)(c|p)ertar->1,2,ierto",
				"(.*)apretar->1,aprieto", "(.*)(ap|ep|s|gob|f)ernar->1,2,ierno", "(.*)(s|n)egar->1,2,iego",
				"(.*)avesar->1,avieso", "(.*)(m|h)elar->1,2,ielo", "(.*)herbar->1,hierbo", "(.*)pedrar->1,piedro",
				"(.*)lendrar->1,liendro", "(.*)pezar->1,piezo", "(.*)hestar->1,hiesto", "(.*)nevar->1,nievo",
				"(.*)(s|c|r|h)errar->1,2,ierro", "(.*)(m|l)enzar->1,2,ienzo", "(.*) pensar->1,pienso",
				"(.*)emblar->1,iemblo", "(.*)sembrar->1,siembro", "(.*)quebrar->1,quiebro ", "(.*)uar->1,úo",
				"(.*)ahu(m|s|ch)ar->1,ahú,2,o", "(.*)ehusar->1,ehúso", "(.*)au(n|p|l|ll)ar->1,2,o",
				"(.*)jugar->1,juego", "(.*)euntar->1,eúnto", "(.*)aillar->1,aíllo", "(.*)(sa|oh|cafe)inar->1,2,íno",
				"(.*)(a|e)izar->1,2,ízo", "(.*)dar->1,doy", "(.*)(a|e|i)r->1,o"));

		forms.put(Verb.PRES_IND_TU,
				new VerbForm(forms.get(Verb.PRES_IND_YO), "ser->eres", "remecer->remeces", "mecer->meces",
						"estar->estás", "desvaír->desvaes", "ir->vas", "dar->das", "desdar->desdás", "caber->cabes",
						"ver->ves", "(.*)(ger|gir)->1,ges", "(.*)saber->1,sabes", "(.*)(asir|salir|poner|valer)->1,es",
						"(.*)(tr|c)aer|aer->1,es", "(.*)decir->1,ces", "(.*)oír->1,yes", "(.*)quir->1,ques",
						" (.*)guir->1,gues", "(.*)(cer|ucir)->1,ces", "(.*)cir->1,ces", "(.*)ver->1,és",
						"(.*)(venir|tener)->1,ienes", "(.*)->1,es"));

		forms.put(Verb.PRES_IND_VOSEO,
				new VerbForm("haber->ir", "(.*)(i|í)r->1,ís", "(.*)er->1,és ", "mr:(.*)ar->1,ás"));

		forms.put(Verb.PRES_IND_VOS, new VerbForm(forms.get(Verb.PRES_IND_VOSEO), "root:INF:mr:(.*)uir->1,is",
				"(.*)(a|á|e|é)s->1,2,is", "(.*)->1"));

		forms.put(Verb.PRES_IND_EL, forms.get(Verb.PRES_IND_TU));

		forms.put(Verb.PRES_IND_NOSOTROS, new VerbForm("ser->somos", "haber->hemos", "ir->vamos", "(.*)r->1,mos"));

		forms.put(Verb.PRES_IND_USTEDES, new VerbForm(forms.get(Verb.PRES_IND_EL), "ser->son", "(.*)->1,n"));

		forms.put(Verb.PRES_IND_ELLOS, forms.get(Verb.PRES_IND_USTEDES));

		forms.put(Verb.COP_IND_YO,
				new VerbForm("ser->era", "ir->iba", "(.*)ar->1,aba", "(.*)ver->1,veía", "(.*)(e|i)r->1,ía"));

		forms.put(Verb.COP_IND_TU, new VerbForm(forms.get(Verb.COP_IND_YO), "(.*)->1,s"));

		forms.put(Verb.COP_IND_EL, forms.get(Verb.COP_IND_YO));
		/*
		 * new
		 * VerbForm(Verb.COP_IND_NOSOTROS"] = new VerbForm( Verb.COP_IND_YO"], {
		 * "ser","", "ir","" }, [ "(.*)aba->1,ábamos", "(.*)->1,mos"]} ] );
		 * 
		 * new VerbForm(Verb.COP_IND_VOS"] = new VerbForm( Verb.COP_IND_YO"], ,
		 * "(.*)->1,is"]} ] );
		 * 
		 * new VerbForm(Verb.COP_IND_ELLOS"] = new VerbForm( Verb.COP_IND_YO"],
		 * , "(.*)->1,n "]} ] ); /* Verb.PRET_IND_YO"] = new VerbForm( null, {
		 * "dar","di", "andar","anduve", "desandar","desanduve", "ser","fui",
		 * "ver","vi", "caber","quepo", "haber","hube",
		 * "contrahacer","contrahíce", "ir","fui" }, [ new
		 * Rule("(.*)gar->1,gué", "(.*)guar->1,güé", "(.*)zar->1,cé",
		 * "(.*)car->1,qué",
		 * 
		 * && this.INF.endsWith("ar") // &&
		 * this.INF.substring(0,this.INF.length-2) + "é" != this.PRET_IND_YO //
		 * sin tilde si es monosilabico
		 * 
		 * 
		 * "(.*)ducir->1,duje", "(.*)ecir->1,ije", "(.*)venir->1,vine", &&
		 * this.INF.endsWith("ir") && this.INF.substring(0,this.INF.length-2) +
		 * "í" != this.PRET_IND_YO// sin tilde si es monosilabico
		 * 
		 * 
		 * "(.*)tener->1,tuve", "(.*)saber->1,supe", "(.*)poder->1,pude",
		 * "(.*)poner->1,puse", "(.*)traer->1,traje", "(.*)querer->1,quise", new
		 * Rule("(.*)(h|f)acer->1,2,hice"]}
		 * 
		 * "(.*)er") // && this.INF.substring(0,this.INF.length-2) + "í" !=
		 * this.PRET_IND_YO ] );
		 * 
		 */
		/*
		 * new VerbForm(Verb.PRET_IND_TU"] = new VerbForm( Verb.PRET_IND_YO"],
		 * {"contrahacer","contrahiciste"}, [ new Rule("(.*)(a|e|o)í->1,2,íste"]
		 * "(.*)í->1,iste", "(.*)cé->1,zaste", "(.*)gué->1,gaste",
		 * "(.*)qué->1,caste", "(.*)güé->1,guaste", "(.*)é->1, "aste
		 * ", "(.*)(i|u)e->1,2,aste", "(.*)(e|i)->1,2,iste"]} ] );
		 * 
		 * new VerbForm(Verb.PRET_IND_VOSEO"] = Verb.PRET_IND_TU"];
		 * 
		 * new VerbForm(Verb.PRET_IND_VOS"] = new VerbForm( Verb.PRET_IND_TU"],
		 * , "(.*)->1,is"]} ] );
		 * 
		 * new VerbForm(Verb.PRET_IND_EL"] = new VerbForm( Verb.PRET_IND_TU"], {
		 * "ser","fue" "ir","fue", "rendir","rindió",
		 * "contrahacer","contrahízo", "gemir","gimió", "caber","cupo",
		 * "reír","rio", "freír","frio", "ver","vio", "prever","previo",
		 * "haber","hubo", "poder","pudo", "dar","dio" }, [ new
		 * Rule("(.*)aste->1,ó", //si monosilabico, se quita el acento new
		 * Rule("(.*)(g|q)uiste->1,2,uió", "(.*)(ui|üi|í)ste->1,yó", new
		 * Rule("(.*)(uv|j|vin|pus|quis)iste->1,2,o ", "(.*)iciste->1,izo",
		 * "(.*)ciste->1, "ió ", "(.*)(ll|ñ)iste->1,2,ó",
		 * "(.*)e(r|t|nt|st|g|d|b|nch|rv|rt)iste->1,i",2,ió ",
		 * " (.*)vertiste->1,virtió", "(.*)
		 * ormiste->1,urmió", "(.*)moriste->1,murió", "(.*)supiste->1,supo",
		 * "(.*)iste->1,ió"]} ] };
		 * 
		 * new
		 * VerbForm(Verb.PRET_IND_NOSOTROS"] = new VerbForm( Verb.PRET_IND_TU"],
		 * , "(.*)ste->1,mos"]} ] );
		 * 
		 * 
		 * new VerbForm(Verb.PRET_IND_USTEDES, { "ser","fueron", "ir","fueron",
		 * "desdar","desdieron" }, [
		 * "(.*)venir ->quitar venir, sustituir por vinieron "(.*) ar &&
		 * this.PRET_IND_EL.endsWith("o") ->
		 * this.PRET_IND_ELLOS.endsWith("ieron") new
		 * Rule("(.*)ar && this.PRET_IND_EL.endsWith("ó") ->
		 * this.PRET_IND_ELLOS.endsWith("aron") new
		 * Rule("(.*)ar, es monosilabico y && this.PRET_IND_EL.endsWith("o")
		 * ->this.PRET_IND_ELLOS.endsWith("aron") //
		 * 
		 * 
		 * "(.*)ir && !this.PRET_IND_EL.endsWith("
		 * ó") //&& this.PRET_IND_ELLOS.endsWith("eron") "(.*)ir &&
		 * this.PRET_IND_EL.endsWith("o") //&&
		 * this.PRET_IND_ELLOS.endsWith("eron")
		 * 
		 * "(.*)er && this.PRET_IND_EL.endsWith("
		 * o") && !this.PRET_IND_ELLOS.endsWith("ieron") "(.*)er &&
		 * this.PRET_IND_EL.endsWith("jo") &&
		 * !this.PRET_IND_ELLOS.endsWith("jeron")
		 * "(.*)er && this.PRET_IND_EL.endsWith("
		 * ó") && this.PRET_IND_ELLOS.endsWith("eron") ] );
		 * 
		 * new VerbForm(Verb.PRET_IND_ELLOS"] = Verb.PRET_IND_USTEDES"];
		 * 
		 * new VerbForm(Verb.FUT_IND_YO"] = new VerbForm( { "ir","é", "
		 * bendecir","bendeciré", "maldecir","maldeciré" }, [ new
		 * Rule("(.*)(ten|pon|val)er->1,2,dré", "(.*)(ha|fa)cer->1,2,ré", new
		 * Rule("(.*)(pod|quer|sab|cab|hab)er->1,2,ré",
		 * "(.*)(sal|ven)ir->1,2,dré", "(.*)decir->1, "diré ", "(.*)ír->1,iré",
		 * "(.*)->1,é"]} ] );
		 * 
		 * new VerbForm(Verb.FUT_IND_TU"] = new VerbForm( Verb.FUT_IND_YO"], {},
		 * [ "(.*)é->1,ás"]} ] );
		 * 
		 * new VerbForm(Verb.FUT_IND_VOS"] = new VerbForm( Verb.FUT_IND_YO"], ,
		 * "(.*)->1,is"]} ] );
		 * 
		 * 
		 * new VerbForm(Verb.FUT_IND_EL"] = new VerbForm( Verb.FUT_IND_YO"], {},
		 * [ "(.*)é->1,á"]} ] );
		 * 
		 * new
		 * VerbForm(Verb.FUT_IND_NOSOTROS"] = new VerbForm( Verb.FUT_IND_YO"], ,
		 * "(.*)é->1,emos"]} ] );
		 * 
		 * new VerbForm(Verb.FUT_IND_ELLOS"] = new VerbForm( Verb.FUT_IND_EL"],
		 * , "(.*)->1,n"]} ] );
		 * 
		 * new VerbForm(Verb.POS_IND_YO, , "(.*)ar->1,ía",
		 * 
		 * "(.*)(ten|pon|val|po)er->1,2,dría", "(.*)(querer->1,2,querría", new
		 * Rule("(.*)(h|f)acer->1,2,ría", "(.*)(c|h|s)aber->1,2,abría",
		 * "(.*)er->1,ía",
		 * 
		 * "(.*)(ven|sal)ir->1,2,dría", "(.*)decir->1,diría", "(.*)enserir->1,
		 * "enseriaría ", "(.*)ir->1,ía", ] );
		 * 
		 * new VerbForm(Verb.POS_IND_TU"] = new VerbForm( Verb.POS_IND_YO"], {},
		 * [ "(.*)->1,s"]} ] );
		 * 
		 * new VerbForm(Verb.POS_IND_VOSEO"] = Verb.POS_IND_TU"];
		 * 
		 * new VerbForm(Verb.POS_IND_VOS"] = new VerbForm( Verb.POS_IND_YO"], ,
		 * "(.*)ía->1,íais"]} ] );
		 * 
		 * new VerbForm(Verb.POS_IND_EL"] = Verb.POS_IND_YO"];
		 * 
		 * 
		 * new
		 * VerbForm(Verb.POS_IND_NOSOTROS"] = new VerbForm( Verb.POS_IND_YO"], ,
		 * "(.*)->1,mos"]} ] );
		 * 
		 * new VerbForm(Verb.POS_IND_USTEDES"] = Verb.PRET_IND_ELLOS"];
		 * 
		 * 
		 * new VerbForm(Verb.POS_IND_ELLOS"] = new VerbForm( Verb.POS_IND_YO"],
		 * , "(.*)->1,n"]} ] );
		 * 
		 * new VerbForm(Verb.PRES_SUB_YO"] = new VerbForm( Verb.PRES_IND_YO"], {
		 * "ser","sea", "ir","vaya", "enserir","enserie" }, [ new
		 * Rule("(.*)->1,n"]}
		 * 
		 * "(.*)oy->1,é", "(.*)go->1,gue", "(.*)zo->1,ce", "(.*)co->1, "que " ),
		 * "(.*)guo->1,güe",
		 * 
		 * && INF terminar ar y "(.*)o") ->PRES_IND_YO quitar o, e
		 * 
		 * && INF terminar er o ir y this.PRES_IND_YO.endsWith("o") ->
		 * PRES_IND_YO quitar o, a
		 * 
		 * ] );
		 */
		forms.put(Verb.PRES_SUB_TU, new VerbForm(forms.get(Verb.PRES_SUB_YO), "dar->", "(.*)->1"));

		forms.put(Verb.PRES_SUB_NOSOTROS,
				new VerbForm("ser->seamos", "haber->", "caber->quepamos", "desvaír", "desvayamos", "ir", "vayamos",
						"mecer", "mezamos", "remecer", "remezamos", "antever", "anteveamos", "entrever", "entreveamos",
						"prever", "preveamos", "trasver", "trasveamos", "ver", "veamos", "(.*)gar->1,guemos",
						"(.*)zar->1,cemos", "(.*)car->1,quemos", "(.*)guar->1,güemos", "(.*)ar->1,emos",
						"(.*)(ten|pon|val)er->1,2,gamos", "(.*)(c|tr)aer->1,2,aigamos", "(.*)saber->1,sepamos",
						"(.*)ger->1,jamos", "(.*)cocer->1,cozamos", "(.*)cer->1,zcamos", "(.*)er->1,amos",
						"(.*)oír->1,oigamos", "(.*)eír->1,iamos", "(.*)dormir->1,durmamos", "(.*)orir->1,uramos",
						"(.*)gir->1,jamos", "(.*)(u|ü)ir->1,uyamos", "(.*)vertir->1,virtamos",
						"(.*)(as|ven|sal)ir->1,2,gamos", "(.*)decir->1,digamos", "(.*)ucir->1,uzcamos",
						"(.*)cir->1,zamos", "(.*)e(g|r|rv|gr|st|t|b|d|ñ|nt|m|end|nch)ir->1,i,2,amos"));

		forms.put(Verb.PRES_SUB_VOS, new VerbForm("dar->deis", "ir->vayáis", "desleír->desliáis", "desvaír->desvayáis",
				"ser->seáis", "caber->quepáis", "haber->hayáis", "enserir->enseráis", "evertir->evertáis",
				"rendir->rindáis", "(.*)gar->1,guéis", "(.*)zar->1,céis", "(.*)car->1,quéis", "(.*)guar->1,güéis",
				"mr:(.*)iar->1,iéis", "(.*)ar->1,éis", "(.*)(fa|ha|ten|pon|val)er->1,2,gáis", "(.*)aer->1,aigáis",
				"(.*)saber->1,sepáis", "(.*)(er|or|en|co)cer->1,2,záis", "(.*)(a|e|o)cer->1,2,zcáis", "(.*)ger->1,jáis",
				"(.*)er->1,áis", "(.*)ormir->1,urmáis", "(.*)quir->1,cáis", "(.*)venir->1,vengáis",
				"(.*)decir->1,digáis", "(.*)vertir->1,virtáis", "(.*)e(st|rv|nt|)ir->1,i,2,áis",
				"(.*)u(r|n|l)cir->1,u,2,záis", "(.*)cir->1,zcáis", "(.*)(m|p)edir->1,2,idáis", "(.*)erir->1,iráis",
				"(.*)asir->1,asgáis", "(.*)e(m|t|nch|l|r|ñ)ir->1,i,2,áis", "(.*)egir->1,ijáis", "(.*)gir->1,jáis",
				"(.*)nguir->1,ngáis", "(.*)eguir->1,igáis", "(.*)erguir->1,yergáis", "(.*)oír->1,oigáis",
				"(.*)(u|ü)ir->1,uyáis", "(.*)ir->1,áis", "mr:(.*)reír->1,riáis"));

		forms.put(Verb.PRES_SUB_USTEDES, new VerbForm(forms.get(Verb.PRES_SUB_YO), "dar->den", "(.*)s->n"));

		forms.put(Verb.PRES_SUB_ELLOS, forms.get(Verb.PRES_SUB_USTEDES));

		forms.put(Verb.FUT_SUB_YO, new VerbForm(forms.get(Verb.PRET_IND_YO), "ser->fuere", "ir->fuere",
				"(.*)(uv|vin|íc|ic|up|ud|ub|s)e->1,2,iere", "(.*)(i|u)e$->1,2,are", "(.*)e$->1,ere", "(.*)ui$->1,uyere",
				"(.*)i->1,iere", "(.*)gué->1,gare", "(.*)qué->1,care", "(.*)güé$->1,guare", "(.*)cé->1,zare",
				"(.*)herí->1,hiriere", "(.*)dormí->1,durmiere", "(.*)orí->1,uriere", "(.*)vertí->1,virtiere",
				"(.*)e(st|nt|nd|nch|rv|m|r|g|d|b|t)í->1,i,2,iere", "(.*)(u|o|e|a)í->1,2,yere", "(.*)üí->1,uyere",
				"(.*)(ñ|ll)í->1,2,ere", "(.*)í->1,iere", "(.*)é->1,are"));

		forms.put(Verb.FUT_SUB_TU, new VerbForm(forms.get(Verb.FUT_SUB_YO), "(.*)->1,s"));
		forms.put(Verb.FUT_SUB_NOSOTROS,
				new VerbForm(forms.get(Verb.FUT_SUB_YO), "(.*)ere->1,éremos", "(.*)are->1,áremos"));

		forms.put(Verb.FUT_SUB_VOS, new VerbForm(forms.get(Verb.FUT_SUB_YO), "(.*)->1,is"));

		forms.put(Verb.FUT_SUB_ELLOS, new VerbForm(forms.get(Verb.FUT_SUB_YO), "(.*)->1,n"));

		forms.put(Verb.CO_SUB_YO, new VerbForm(forms.get(Verb.FUT_SUB_YO), "(.*)e->1,a"));

		forms.put(Verb.CO_SUB_TU, new VerbForm(forms.get(Verb.CO_SUB_YO), "(.*)->1,s"));

		forms.put(Verb.CO_SUB_EL, forms.get(Verb.CO_SUB_YO));

		forms.put(Verb.CO_SUB_NOSOTROS, forms.get(Verb.CO_SUB_NOSOTROS));

		forms.put(Verb.FUT_SUB_NOSOTROS, new VerbForm("(.*)emos->1,amos"));

		forms.put(Verb.CO_SUB_VOS, new VerbForm(forms.get(Verb.CO_SUB_YO), "(.*)->1,is"));

		forms.put(Verb.CO_SUB_ELLOS, new VerbForm(forms.get(Verb.CO_SUB_YO), "(.*)->1,n"));

		forms.put(Verb.PRES_IMP_TU,
				new VerbForm(forms.get(Verb.PRES_IND_TU), "ser->", "dar->", "haber->", "(.*)ener->1,én",
						"(.*)oner->1,ón", "(.*)cer->1,az", "mr:(.*)decir->1,dí", "mr:(.*)venir->1,vén",
						"(.*)salir->1,sal", "(.*)s->1"));

		forms.put(Verb.PRES_IMP_VOSEO, new VerbForm("ir->", "mr:(.*)r->1"));

		forms.put(Verb.PRES_IMP_USTED, forms.get(Verb.PRES_SUB_YO));

		forms.put(Verb.PRES_IMP_VOS, new VerbForm("(.*)r->1,d"));

		forms.put(Verb.PRES_IMP_USTEDES, new VerbForm(forms.get(Verb.PRES_IMP_USTED), "(.*)->1,n"));

	}

	public Map<Verb, String> conjugate(String infinitive) {
		return forms.keySet().stream()// .forEach(form ->
										// form.getValue().conjugate(infinitive))
				.collect(Collectors.toMap(key -> key, key -> forms.get(key).conjugate(infinitive)));
	}
}
