package org.jasr.facundia.verbs.conjugation;

public interface Conjugation {
  public boolean matches(String form);
  public String conjugate(String form);
}
