package javaBasics;

public class JavaThreads extends Thread{
	
	int multiplier = 0;
	
	public JavaThreads(int multiplier) {
		this.multiplier = multiplier;
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(multiplier+"X"+i+"="+(multiplier*i));
		}
	}
	
	
	public static void main(String[] args) {
		JavaThreads obj = new JavaThreads(2);
		JavaThreads obj1 = new JavaThreads(5);
		JavaThreads obj2 = new JavaThreads(8);
		JavaThreads obj3 = new JavaThreads(9);
		
		obj.start();
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
