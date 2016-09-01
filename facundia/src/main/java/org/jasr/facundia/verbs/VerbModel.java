package org.jasr.facundia.verbs;

public class VerbModel {

	
	public static final int INDICATIVO = 0;
	public static final int SUBJUNTIVO = 1;
	public static final int IMPERATIVO = 2;
	
	public static final int PRESENTE = 0;
	public static final int PRETERITO = 1;
	public static final int COPRETERITO = 2;
	public static final int POSPRETERITO = 3;
	public static final int FUTURO = 4;
	
	public static final int YO = 0;
	public static final int  VOS_VOSEO = 1;
	public static final int  TU = 2;
	public static final int  USTED = 3;
	public static final int  EL = 3;
	public static final int  ELLA = 3;
	public static final int  NOSOTROS = 4;
	public static final int  NOSOTRAS = 4;
	public static final int  VOS = 5;
	public static final int  VOSOTROS = 5;
	public static final int  VOSOTRAS = 5;
	public static final int  USTEDES = 6;
	public static final int  ELLOS = 6;
	public static final int  ELLAS = 6;
	  
	private String[] forms = new String[12];
	
	
	public String get(int modo,int tiempo,int persona){
		return forms[modo*100+tiempo*10+persona];
	}
	
	public void set(int modo,int tiempo,int persona,String form){
		forms[modo*100 + tiempo*10 + persona] = form;
	}
}
