package org.jasr.facundia.verbs.conjugators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jasr.facundia.verbs.Conjugacion;
import org.jasr.facundia.verbs.FormasVerbales;

public abstract class ConjugadorBase {
	ConjugadorBase root;
	FormasVerbales forma;
	
	

	public abstract String[][] getReglas();

	public ConjugadorBase getRoot() {
		return root;
	}

	public void setRoot(ConjugadorBase root) {
		this.root = root;
	}

	public FormasVerbales getForma() {
		return forma;
	}

	public void setForma(FormasVerbales forma) {
		this.forma = forma;
	}

	public Conjugacion conjugar(Conjugacion conjugacion) {
		if (this.root == null)
			return conjugacion;
		int i = 0;
		String result = null;
		String[][] reglas = getReglas();
		while (result == null && i < reglas.length) {
			result = regexp(conjugacion, this.root, reglas[i++]);
		}
		return conjugacion.setForma(this.forma, result);
	//	byte[] ptext = result.getBytes(StandardCharsets.ISO_8859_1); 
	//	return conjugacion.setForma(this.forma, new String(ptext, StandardCharsets.UTF_8));
	}

	String regexp(Conjugacion conjugacion, ConjugadorBase root, String[] regla) {

		Pattern pI = Pattern.compile(regla[0]);
		Pattern p = Pattern.compile(regla[1]);
		Matcher mI = pI.matcher(conjugacion.getForma(FormasVerbales.INFINITIVO));
		Matcher m = p.matcher(root.conjugar(conjugacion).getForma(root.forma));
		String result = regla[2];
		if (mI.matches() && m.matches()) {
			if (m.groupCount() > 0) {
				result = result.replace("$1", m.group(1));
				if (m.groupCount() > 1)
					result = result.replace("$2", m.group(2));
			}
			return result;
		}
		return null;
	}

	public ConjugadorBase(FormasVerbales forma, ConjugadorBase root) {
		this.forma = forma;
		this.root = root;
	}
}
