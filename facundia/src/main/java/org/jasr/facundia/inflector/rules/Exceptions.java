package org.jasr.facundia.inflector.rules;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Exceptions extends BaseRule {

    public final Properties exceptions = new Properties();

    public Exceptions() {
        super(".*");
        /*
        InputStream in = getClass().getResourceAsStream("/file.txt"); 
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        */
        
        try (
        		InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("singularExceptions.properties")
        	//	InputStream stream = getClass().getResourceAsStream("singularExceptions.properties")
        		) {
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
