package justLearning;

public class AddComplexNumber {
	
	// variables for real and imaginary part
	int real;
	int imag;
	
	// consutor for intializing real and img
	public AddComplexNumber(int real,int imag) {
		this.real = real;
		this.imag = imag;
	}

	
	// methos to show the complex numbers
	public void showComplex() {
		System.out.println(real + "+i"+imag);
	}
	
	//Adding two complex numbers
	public static AddComplexNumber add(AddComplexNumber n1,AddComplexNumber n2) {
		AddComplexNumber res = new AddComplexNumber(0,0);
		
		res.real = n1.real + n2.real;
		res.imag = n1.imag + n2.imag;
		
		return res;
	}
	
	
	public static void main(String args[]) {
		AddComplexNumber n1 = new AddComplexNumber(2,3);
		AddComplexNumber n2 = new AddComplexNumber(5,2);
		
		n1.showComplex();
		n2.showComplex();
		
		add(n1,n2).showComplex();
		
	}
	
}
