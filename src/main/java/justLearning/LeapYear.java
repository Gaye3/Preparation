package justLearning;

public class LeapYear {
	
	public static boolean checkLeap(int year) {
		
		boolean leapYear = false;
		
		if(year % 4 == 0) {
			leapYear = true;
			
			if(year % 100 == 0){
				
				if(year % 400 == 0) {
					leapYear = true;
				}else {
					leapYear = false;
				}
			}
			
		}
		return leapYear;
	}
	
	public static void printLeap(int year) {
		if(checkLeap(year)) {
			System.out.println(year +": is leap year");
		}
		else {
			System.out.println(year +": is not a leap year");
		}
	}
	
	public boolean findVowel(String name){
		
		String vowels = "aeiouAEIOU";
		int vowelsCount = 0;
		for(char i : name.toCharArray()){
			if(vowels.indexOf(i) != -1){
				vowelsCount += 1;
			}
		}
		
		
		return (vowelsCount > 0) ? true : false;

	}

	
	public static void main(String[] args) {
		LeapYear.printLeap(2000);
		LeapYear.printLeap(2002);
		LeapYear.printLeap(2020);
		
		LeapYear l = new LeapYear();
		System.out.println(l.findVowel("gythr"));
	}

}
