package com.programms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumber {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,34,32,55,76,123,3);
		
		Optional<Integer> max= numbers.stream().max(Integer::compare);
		
		max.ifPresent(System.out::println);
	}

}
