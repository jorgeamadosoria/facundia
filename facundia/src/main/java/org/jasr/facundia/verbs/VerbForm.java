package org.jasr.facundia.verbs;

import java.util.Arrays;
import java.util.Optional;

import org.jasr.facundia.verbs.conjugation.Conjugation;
import org.jasr.facundia.verbs.conjugation.Rules;

public class VerbForm {
	private Conjugation[] conjugations;
	private VerbForm root;
	private Verb form;

	public VerbForm(Verb form, VerbForm root, String... conjugations) {
		this(form, root, Rules.rules(conjugations));
	}

	public VerbForm(Verb form, String... conjugations) {
		this(null, Rules.rules(conjugations));
	}

	public VerbForm(Verb form, Conjugation... conjugations) {
		this(form, null, conjugations);
	}

	public VerbForm(Verb form, VerbForm root, Conjugation... conjugations) {
		this.form = form;
		this.root = root;
		this.conjugations = conjugations;
	}

	public String conjugate(String infinitive) {
		// System.out.println("ROOT:" + root);
		String form = infinitive;
		if (root != null)
			form = root.conjugate(infinitive);

		if (conjugations != null)
			return doConjugate(infinitive,form);
		return form;
	}

	private String doConjugate(String infinitive,String form) {
		Optional<Conjugation> res = Arrays.stream(conjugations).sequential()
				.filter(conjugation -> filter(infinitive,form, conjugation)).findFirst();

		if (res.isPresent())
			return res.get().conjugate(infinitive);
		else
			return "NOT FOUND";
	}

	private boolean filter(String infinitive,String form, Conjugation conjugation) {
//		if (conjugation.matches(infinitive))
//			System.out.println(conjugation.toString() + " - " + conjugation.matches(infinitive) + " - " + form);
		return conjugation.matches(infinitive);
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		if (form != null)
			sb.append(form.name() + " ");

		if (root != null)
			sb.append(root.toString() + " ");

		return sb.toString();
	}

}
