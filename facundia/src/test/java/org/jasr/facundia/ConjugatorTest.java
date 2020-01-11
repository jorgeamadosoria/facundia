package org.jasr.facundia;

import java.io.IOException;
import java.util.Arrays;

import org.jasr.facundia.verbs.Conjugacion;
import org.jasr.facundia.verbs.Conjugator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConjugatorTest {

	private Conjugator conjugator;

	@Before
	public void setUp() {
		this.conjugator = new Conjugator();
	}

	@Test
	public void conjugate() throws IOException {
	/*	Path path = Paths.get("different.txt");
		(new File("different.txt")).delete();
		(new File("different.txt")).createNewFile();
		Path path2 = Paths.get("data-copy.txt");
		(new File("data-copy.txt")).delete();
		(new File("data-copy.txt")).createNewFile();
		Files.write(path, "Reverse\t".getBytes(), StandardOpenOption.APPEND);
		Arrays.stream(FormasVerbales.values()).forEach(c -> {
			try {
				Files.write(path, (c.toString() + "\t").getBytes(), StandardOpenOption.APPEND);
				Files.write(path2, (c.toString() + "\t").getBytes(), StandardOpenOption.APPEND);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});
		Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
		Files.write(path2, "\n".getBytes(), StandardOpenOption.APPEND);
		

		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data.txt"), "UTF8"))) {

			String cLine = br.readLine();
			Conjugacion modelConj = new Conjugacion(cLine.split("\t"));
			while ((cLine = br.readLine()) != null) {
				modelConj = new Conjugacion(cLine.split("\t"));
				Conjugacion testConj = conjugator.conjugate(modelConj.getForma(FormasVerbales.INFINITIVO));
				if (!modelConj.equals(testConj)) {
					Files.write(path2, modelConj.toString().getBytes(), StandardOpenOption.APPEND);
					Files.write(path, new StringBuilder(modelConj.getForma(FormasVerbales.INFINITIVO)).reverse().toString().getBytes(), StandardOpenOption.APPEND);
					Files.write(path, "\t".getBytes(), StandardOpenOption.APPEND);
					Files.write(path, modelConj.getForma(FormasVerbales.INFINITIVO).getBytes(), StandardOpenOption.APPEND);
					Files.write(path, "\t".getBytes(), StandardOpenOption.APPEND);
					for (int i = 1; i < modelConj.getVerbArray().length; i++) {
						if (!modelConj.getVerbArray()[i].equals(testConj.getVerbArray()[i])) {
							Files.write(path, modelConj.getVerbArray()[i].getBytes(), StandardOpenOption.APPEND);
							Files.write(path, "!!".toString().getBytes(), StandardOpenOption.APPEND);
							Files.write(path, testConj.getVerbArray()[i].getBytes(), StandardOpenOption.APPEND);
						}
						else {
							Files.write(path, ".".getBytes(), StandardOpenOption.APPEND);
							
						}
						Files.write(path, "\t".getBytes(), StandardOpenOption.APPEND);
					}
					Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
				} 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
*/
		Conjugacion testConj = conjugator.conjugate("falsear");
		for (String c : testConj.getVerbArray()) {
			System.out.print(c + "\t");
		}
		Arrays.stream(testConj.getVerbArray()).forEach(Assert::assertNotNull);
	
		System.out.println("");
	}

}
