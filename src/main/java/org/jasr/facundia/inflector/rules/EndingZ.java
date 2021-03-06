package org.jasr.facundia.inflector.rules;

public class EndingZ extends BaseRule {

    public EndingZ() {
        super(".*z");
    }

    public String doApply(String singular){
           return singular.substring(0,singular.lastIndexOf("z")) + "ces";
    }

    @Override
    public String getDescription() {
        return "Las palabras terminadas en 'z' forman plural reemplazando la 'z' final por -ces.";
    }

}
