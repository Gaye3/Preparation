package justLearning;

public class LargeNum {
	
	public void large(int x,int y,int z) {
		
		if(x>y) {
			if(x > z) {
				System.out.println(x+" is greater");
			}
			else {
				System.out.println(z+" is greater");
			}	
		}
		else if(y > z) {
			System.out.println(y+" is greater");
		}
		else {
			System.out.println(z+" is greater");
		}
		
		
	}
	
	public static void main(String args[]) {
		LargeNum ob = new LargeNum();
		ob.large(4, 6, 3);
		ob.large(56, 20, 7);
		ob.large(9, 99,999);
		
		
	}
	

}
