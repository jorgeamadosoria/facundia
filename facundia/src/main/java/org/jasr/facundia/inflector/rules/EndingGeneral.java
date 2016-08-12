package org.jasr.facundia.inflector.rules;

public class EndingGeneral extends BaseRule {

    public EndingGeneral() {
        super(".*(a|e|i|o|u|�|�|�|�|�|b|c|f|g|h|k|m|�|p|q|t|v|w)");
    }

    public String doApply(String singular) {
        return singular + "s";
    }

    @Override
    public String getDescription() {
        return "Las palabras que no forman plural seg�n alguna de las otras reglas existentes, forman su plural adicionando 's' al final de la forma singular.";
    }

}
