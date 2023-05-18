package com.quescol;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
	
		//Q1). Java 8 Program to add prefix and suffix to the String?
		String name[] = {"Krishna","Punter"};
		String single = "Krishna";
		
		List<String> strList = Arrays.asList("Krishna","Punter","Kevin","KrishnaS","Punter");
		
		StringJoiner joiner = new StringJoiner(",", "%", "%");
		joiner.add(single);
		
		String joinedArrayString = String.join(",",strList);
		System.out.println(joiner);
		System.out.println(joinedArrayString);
		
		System.out.println("--------------------------");

		//Q2). Java 8 Program to Print ten random numbers using forEach?
		
		Random ra = new Random();
		
		
		//Generates 10 random number between 0 - 100
		ra.ints(0, 100).limit(10).forEach(System.out::println);
		System.out.println("--------------------------");
		
		// Generate single random number under 10
		int upperBound = 10;
		int next = ra.nextInt(upperBound);
		System.out.println(next);
		
		System.out.println("--------------------------");
		
		//Q3). Java 8 program to iterate a Stream using the forEach method?
		
		strList.stream().forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		//Q4). Java 8 program to find the Minimum number of a Stream?
		
		Integer [] a = {1,2,3,4,5};
		Integer min =Stream.of(a).min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
		
		//Q5). Java 8 program to find the Maximum number of a Stream?
		
		Integer max = Stream.of(a).max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		System.out.println("--------------------------");
		//Q6) Java 8 program to Count Strings whose length is greater than 3 in List?
		
		long strmaxLengthCountt = strList.stream().filter(str->str.length() > 5).count();
		
		System.out.println(strmaxLengthCountt);
		
		List<String> maxLength = strList.stream().filter(str->str.length() > 5).collect(Collectors.toList());
		System.out.println(maxLength);
		strList.stream().filter(str->str.length() > 5).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("--------------------------");
		//Q8) Java 8 program to multiply 3 to all element in list and print the list?
		
		Stream.of(a).map(t->t*3).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("--------------------------");
		//Q9) Java 8 program to perform concatenation on two Streams?
		
		Integer [] b = {6,7,8};
		
		Stream<Integer> concatStream  = Stream.concat(Stream.of(a), Stream.of(b));
		concatStream.forEach(System.out::println);
		
		System.out.println("--------------------------");
		//Q10) Java 8 program to remove the duplicate elements from the list?
		
		strList.stream().distinct().forEach(System.out::println);
		Integer [] ab = {1,2,3,4,5,1,2,3};
		
		Stream.of(ab).collect(Collectors.toSet()).forEach(System.out::println);
		
		//Q11) Print current date and time in Java 8 Date and Time API?

		System.out.println(LocalDate.now());
		
		System.out.println("--------------------------");
		//Q12) Java 8 program to sort the given list?
		
		List<String> sortList = Arrays.asList("A","B","C","D","E");
	
		sortList.stream().sorted().forEach(System.out::println); // DefAULT ascending sorting
		System.out.println("--");
		sortList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("--");
		Stream.of(b).sorted().forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		//Q13). Write a Java 8 program to get the sum of all numbers present in a list?
		
		System.out.println(Stream.of(b).mapToInt(Integer::intValue).sum());
		
		System.out.println("--------------------------");
		//Q14) Java 8 program to perfrom cube on list elements and filter numbers greater than 50.
		
		
		Stream.of(b).map(i->i*i*i).filter(i->i>200).collect(Collectors.toList()).forEach(System.out::println);
		
		
	}

}
