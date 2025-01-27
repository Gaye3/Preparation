package javaBasics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class JavaLoops {
	
	public static void main(String args[]) {
		
		for(int i=0;i<5;i++) {
			System.out.println("For loop");
		}
		
		int x = 0;
		while(x>5) {
			System.out.println("While loop");
			x++;
		}
		
		int y = 0;
		do {
			System.out.println("Do while loop");
		}while(y>5);
		
		
		//reverse
		System.out.println("Printing reverse aaray");
	
		int a[] = {7,6,5,4,3,2};
		
//		int temp[] = new int[a.length];
//		
//		int k = a.length-1;
//		for(int i = 0;i<a.length;i++) {
//			if(k > -1) {
//				temp[k] = a[i];
//				k--;
//			}
//		}
//		
//		for(int j : temp) {
//			System.out.println(j);
//		}
		
		//swapping
		int i = 0;
		int j = a.length-1;
		
		while(i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		
		for(int k : a) {
			System.out.println(k);
		}
		
		//duplicates
		
		int b[] = {4,4,4,2,3,9,22,98,9,2,2,4};
		
		System.out.println("Printing duplicates");
		
//		for(int m=0;m<b.length;m++) {
//			for(int n=m+1;n<b.length;n++) {
//				if(b[m]==b[n]) {
//					System.out.println(b[n]);
//				}
//			}
//		}
		
		Map<Integer,Integer> map = new HashMap<>(); 
        int count = 0; 
        boolean dup = false; 
        for(int m=0;m<b.length;m++) {
        	if(map.containsKey(b[m])) {
        		count = map.get(b[m]);
        		map.put(b[m], count+1);
        	}
        	else {
        		map.put(b[m], 1);
        	}
        }
        
        for(Entry<Integer,Integer> entry : map.entrySet()) 
        { 
            // if frequency is more than 1 
            // print the element 
            if(entry.getValue() > 1){ 
                System.out.print(entry.getKey()+ " "); 
                dup = true; 
            } 
        } 
        // no duplicates present 
        if(!dup){ 
            System.out.println("-1"); 
        } 
        
        System.out.println("String manipulations");
        
        String s = "hii how are u";
        char c = 'g';
        int index = 4;
        
        s = s.substring(0,index)+c+s.substring(index+1,s.length());
        System.out.println(s);
        
        System.out.println("reverse a string");
        
        String str = "AbaBed";
        
        String nstr = "";
        
        char ch;
        
        for(int o=0;o<str.length();o++) {
        	ch = str.charAt(o);
        	nstr = ch+nstr;
        }
        
        System.out.println(nstr);
        
        char l[] = str.toCharArray();
        Arrays.sort(l);
        
        for(char q:l) {
        	System.out.println(q);
        }
        
        
        String d1 = "hello";
        String d2 = "hello";
        
        System.out.println(d1.equals(d2));
        
        
	}

}
