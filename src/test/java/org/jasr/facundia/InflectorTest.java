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
    public void monosyllabicPathTest(){


        Assert.assertEquals("noes",facundia.inflectWord("no"));
        Assert.assertEquals("oes",facundia.inflectWord("o"));
        Assert.assertEquals("síes",facundia.inflectWord("sí"));
        Assert.assertEquals("robes",facundia.inflectWord("rob"));
        Assert.assertEquals("boxes",facundia.inflectWord("box"));
        Assert.assertEquals("dixes",facundia.inflectWord("dix"));
        Assert.assertEquals("fluxes",facundia.inflectWord("flux"));
        Assert.assertEquals("troxes",facundia.inflectWord("trox"));
        Assert.assertEquals("axes",facundia.inflectWord("ax"));
        Assert.assertEquals("texes",facundia.inflectWord("tex"));
        Assert.assertEquals("síes",facundia.inflectWord("sí"));
    }
    
    @Test
    public void inflectorHappyPathTest(){
        Assert.assertEquals("records",facundia.inflectWord("record"));
        Assert.assertEquals("complots",facundia.inflectWord("complot"));
        Assert.assertEquals("especímenes",facundia.inflectWord("espécimen"));
        Assert.assertEquals("márquetin",facundia.inflectWord("márquetin"));
        Assert.assertEquals("paréntesis",facundia.inflectWord("paréntesis"));
        Assert.assertEquals("crisis",facundia.inflectWord("crisis"));
        Assert.assertEquals("paréntesis",facundia.inflectWord("paréntesis"));
        Assert.assertEquals("tórax",facundia.inflectWord("tórax"));
        Assert.assertEquals("extásis",facundia.inflectWord("extásis"));
        Assert.assertEquals("tabús",facundia.inflectWord("tabú"));
        Assert.assertEquals("peces",facundia.inflectWord("pez"));
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
