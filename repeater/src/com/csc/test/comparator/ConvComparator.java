package com.csc.test.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ConvComparator {

	public static void sortArray(String[] array) {
		Collections.sort(Arrays.asList(array), 
					new Comparator<String>() {

						public int compare(String o1, String o2) {
							// TODO Auto-generated method stub
							return o1.length() - o2.length();
						}
			
		}
				);
	}
	
	public static void main(String[] args) {
	
		String[] names = {"mark","arif","sam","bob","charlie","charm"};
		Arrays.sort(names);
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println("-----------------------");
		sortArray(names);
		for(String name:names) {
			System.out.println(name);
		}

	}

}
