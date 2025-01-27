package justLearning;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	
	
	public static String reverse(String value) {
		
		String temp = "";
		
		for(char i: value.toCharArray()) {
			temp = i + temp;
		}
		
		return temp;
	}
	
	public static void countNumStrSpec(String value) {
		
		int num = 0,str = 0,spec = 0;
		
		for(char i : value.toCharArray()) {
			
			if(i> 96 && i< 123) {
				str++;
			}
			else if(i > 64 && i<91) {
				str++;
			}
			else if(i > 47 && i<58) {
				num++;
			}
			else {
				spec++;
			}
		}
		
		System.out.println("count of alphabetes "+str);
		System.out.println("Count of numbers "+num);
		System.out.println("Count of special characters "+spec);
		
		
	}
	
	public static void main(String[] args) {
		
		String r = "hello world";
		r = r.replace(" ", "");
		System.out.println(r);
		
		r = "   hy  ";
		r = r.strip();
		System.out.println(r);
		
		System.out.println(RemoveWhiteSpaces.reverse("madam"));
		
		System.out.println(-5+8*6);
		
		RemoveWhiteSpaces.countNumStrSpec("Abc%123_dEf");
		
		
	}

}
