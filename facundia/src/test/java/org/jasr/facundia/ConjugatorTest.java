package org.jasr.facundia;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.URL;

import org.apache.commons.lang3.StringUtils;
import org.jasr.facundia.verbs.Conjugator;
import org.jasr.facundia.verbs.Verb;
import org.junit.Before;
import org.junit.Test;

public class ConjugatorTest {

	private Conjugator conjugator;

	@Before
	public void setUp() {
		this.conjugator = new Conjugator();
	}

	// @Test
	// public void happyPathTest(){
	//
	// conjugator.conjugate("herir").entrySet().forEach(entry ->
	// System.out.println(entry.getKey()+"-"+entry.getValue()));
	// }
	//
	@Test
	public void singleFormTest() throws Exception {

		Verb form = Verb.PRES_IND_YO;
boolean fail = false;
		URL url = Thread.currentThread().getContextClassLoader().getResource("verbs.csv");
		File file = new File(url.getPath());
		LineNumberReader csv = new LineNumberReader(new FileReader(file));

		while (csv.ready()) {

			String[] forms = csv.readLine().split(",");
			String conjugation = conjugator.conjugate(forms[Verb.INF.ordinal()].trim(), form);

			if (!StringUtils.equals(conjugation, forms[form.ordinal()].trim()))
				 fail = true;
				System.out.println(forms[Verb.INF.ordinal()].trim() + " -> "+ conjugation + " = " + forms[form.ordinal()].trim());
			// System.out.println(StringUtils.equals(conjugation,
			// forms[form.ordinal()])?"OK":"NO");

		}
		
		assertEquals(false, fail);
	}

}
