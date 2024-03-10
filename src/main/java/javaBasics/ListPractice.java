package javaBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListPractice {
	
	public static <T> void reverseList(List<T> list) {
	    
		Collections.reverse(list);
		
	}
	
	public static <T> List<T> findDuplicates(List<T> list) {
		
		// 45,67,45,7,8,9,8 -- 7,8,8,9,45,45,67
		List<T> l = new ArrayList<T>();
		list.sort(null);
		
		for(int i=0;i<list.size()-1;i++) {
			if((list.get(i).equals(list.get(i+1)))){
				l.add(list.get(i));
			}
		}
		
		return l;
	  
	}
	
	public static <T> List<T> removeDuplicates(List<T> list) {
		
		list.sort(null);
		
		for(int i=0;i<list.size()-1;i++) {
			if((list.get(i).equals(list.get(i+1)))){
				list.remove(i);
			}
		}
		
		return list;
	}
	
	public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
		
		List<T> l = new ArrayList<T>();
		
		l.addAll(list1);
		l.addAll(list2);
		
		return l;
	    
	}
	
	public static <T> List<T> findCommonElements(List<T> list1, List<T> list2) {
		
		List<T> l = new ArrayList<T>();
		
		
		for(T k : list1) {
			if(list2.contains(k)) {
				l.add(k);
			}
		}
		
		return l;
	}
	
	
	
	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("bApple");
		l.add("allon");
		l.add("cat");
		//ListPractice.reverseList(l);
		l.sort(null);
		System.out.println(l);
		
		LinkedList<Integer> link = new LinkedList<Integer>();
		 
		 link.add(23);
		 link.add(76);
		 link.add(45);
		 link.add(76);
		 link.add(2);
		 link.add(23);
		
		 //System.out.println(ListPractice.removeDuplicates(link));
		 LinkedList<Integer> link2 = new LinkedList<Integer>();
		 
		 link2.add(1);
		 link2.add(2);
		 link2.add(4);
		 link2.add(5);
		 link2.add(6);
		 link2.add(76);
		
		 System.out.println(ListPractice.findCommonElements(link,link2));
		 
		
		
	}

}
