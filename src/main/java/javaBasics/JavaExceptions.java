package javaBasics;

public class JavaExceptions {
	
	public static void handleExceptions() {
		
		try {
			int x = 9;
			System.out.println(56/x);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("-------");
			e.printStackTrace();
		}finally {
			System.out.println("Always run");
		}
		
	}
	
	public static void main(String args[]) {
		handleExceptions();
	}

}
