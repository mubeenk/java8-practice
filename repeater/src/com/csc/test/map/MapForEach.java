package com.csc.test.map;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		map.put("one", "january");
		map.put("two", "february");
		map.put("three", "march");
		
		map.forEach((key,val)->System.out.println(key + " .. " + val));
	}

}
