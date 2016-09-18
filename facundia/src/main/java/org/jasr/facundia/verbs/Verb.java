package org.jasr.facundia.verbs;

public class Verb {

    public static final int INDICATIVO   = 0;
    public static final int SUBJUNTIVO   = 1;
    public static final int IMPERATIVO   = 2;

    public static final int PRESENTE     = 0;
    public static final int PRETERITO    = 1;
    public static final int COPRETERITO  = 2;
    public static final int POSPRETERITO = 3;
    public static final int FUTURO       = 4;

    public static final int YO           = 0;
    public static final int VOS_VOSEO    = 1;
    public static final int TU           = 2;
    public static final int USTED        = 3;
    public static final int EL           = 3;
    public static final int ELLA         = 3;
    public static final int NOSOTROS     = 4;
    public static final int NOSOTRAS     = 4;
    public static final int VOS          = 5;
    public static final int VOSOTROS     = 5;
    public static final int VOSOTRAS     = 5;
    public static final int USTEDES      = 6;
    public static final int ELLOS        = 6;
    public static final int ELLAS        = 6;

    private String          stem;
    private String          infinitive;
    private String          gerund;
    private String          participle;
    private String[]        forms        = new String[12];

    public Verb(String infinitive,  String stem) {
        this.infinitive = infinitive;
        this.stem = stem;
    }

    
    
    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public String getInfinitive() {
        return infinitive;
    }

    public void setInfinitive(String infinitive) {
        this.infinitive = infinitive;
    }

    public String getGerund() {
        return gerund;
    }

    public void setGerund(String gerund) {
        this.gerund = gerund;
    }

    public String getParticiple() {
        return participle;
    }

    public void setParticiple(String participle) {
        this.participle = participle;
    }

    public String get(int modo, int tiempo, int persona) {
        return forms[modo * 100 + tiempo * 10 + persona];
    }

    public void set(int modo, int tiempo, int persona, String form) {
        forms[modo * 100 + tiempo * 10 + persona] = form;
    }

    public String conjugate(String infinitive, int modo, int tiempo, int persona) {
        return stem + forms[modo * 100 + tiempo * 10 + persona];
    }
}