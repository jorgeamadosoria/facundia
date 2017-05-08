package org.jasr.facundia.verbs;

import java.util.Arrays;

import org.jasr.facundia.verbs.conjugation.Conjugation;

public class VerbForm {
	private Conjugation[] conjugations;
	private VerbForm root;

	public VerbForm(Conjugation... conjugations) {
		this(null,conjugations);
	}

	public VerbForm(VerbForm root, Conjugation... conjugations) {
		this.root = null;
		this.conjugations = conjugations;
	}
	
	
	public String conjugate(String form) {
		if (root != null)
			form = root.conjugate(form);

		if (conjugations != null)
			return doConjugate(form);
		return form;
	}

	private String doConjugate(String form) {

		return Arrays.stream(conjugations).sequential().filter(conjugation -> conjugation.matches(form)).findFirst()
				.get().conjugate(form);
	}
}
