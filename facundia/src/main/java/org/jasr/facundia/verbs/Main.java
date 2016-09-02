package org.jasr.facundia.verbs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		List<String> verbs = FileUtils.readLines(new File("C:/Users/jasr/Downloads/verbosConjugacionesRae.csv"));
		List<String> verbsFaulty = new ArrayList<>();
		List<String> verbsOk = new ArrayList<>();
		int i = 0;
		for(String verb:verbs){
	//		System.out.println(verb);
			String[] forms = verb.split(",");
			String stem = forms[2];
			if (forms.length < 129){
				verbsFaulty.add(verb);
			}
			else
				verbsOk.add(verb);
		/*	for(String form:forms){
				if (form.startsWith(stem)) i++;
			}
			*/
		}
		
		FileUtils.writeLines(new File("C:/Users/jasr/Downloads/verbosConjugacionesRaeFaulty.csv"),verbsFaulty);
		FileUtils.writeLines(new File("C:/Users/jasr/Downloads/verbosConjugacionesRaeOk.csv"),verbsOk);
		
		
		System.out.println(i);
	}

}
