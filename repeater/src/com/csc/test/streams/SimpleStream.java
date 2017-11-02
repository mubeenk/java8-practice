package com.csc.test.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStream {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.addAll(	Arrays.asList(new String[] {"abc","one","two","three","next","out","orb","or","on"}));
		
		list.stream().filter(s->s.startsWith("o")).
					  filter(s->s.length() > 3).
					  map(s->s.toUpperCase()).
					  forEach(System.out::println);
		

	}
}
