package com.programms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		Collections.reverse(numbers);
		System.out.println(numbers);
	}

}
