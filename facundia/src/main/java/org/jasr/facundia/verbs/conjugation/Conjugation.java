package org.jasr.facundia.verbs.conjugation;

import org.jasr.facundia.verbs.VerbForm;

public interface Conjugation {
  public boolean matches(String form);
  public String conjugate(String form);
}
