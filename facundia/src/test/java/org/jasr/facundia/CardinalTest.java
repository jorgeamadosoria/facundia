package org.jasr.facundia;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.jasr.facundia.cardinal.Constants;
import org.junit.Before;
import org.junit.Test;

public class CardinalTest {

    private Facundia facundia;

    @Before
    public void setUp() {
        this.facundia = new Facundia();
    }

    @Test
    public void InvalidValuesTest() {
        assertEquals("NaN", facundia.cardinal("0a00000"));
        assertEquals("NaN", facundia.cardinal("0.00000"));
        assertEquals("NaN", facundia.cardinal("word"));
    }
    
    @Test
    public void negativeTest() {
        assertEquals("menos diez", facundia.cardinal("-10"));
        assertEquals("menos diez", facundia.cardinal(-10));
    }

    @Test
    public void edgeCasesTest() {
        assertEquals(
                "novecientos noventa y nueve mil novecientos noventa y nueve cuatrillones novecientos noventa y nueve mil novecientos noventa y nueve trillones novecientos noventa y nueve mil novecientos noventa y nueve billones novecientos noventa y nueve mil novecientos noventa y nueve millones novecientos noventa y nueve mil novecientos noventa y nueve",
                facundia.cardinal(Constants.maximum));
        assertEquals("cero", facundia.cardinal(Constants.minimum));
        assertEquals("cero", facundia.cardinal("0000"));
        assertEquals("cero", facundia.cardinal("0"));
    }

    @Test
    public void ConstantsTest() {

        assertThat(facundia.cardinal(1), is(Constants._1o.trim()));
        assertThat(facundia.cardinal(21), is(Constants._21o.trim()));

        assertThat(facundia.cardinal(0), is(Constants._0.trim()));
        assertThat(facundia.cardinal(1000000), startsWith(Constants._1.trim()));
        assertThat(facundia.cardinal(2), is(Constants._2.trim()));
        assertThat(facundia.cardinal(3), is(Constants._3.trim()));
        assertThat(facundia.cardinal(4), is(Constants._4.trim()));
        assertThat(facundia.cardinal(5), is(Constants._5.trim()));
        assertThat(facundia.cardinal(6), is(Constants._6.trim()));
        assertThat(facundia.cardinal(7), is(Constants._7.trim()));
        assertThat(facundia.cardinal(8), is(Constants._8.trim()));
        assertThat(facundia.cardinal(9), is(Constants._9.trim()));
        assertThat(facundia.cardinal(10), is(Constants._10.trim()));
        assertThat(facundia.cardinal(11), is(Constants._11.trim()));
        assertThat(facundia.cardinal(12), is(Constants._12.trim()));
        assertThat(facundia.cardinal(13), is(Constants._13.trim()));
        assertThat(facundia.cardinal(14), is(Constants._14.trim()));
        assertThat(facundia.cardinal(15), is(Constants._15.trim()));
        assertThat(facundia.cardinal(16), is(Constants._16.trim()));
        assertThat(facundia.cardinal(17), is(Constants._17.trim()));
        assertThat(facundia.cardinal(18), is(Constants._18.trim()));
        assertThat(facundia.cardinal(19), is(Constants._19.trim()));
        assertThat(facundia.cardinal(20), is(Constants._20.trim()));
        assertThat(facundia.cardinal(21000), startsWith(Constants._21.trim()));
        assertThat(facundia.cardinal(22), is(Constants._22.trim()));
        assertThat(facundia.cardinal(23), is(Constants._23.trim()));
        assertThat(facundia.cardinal(24), is(Constants._24.trim()));
        assertThat(facundia.cardinal(25), is(Constants._25.trim()));
        assertThat(facundia.cardinal(26), is(Constants._26.trim()));
        assertThat(facundia.cardinal(27), is(Constants._27.trim()));
        assertThat(facundia.cardinal(28), is(Constants._28.trim()));
        assertThat(facundia.cardinal(29), is(Constants._29.trim()));
        assertThat(facundia.cardinal(30), is(Constants._30.trim()));
        assertThat(facundia.cardinal(40), is(Constants._40.trim()));
        assertThat(facundia.cardinal(50), is(Constants._50.trim()));
        assertThat(facundia.cardinal(60), is(Constants._60.trim()));
        assertThat(facundia.cardinal(70), is(Constants._70.trim()));
        assertThat(facundia.cardinal(80), is(Constants._80.trim()));
        assertThat(facundia.cardinal(90), is(Constants._90.trim()));
        assertThat(facundia.cardinal(100), is(Constants._100n.trim()));
        assertThat(facundia.cardinal(101), startsWith(Constants._100.trim()));
        
        assertEquals(Constants._1 + Constants._10E6n.trim(), facundia.cardinal(1000000));
        assertEquals(Constants._1 + Constants._10E12n.trim(), facundia.cardinal(1000000000000L));
        assertEquals(Constants._1 + Constants._10E18n.trim(), facundia.cardinal(1000000000000000000L));
        assertEquals(Constants._1 + Constants._10E24n.trim(), facundia.cardinal("1000000000000000000000000"));

        assertThat(facundia.cardinal(2 * 1000000), endsWith(Constants._10E6.trim()));
        assertThat(facundia.cardinal(2 * 1000000000000L), endsWith(Constants._10E12.trim()));
        assertThat(facundia.cardinal(2 * 1000000000000000000L), endsWith(Constants._10E18.trim()));
        assertThat(facundia.cardinal("2000000000000000000000000"), endsWith(Constants._10E24.trim()));

        assertThat(facundia.cardinal(200), is(Constants._200.trim()));
        assertThat(facundia.cardinal(300), is(Constants._300.trim()));
        assertThat(facundia.cardinal(400), is(Constants._400.trim()));
        assertThat(facundia.cardinal(500), is(Constants._500.trim()));
        assertThat(facundia.cardinal(600), is(Constants._600.trim()));
        assertThat(facundia.cardinal(700), is(Constants._700.trim()));
        assertThat(facundia.cardinal(800), is(Constants._800.trim()));
        assertThat(facundia.cardinal(900), is(Constants._900.trim()));
        assertThat(facundia.cardinal(1000), is(Constants._1000.trim()));

    }

    @Test
    public void specialEndingsTest() {
        assertEquals("ciento uno", facundia.cardinal(101));
        assertEquals("mil veintiuno", facundia.cardinal(1021));
    }

    @Test
    public void miscTest() {
        assertEquals(Constants._1 + Constants._10E18n + Constants._2 + Constants._10E6.trim(), facundia.cardinal(1000000000002000000L));
    }
}
