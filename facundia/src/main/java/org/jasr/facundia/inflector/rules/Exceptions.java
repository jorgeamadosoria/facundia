package org.jasr.facundia.inflector.rules;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Exceptions extends BaseRule {

    public final Properties exceptions = new Properties();

    public Exceptions() {
        super(".*");
        try (InputStream stream = new FileInputStream("src/main/resources/singularExceptions.properties")) {
            exceptions.load(stream);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected boolean doesApply(String singular) {
        return exceptions.containsKey(singular);
    }

    public String doApply(String singular) {
        return exceptions.getProperty(singular);
    }

    @Override
    public String getDescription() {
        return "Algunas palabras tienen formas plurales particulares, principalmente extranjerismos griegos, hebreos o anglicismos. Estas excepciones no se conforman con ninguna regla.";
    }

}
