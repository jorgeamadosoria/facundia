package org.jasr.facundia.rules;

public interface Rule {

    String apply(String singular);

    boolean doesApply(String singular);

}
