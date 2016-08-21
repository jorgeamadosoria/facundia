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
        System.out.println(facundia.syllabicate("dijkstra"));
        
        Assert.assertArrayEquals(new String[] {"sin","gu","la","res"},facundia.syllabicate("singulares").toArray(new String[0]));
        Assert.assertArrayEquals(new String[] {"dijks","tra"},facundia.syllabicate("dijkstra").toArray(new String[0]));
    }
    
    @Test
    public void notSyllabicTest(){
        System.out.println(facundia.syllabicate("1a2"));
        
        Assert.assertArrayEquals(new String[] {},facundia.syllabicate("").toArray(new String[0]));
        Assert.assertArrayEquals(new String[] {},facundia.syllabicate("1a2").toArray(new String[0]));
    }
}
