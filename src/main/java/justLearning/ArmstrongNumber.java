package justLearning;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		//traverse all the num
		int num1 = 50;
		int num2 = 500;
		for(int i= num1+1;i<=num2;i++) {
			
			//counting how many digits are there in a num
			int y = i;
			int N = 0;
			while (y != 0 ) {
				y /= 10;
				++N;
			}
			
			//calulating the sum of nth power
			int sum = 0;
			y = i;
			while(y!= 0) {
				int d = y%10;
				sum += Math.pow(d, N);
				y = y/10;
			}
			
			if(sum == i)
				System.out.println(i+" ");
		}
		
		//neon
		System.out.println("Printing neon numbers");
		
		int n1 = 5;
		int n2 = 50;
		
		for(int i=n1;i<=n2;i++) {
			
			int square = i*i;
			int res = 0;
			while(square != 0) {
				res += square%10;
				square /= 10;
			}
			
			if(res == i) {
				System.out.println(i+" is neon number");
			}
			
		}
		
		//vowels or constants
		
		String str = "aeiouAEIOU";
		System.out.println((str.indexOf('k') != -1)?"vowel":"constant");
		
		ArmstrongNumber ob = new ArmstrongNumber();
		System.out.println(ob.factorial(4));
		System.out.println(ob.factorial(9));
		
		//printing fibo
		System.out.println("Printing fibo");
		System.out.print(0+" "+1);
		ob.fibinacci(10-2);
	}
	
	public int factorial(int num) {
		if(num == 0 || num == 1) {
			return 1;
		}
		else {
			return num * factorial(num-1);
		}
	}
	static int n1 = 0,n2 = 1,n3;
	public void fibinacci(int num) {
		
		if(num > 0) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			fibinacci(num-1);
		}
	}

}
