package javaBasics;

import java.math.BigDecimal;

public class JavaVariables {
	
	//instance variables
	double y = 3.67;
	
	//Static variables
	static boolean value = true;
	
	public void localVar() {
		//local variables
		int x = 2;
		String val = "local";
		
		System.out.println("Printing local variables "+val+" "+x);
		System.out.println("static variable called inside method "+value);
		System.out.println("intsance variable called insisde method "+y);
		
	}
	
	public void localVar2() {
		int x = 3;
		String val = "local";
		System.out.println("Printing local variables "+val+" "+x);
	}
	
	public static void main(String args[]) {
		
		System.out.println("static variable "+JavaVariables.value);
		value = false;
		System.out.println("static variable "+JavaVariables.value);
		
		JavaVariables obj = new JavaVariables();
		System.out.println("intsance variable "+obj.y);
		
		obj.y = 5.67;
		System.out.println("intsance variable "+obj.y);
		
		JavaVariables obj2 = new JavaVariables();
		System.out.println("intsance variable "+obj2.y);
		
		System.out.println("---------------------------------------------");
		obj2.localVar();
		obj2.localVar2();
		
		
		System.out.println(0.1+0.2);
		System.out.println(0.1+0.4);
		System.out.println(0.0/0.0);
		System.out.println(9/0.0);
		
		System.out.println(BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2)));
        System.out.println(BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.4)));
	}

}
