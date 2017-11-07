package com.csc.test.streams;

import java.util.stream.Stream;

public class ReduceStream {

	public static void main(String[] args) {
		
		Integer[] ids = new Integer[] {  3, 5,6,7,8,9,13,14,15,16,17,18,20 };
		
		Integer result = Stream.of(ids).reduce(0, (n1,n2)->n1+n2);
		System.out.println(result);

		Integer result2 = Stream.of(ids).reduce(0, Integer::sum);
		System.out.println(result2);

		Integer result3 = Stream.of(ids).reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println(result3);
		
		
		String[] strings = new String[] {"a","b","c","D","e"};
		
		System.out.println( Stream.of(strings).
				map(String::toUpperCase).
				reduce("",String::concat));
		
		
		}
}
	
