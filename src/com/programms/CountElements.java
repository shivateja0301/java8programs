package com.programms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountElements {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple","banana","apple","orange");

		long count =words.stream().count();
		
		System.out.println("count is "+count);
}
}
