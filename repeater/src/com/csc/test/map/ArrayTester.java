package com.csc.test.map;

public class ArrayTester {

	public static void modifyArray(String[] array) {
		array[1]="must";
		array[2]="see";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"flip","roman","tree"};
		modifyArray(array);
		for(String line:array)
			System.out.println(line);
	}

}
