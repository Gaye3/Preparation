package javaBasics;

public class removeDuplicates {
	
	
	public static void main(String[] args) {
		
		String v = "steam iron havells";
		String res = "";
		
		for(char i : v.toCharArray()) {
			if(i != 'e') {
				res = res + i;
			}
		}
		
		System.out.println(res);
		
		String k = "random apple falls down";
		String l = k.replace("a", "");
		System.out.println(l);
		
	}

}
