package org.jasr.facundia;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SyllaberTest {

    private Facundia facundia;
    @Before
    public void setUp(){
        this.facundia = new Facundia();
    }
    
    @Test
    public void happyPathTest(){
        
    	Assert.assertArrayEquals(new String[] {"co","sa"},facundia.syllabicate("cosa").toArray(new String[0]));
        Assert.assertArrayEquals(new String[] {"sin","gu","lar"},facundia.syllabicate("singular").toArray(new String[0]));
        Assert.assertArrayEquals(new String[] {"plu","ral"},facundia.syllabicate("plural").toArray(new String[0]));
        Assert.assertArrayEquals(new String[] {"pseu","do","cien","cia"},facundia.syllabicate("pseudociencia").toArray(new String[0]));
    }
    
    @Test
    public void notSyllabicTest(){
        System.out.println(facundia.syllabicate("1a2"));
        
        Assert.assertArrayEquals(new String[] {},facundia.syllabicate("").toArray(new String[0]));
        Assert.assertArrayEquals(new String[] {},facundia.syllabicate("1a2").toArray(new String[0]));
    }
}
