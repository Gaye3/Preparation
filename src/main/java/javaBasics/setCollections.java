package javaBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class setCollections {
	
	
	public void createSet() {
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		
		set.remove("a");
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(2);
		
		Set<Integer> s1 = new HashSet<>(list);
		System.out.println(s1);
	}
	
	
	public static void main(String[] args) {
		setCollections obj = new setCollections();
		obj.createSet();
	}

}
