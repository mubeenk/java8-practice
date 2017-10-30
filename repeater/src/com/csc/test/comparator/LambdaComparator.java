package com.csc.test.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"mark","arifi","sam","bob","charlienew","charmop"};
		Arrays.sort(names,
					(first,second)->first.length()-second.length());
		for(String name:names) {
			System.out.println(name);
		}
		List<String> listOfNames = new ArrayList<String>();
		//listOfNames = Arrays.asList(names);
		for(String name:names) {
			listOfNames.add(name);
		}
		listOfNames.removeIf((String e)->e.equalsIgnoreCase("bob")==true );	// .length()==3
		for(String name:listOfNames) {
			System.out.println("** " + name);
		}		

	}

}
