package com.programms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerToUpperCase {
	public static void main(String[]args) {
		List<String> names = Arrays.asList("banana","apple","shiva","chaitan");
		
		List<String> uppercase = names.stream()
				.map( String::toUpperCase)
				.collect(Collectors.toList());
		
		System.out.println(uppercase);
	}

}
