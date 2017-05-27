package org.jasr.facundia;

import org.jasr.facundia.verbs.Conjugator;
import org.junit.Before;
import org.junit.Test;

public class ConjugatorTest {

    private Conjugator conjugator;
    @Before
    public void setUp(){
        this.conjugator = new Conjugator();
    }
    
    @Test
    public void happyPathTest(){
        
    	conjugator.conjugate("terminar").keySet().forEach(System.out::println);
    }
    
}
