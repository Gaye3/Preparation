package javaBasics;

public class CompareStringByChar {
	
	public static void compare(String s1,String s2){
		int len = s2.length();
		int k = 0;
		for(char i : s1.toCharArray()){
			
			if((i == s2.charAt(k)) && (k < len)){
				System.out.println(i+" "+s2.charAt(k)+"are equal");
				k++;
			}
		}
	}
	
	//Removing the main method as per comments
	//Compare working directory file with staging directory
}
