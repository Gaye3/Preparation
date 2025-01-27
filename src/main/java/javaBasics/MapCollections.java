package javaBasics;

import java.util.HashMap;
import java.util.Map;

public class MapCollections {
	
	public void createMap() {
		
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("a", "abacus");
		map.put("b", "aprocot");
		
		for(Map.Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " "+entry.getValue());
		}
		
		System.out.println(map.containsKey("a"));
		System.out.println(map.containsValue("random"));
		
		map.remove("a");
		
		for(Map.Entry<String,String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " "+entry.getValue());
		}

		
	}
	
	public static void main(String[] args) {
		MapCollections obj = new MapCollections();
		obj.createMap();
	}
	

}
