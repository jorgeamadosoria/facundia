package org.jasr.facundia.verbs;

import java.util.Arrays;

import org.jasr.facundia.verbs.conjugation.Conjugation;

public class VerbForm {
    private Verb        name;
    private Conjugation[] conjugations;
    private VerbForm root;

    public VerbForm(Verb name, Conjugation... conjugations) {
        this.root = null;
        this.name = name;
        this.conjugations = conjugations;
    }
    
    public VerbForm(Verb name, VerbForm root,Conjugation... conjugations) {
        this.root = root;
        this.name = name;
        this.conjugations = conjugations;
    }

    public Verb getRoot() {
        return root == null?Verb.INF:root.getName();
    }

    public Verb getName() {
        return name;
    }

    public String conjugate(String form) {
        
        
        return Arrays.stream(conjugations).sequential().filter(conjugation -> conjugation.matches(form)).findFirst().get()
                .conjugate(form);
    }
}
