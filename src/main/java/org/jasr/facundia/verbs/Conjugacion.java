package org.jasr.facundia.verbs;

import java.util.Arrays;

public class Conjugacion {
	private String[] formas = new String[FormasVerbales.values().length];

	public Conjugacion(String[] formas) {
		this.formas = formas;
	}

	public Conjugacion(String infinitivo) {
		this.formas[FormasVerbales.INFINITIVO.ordinal()] = infinitivo;
	}

	public Conjugacion setForma(FormasVerbales formaVerbal, String conjugacion) {
		this.formas[formaVerbal.ordinal()] = conjugacion;
		return this;
	}

	public String getForma(FormasVerbales formaVerbal) {
		return this.formas[formaVerbal.ordinal()];
	}

	public String[] getVerbArray() {
		return this.formas;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conjugacion other = (Conjugacion) obj;
		if (!Arrays.equals(formas, other.formas))
			return false;
		return true;
	}

	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(formas);
		return result;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < FormasVerbales.values().length; i++) {
			sb.append(formas[i]);
			sb.append("\t");
		}
		sb.append("\n");
		return sb.toString();
	}
*/
}
