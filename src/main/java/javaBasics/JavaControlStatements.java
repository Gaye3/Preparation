package javaBasics;

public class JavaControlStatements {
	
	public void ifCtrlStmt(int x) {
		
		if(x%2 == 0) {
			System.out.println("x is even");
		}
		else if(x%2 != 0) {
			System.out.println("X is odd");
		}
		else {
			System.out.println("x is invalid");
		}
	}

	public void switchCtrlStmt(int day) {
		switch(day) {
		case 1 : 
			System.out.println("Monday");
			break;
			
		case 2 :
			System.out.println("Tuesday");
			break;
			
		default:
			System.out.println("Default");
		}
		
	}
	
	public static void main(String[] args) {
		JavaControlStatements obj = new JavaControlStatements();
		obj.ifCtrlStmt(5);
		obj.switchCtrlStmt(2);
		obj.switchCtrlStmt(8);
		main("v");
	}
	
	public static void main(String a) {
		int i = 1;
		
		System.out.println(i++);
		System.out.println(i++);
		
		int j = 1;
		System.out.println(++j);
		System.out.println(++j);
	}
	
}
