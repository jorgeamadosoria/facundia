package org.jasr.facundia.verbs.conjugation;

public class Exception implements Conjugation {

    private String form;
    private String replace;
    
    public Exception(String form,String replace){
        this.form = form;
        this.replace = replace;
    }
    
    @Override
    public boolean matches(String form) {
        return this.form.equals(form);
    }

    @Override
    public String conjugate(String form) {
        return replace;
    }
    
    
}
