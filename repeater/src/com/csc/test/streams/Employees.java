package com.csc.test.streams;

import java.util.HashMap;
import java.util.Map;

public class Employees {

	private static Map<Integer,Employee> employees = new HashMap<>();
	
	static {
		employees.put(1,new Employee(1,"jerry","GM"));
		employees.put(2,new Employee(2,"jason","Coach"));
		employees.put(3,new Employee(3,"prescott","QB"));
		employees.put(4,new Employee(4,"zeek","RB"));
		employees.put(5,new Employee(5,"dez","WR"));
		employees.put(6,new Employee(6,"jason","TE"));
		
	}
	
	public static Employee findEmployee(Integer id) {
		//System.out.println(employees.size());
		return employees.get(id);
	}
}
