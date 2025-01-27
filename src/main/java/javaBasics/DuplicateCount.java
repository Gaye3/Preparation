package javaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class DuplicateCount {
	
	
	// ex: I want to change my life and job
	// iwanttochangemylifeandjob
	// remove spaces and combine the whole word
	
	public static void duplicates(String str) {
		
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(char i : str.toCharArray()) {
			
			if (i != ' ') {
				//map.put(i, map.getOrDefault(i, 0)+1);
			}
			
		}
		
		for(char i : str.toCharArray()) {
			if(map.get(i) > 1) {
				System.out.println(i + " - " + map.get(i) + " times");
			}
		}
	}
	
	
	public static void printDuplicates(String value) {
		
		String result = value.toLowerCase().replace(" ", "");
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char i : result.toCharArray()) {
			
			if(!map.containsKey(i)) {
				
				map.put(i, 1);
				
			}
			else {
				int t = map.get(i);
				map.replace(i, t+1);
			}
			
		}
		
		
		for(Character key : map.keySet()) {
			
			if(map.get(key) > 1) {
				System.out.println(key+ "- "+map.get(key));
			}
		}
		
	}
	
	
	public static void sortMap() {
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("c", 3);
		map.put("z", 1);
		map.put("a", 2);
		
		for(Map.Entry<String,Integer> entry: map.entrySet()) {
			
			System.out.println(entry);
			
		}
		
		Map<String,Integer> sMap = new TreeMap<>();
		sMap.putAll(map);
		
		for(Map.Entry<String,Integer> entry: sMap.entrySet()) {
			
			System.out.println(entry.getKey() + " "+entry.getValue());
			
		}
		
	}
	public static void main(String[] args) {
		DuplicateCount.printDuplicates(null);;
	}

}
