package javaBasics;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctChar {
	
	public static void main(String[] args) {
		
		String k = "count the unique char";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(char i : k.toCharArray()) {
			if(!map.containsKey(i)) {
				map.put(i, 1);			
			}
			else {
				map.put(i, map.getOrDefault(i, 0)+1);
			}
		}
		
		int count = 0;
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue() <= 1) {
				count += 1;
				System.out.println(entry.getKey());
			}
		}
		
		System.out.println("Unique characcters count : "+count);
		
	}

}
