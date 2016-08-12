package org.jasr.facundia.inflector.rules;

import org.jasr.facundia.inflector.InflectionResult;

public interface Rule {

    InflectionResult apply(String singular);

    String getDescription();
}
