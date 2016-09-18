package org.jasr.facundia.verbs;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Properties verbModels = new Properties();
        try (InputStream stream = new FileInputStream("src/main/resources/verbModels.properties")) {
            verbModels.load(new InputStreamReader(stream, "UTF-8"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        Properties verbList = new Properties();
        try (InputStream stream = new FileInputStream("src/main/resources/verbList.properties")) {
            verbList.load(new InputStreamReader(stream, "UTF-8"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        for(Map.Entry v:verbList.entrySet()){
            String[] value = v.getValue().toString().split(",");
       //     Verb verb = new Verb(v.getKey().toString(),value[0],v.getKey().toString().substring(new Integer(value[1])));
      //      System.out.println(verb);
        }
    }

}
