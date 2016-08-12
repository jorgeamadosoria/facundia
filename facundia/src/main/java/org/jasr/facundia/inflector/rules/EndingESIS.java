package org.jasr.facundia.inflector.rules;

public class EndingESIS extends BaseRule {

    public EndingESIS() {
        super(".*(st|es|is|x)");
    }

    public String doApply(String singular) {
            return singular;
    }

    @Override
    public String getDescription() {
        return "Las palabras terminadas en 'st','x','es' o 'is' permanecen invariables en plural.las palabras terminadas en 'st' son extranjerismos que no siguen las reglas del español. Las palabras terminadas en 'x' forman plural en los raros casos en que resultan ser agudas adicionando 'es' a continuacion del singular, y permanece invariable en cualquier otro caso.";
    }

    
    
}
