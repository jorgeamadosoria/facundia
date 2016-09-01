package org.jasr.facundia.verbs;

public class RegularVerbModel extends VerbModelBase{

	public RegularVerbModel(String[] forms) {
		super(forms);
	}
	
	protected String stem(String infinitive){
		return infinitive.substring(0,infinitive.length()-2);
	}

	public String conjugate(String infinitive,int modo, int tiempo, int persona) {
		return stem(infinitive) + forms[modo * 100 + tiempo * 10 + persona];
	}

}
