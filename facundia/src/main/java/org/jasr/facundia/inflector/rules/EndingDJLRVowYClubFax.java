package org.jasr.facundia.inflector.rules;

public class EndingDJLRVowYClubFax extends BaseRule {

    public EndingDJLRVowYClubFax() {
        super(".*(d|j|l|r|ay|ey|iy|oy|uy|club|fax)");
        
    }

    public String doApply(String singular) {
            return singular + "es";
    }

    @Override
    public String getDescription() {
        return "Las palabras terminadas en 'd','j','l','r', o una combinación de vocal seguida de 'y' forman plural adicionando -es al final. La misma regla aplica si la palabra es alguna palabra derivada y/o terminada en 'club' o 'fax' como aeroclub,autoclub,fax o telefax.";
    }

}
