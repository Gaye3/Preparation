package oopsBasics;

public class InheritanceChildClass extends InheritanceParentClass{
	
	
	public void start() {
		super.start();
		System.out.println("Child class start method");
	}
	
	
	public static void main(String args[]) {
		InheritanceChildClass c = new InheritanceChildClass();
		c.start();
		c.end();
		
		InheritanceParentClass p = new InheritanceParentClass();
		p.start();
		p.end();
		
		InheritanceParentClass k = new InheritanceChildClass();
		
		k.start();
		k.end();
	}

}
