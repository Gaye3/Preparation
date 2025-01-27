package justLearning;

public class PrimeNumbers {
	
	
	public void printPrime(int n) {
		
		for(int i=1;i<=n;i++) {
			
			if (i==1 || i==0) {
				continue;
			}
			
//			int k = i/2;
			int res = 0;
//			while(k > 0) { //
//				
//				if(i%k == 0) {
//					res++;
//					k--;
//				}
//				else {
//					k--;
//				}
//			}
			for(int k = i/2; k > 0; k--) {
				if(i%k == 0) {
					res++;
				}
			}
			
			
			if(res == 1) {
				System.out.println(i+" ");
			}
			
		}
		
	}
	
	public static void main(String args[]) {
		PrimeNumbers ob = new PrimeNumbers();
		ob.printPrime(11);
		int i = 1;
		System.out.println(++i);
	}

}
