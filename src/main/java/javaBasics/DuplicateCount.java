package javaBasics;

import java.util.ArrayList;
import java.util.HashMap;

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
	
	public static void main(String[] args) {
		DuplicateCount.duplicates("iwanttochangemylifeandjob");
	}

}
