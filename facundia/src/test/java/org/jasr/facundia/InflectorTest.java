package org.jasr.facundia;

import org.junit.Before;
import org.junit.Test;

import org.junit.Assert;

public class InflectorTest {

    private Facundia facundia;
    @Before
    public void setUp(){
        this.facundia = new Facundia();
    }
    
    @Test
    public void inflectorHappyPathTest(){
        
        Assert.assertEquals("singulares",facundia.inflectWord("singular"));
        Assert.assertEquals("golf",facundia.inflectWord("golf"));
        Assert.assertEquals("dixes",facundia.inflectWord("dix"));
        Assert.assertEquals("regímenes",facundia.inflectWord("Régimen"));
        Assert.assertEquals("gérmenes",facundia.inflectWord("germen"));
        Assert.assertEquals("constituciones",facundia.inflectWord("constitución"));
        Assert.assertEquals("américas",facundia.inflectWord("América"));
        Assert.assertEquals("áéíóús",facundia.inflectWord("ÁÉÍÓÚ"));
    }
    
    @Test
    public void inflectorNonAlphaTest(){
        
        Assert.assertEquals(null,facundia.inflectWord("123"));
        Assert.assertEquals(null,facundia.inflectWord("1alfa"));
        Assert.assertEquals(null,facundia.inflectWord("palabras múltiples"));
        Assert.assertEquals(null,facundia.inflectWord(""));
        Assert.assertEquals(null,facundia.inflectWord(null));
    }
}
