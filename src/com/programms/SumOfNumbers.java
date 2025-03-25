package com.programms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		List<Integer> numbers= Arrays.asList(2,3,4,54,6,6);
		
		int sum = numbers.stream()
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println("sum is:"+ sum);
	}

}
