package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
	
		List<String> teamIndiaPlayers = Arrays.asList("Virat","Dhoni","Pant","Surya","Shami","Chahal","Ashwin");
		List<String> teamAustraliaPlayers = Arrays.asList("Green","Starc","Hazelwood","Zampa","Carey","Warner","Labuchange");
		List<String> teamSouthAfricaPlayers = Arrays.asList("Norjhe","Rabada","Maharaj","Lungi","Decock","Markram","Miller");
		List<String> teamEnglandPlayers = Arrays.asList("Liam","Ben Stokes","Roy","Salt","Brook","Willey","Anderson");
		List<String> teamNewzealandPlayers = Arrays.asList("Williamson","Chapman","Boult","Santner","Henry","Wagner","Conway");
		
		List<List<String>> teams = new ArrayList<>();
		teams.add(teamIndiaPlayers);
		teams.add(teamAustraliaPlayers);
		teams.add(teamSouthAfricaPlayers);
		teams.add(teamEnglandPlayers);
		teams.add(teamNewzealandPlayers);
		
		//Print all player before java 8
		System.out.println("---------BEFORE JAVA 8-------------");
		
		List<String> allPlayers = new ArrayList<>();
		
		for(List<String> allTeams : teams) {
			
			for(String name: allTeams) {
				allPlayers.add(name);
				//System.out.println(name);
			}
		}
		
		System.out.println(allPlayers);
		
		System.out.println("--------USING JAVA 8--------------");
		
		List<String> flatMapList = teams.stream()
				.flatMap(allplyr->allplyr.stream())
				.collect(Collectors.toList());
		
		System.out.println(flatMapList);
		
		teams.stream()
				.flatMap(allplyr->allplyr.stream())
				.collect(Collectors.toList()).forEach(System.out::println);
		
		

	}

}
