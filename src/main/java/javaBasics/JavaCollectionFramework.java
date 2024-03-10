package javaBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class JavaCollectionFramework {
	
	public static void listImplementation() {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(56);
		list.add(1, 67);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(8);
		list2.add(2);
		
		list.addAll(list2);
		
		System.out.println(list.get(2));
		System.out.println(list);
		
		list.remove(2);
		
		
		//list.add(0,3);
		
		System.out.println(list+" complete list");
		System.out.println(list.size());
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			Integer x = it.next();
			System.out.println(x);
		}
		
	}
	
	public static void setImplementation() {
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		for(Integer x: set) {
			System.out.println(x);
		}
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			Integer x = it.next();
			System.out.println(x);
		}
		
		
		System.out.println(set);
		
	}
	
	public static void mapImplementation() {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(1, "m");
		
		System.out.println(map.keySet());
		
		System.out.println(map.get(1));
		
		map.replace(1, "Z");
		
		System.out.println(map.get(1));
		
		System.out.println(map.entrySet());
		
		for(Integer i : map.keySet()) {
			System.out.println(i+" "+map.get(i));
		}
		
		Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> i = itr.next();
			System.out.println("Key = "+i.getKey()+" Value = "+i.getValue());
		}
		
		
	}
	
	public static void main(String[] args) {
		mapImplementation();
	}

}
