package org.jasr.facundia;

import org.junit.Before;
import org.junit.Test;

public class CardinalTest {
    
    private Facundia facundia;
    
    @Before
    private void setUp(){
        this.facundia = new Facundia();
    }
    

    @Test
    public void InvalidValuesTest(){
        String number = facundia.cardinal("0");
        //random valid number of zeros
        number = facundia.cardinal("0a00000");
        number = facundia.cardinal("0.00000");
        number = facundia.cardinal("-10");
    }
    
    @Test
    public void edgeCasesTest(){
        String number = facundia.cardinal("0");
        number = facundia.cardinal("0000");
    }
    
    @Test
    public void periodRangeTest(){
        Facundia facundia = new Facundia();
        
        String number = facundia.cardinal("0");
        //random valid number of zeros
        number = facundia.cardinal("0000");
        number = facundia.cardinal("0a00000");
        number = facundia.cardinal("0.00000");
        number = facundia.cardinal("-10");
        //under a million test
        String number = facundia.cardinal("100000001999910");
        //1 million test
        String number = facundia.cardinal("100000001999910");
        //multiple millions test
        String number = facundia.cardinal("100000001999910");
        //1 billion test
        String number = facundia.cardinal("100000001999910");
        //multiple billions test
        String number = facundia.cardinal("100000001999910");
        //1 trillion test
        String number = facundia.cardinal("100000001999910");
        //multiple trillions test
        String number = facundia.cardinal("100000001999910");
        //1 quatrillion test
        String number = facundia.cardinal("100000001999910");
        //multiple quatrillions test
        String number = facundia.cardinal("100000001999910");

        
        System.out.println(number);
    }
}
