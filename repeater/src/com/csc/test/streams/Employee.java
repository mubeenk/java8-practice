package com.csc.test.streams;

public class Employee {

	private int id;
	private String name;
	private String designatin;
	
	public Employee(Integer id,String name, String designation) {
	
		this.id = id;
		this.name = name;
		this.designatin = designation;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignatin() {
		return designatin;
	}
	public void setDesignatin(String designatin) {
		this.designatin = designatin;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designatin=" + designatin + "]";
	}

	
	
	
}
