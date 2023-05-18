package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SelfExample {


		public static void main(String[] args) {
			List<String> nameList = new ArrayList<>();
			nameList.add("Krishna");
			nameList.add("Punter");
			nameList.add("Pinto");
			nameList.add("Kevin");
			nameList.add("Yadav");
		
			List<String> startWithK = nameList.stream().filter(t -> t.startsWith("K")).collect(Collectors.toList());
			
			System.out.println(startWithK);
		}

	

}
