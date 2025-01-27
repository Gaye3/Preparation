package javaBasics;

public class EnumPractice {
	
	enum Level{
		LOW,
		MEDIUM,
		HIGH
	}
	
	public static void main(String[] args) {
		Level myvar = Level.MEDIUM;
		System.out.println(myvar);
		
		for(Level val : Level.values()) {
			System.out.println(val);
		}
	}

}
