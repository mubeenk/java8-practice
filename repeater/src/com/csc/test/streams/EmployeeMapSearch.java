package com.csc.test.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMapSearch {
	
	public static void main(String[] args) {
		
		Integer[] ids = new Integer[] { 1, 3, 5};
		
		Stream.of(ids).map(Employees::findEmployee).
						filter(e->e.getDesignatin().compareToIgnoreCase("WR") == 0).
					   forEach(System.out::println);		
	
	}
}

