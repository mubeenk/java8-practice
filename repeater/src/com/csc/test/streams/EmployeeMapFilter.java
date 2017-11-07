package com.csc.test.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class EmployeeMapFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ids = new Integer[] { 1, 3, 5};
		
		Stream.of(ids).map(Employees::findEmployee).
						filter(e->e != null).
						filter(e->e.getSalary() > 500000.00).
						limit(2).
					   forEach(System.out::println);	

		Employee empl = Stream.of(ids).map(Employees::findEmployee).
						filter(e->e != null).
						findFirst().get();
		System.out.println("@#@$$#$ " + empl);
		
	}

}
