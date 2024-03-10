package javaBasics;

public class JavaDatatypes {
	
	public void printPrimitiveTypes() {
		int x = 9;
		float y = 8;
		double z = 9.443;
		boolean val = true;
		char k = 'u';
		long a = 989877658;
		short l = 7623;
		byte p = 99;
		
		System.out.println(x+" "+y+" "+z+" "+val+" "+k+" "+a+" "+l+" "+p);
		
		long rand = (long) (x+y+z+a+l+p);
		double ran = x+y+z+a+l+p;
		
		System.out.println(rand);
		System.out.println(ran);
	}
	
	public void printNonPrimitiveTypes() {
		String val = "hello";
		int[] values = {8,3,6};
		
		System.out.println(val);
		
		for(int i : values) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String args[]) {
		JavaDatatypes obj = new JavaDatatypes();
		obj.printNonPrimitiveTypes();
		obj.printPrimitiveTypes();
	}


}
