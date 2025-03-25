package com.programms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
public static void main(String[] args) {
	
	List<Integer> numbers = Arrays.asList(5,3,8,2,1,0);
	
	List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
			
	System.out.println(sortedNumbers);
}
}
