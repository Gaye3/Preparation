package justLearning;

public class CheckOddEven {
	
	
	public void oddEven(int num) {
		if((num%2) == 0) {
			System.out.println(num + " is Even number");
		}
		else {
			System.out.println(num + " is odd number");
		}
	}

	public static void main(String args[]) {
		//Test data - 1,2,3,60,543,34562,0,-2,-3,0.4,-9.5
		
		CheckOddEven obj = new CheckOddEven();
		
//		obj.oddEven(1);
//		obj.oddEven(2);
//		obj.oddEven(60);
//		obj.oddEven(543);
//		obj.oddEven(34562);
		
		obj.oddEven(0);
		obj.oddEven(-2);
		obj.oddEven(-3);
		
	}
	
}
