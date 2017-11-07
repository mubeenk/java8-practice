package com.csc.test.streams;

import java.util.HashMap;
import java.util.Map;

public class Employees {

	private static Map<Integer,Employee> employees = new HashMap<>();
	
	static {
		employees.put(1,new Employee(1,"jerry","GM",1000000.00));
		employees.put(2,new Employee(2,"jason","Coach",800000.00));
		employees.put(3,new Employee(3,"prescott","QB",600000.00));
		employees.put(4,new Employee(4,"zeek","RB",500000.00));
		employees.put(5,new Employee(5,"dez","WR",400000.00));
		employees.put(6,new Employee(6,"jason","TE",300000.00));
		
	}
	
	public static Employee findEmployee(Integer id) {
		//System.out.println(employees.size());
		return employees.get(id);
	}
}
