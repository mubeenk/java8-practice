package com.csc.test.streams;

import java.util.stream.Stream;

public class SquareSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] series = new Double[] { 1.0,2.0,3.0,4.0,5.0,6.0,7.0 };
		
		Stream.of(series).map(e->Math.pow(e, 2)).forEach(System.out::println);

		Double[] newSeries = Stream.of(series).map(e->Math.pow(e, 2)).toArray(Double[]::new);

		Stream.of(newSeries).map(Math::sqrt).forEach(System.out::println);
			
	}

}
