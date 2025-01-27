package justLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Patterns {
	
	public static void rightTriangle(int n) {
		
		for(int i = 1;i<=n;i++) {
			for(int j = 0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void leftTriangle(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=n;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Patterns.leftTriangle(5);
		
		int arr[] = {3,2,7,-32,5};
		
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		
		Integer arr1[] = {3,2,7,32,5};
		
		Arrays.sort(arr1,Collections.reverseOrder());
		System.out.println("Modified arr[] : "
                + Arrays.toString(arr1));
		
		int a[] = {2,4,5,6,2,3,4,4};
		HashSet s = new HashSet();
		for(int i:a) {
			s.add(i);
		}
		System.out.println(s.toString());
		
		System.out.println("Printing array");
		int arr4[] = {4,2,1,2,5,7,9,8,2};
		int arr5[] = Arrays.copyOf(arr4, 4);
		for(int i : arr5) {
			System.out.println(i);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i: arr4) {
			list.add(i);
		}
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i) == 2) {
				list.remove(i);
			}
		}
		
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(9);
		list2.add(10);
		list2.add(7);
		
		list.retainAll(list2);
		
		System.out.println(list);
		System.out.println(list2);
		
		
		
		
	}

}
