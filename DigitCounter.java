import java.util.Scanner; 

public class DigitCounter {
	
	public static void main(String[] args) {
		
		//setting up the scanner
		Scanner input = new Scanner(System.in);
		
		//prompting the user for input
		System.out.println("This program counts the number of digits "
				+ "\nin an integer entered by the user.\nEnter -1 to exit");
		
		//setting boolean for while loop
		boolean state = true;
		
		while(state) {
			System.out.println("Enter number: ");
			//storing users next input in long data type
			long number = input.nextLong();
			
			if(number == -1) {
				state = false;
				System.out.println("Program terminated.");
			}
			else if(number < -1) {
				//finding absolute value of number
				long absoluteNumber = Math.abs(number);
				toString(absoluteNumber);
			}
			else {
				toString(number);
			}
			
		}//end loop
		
		//close the scanner
		input.close();
		
	}//end method

	public static String toString(long i) {
		
		//convert the long to a string
		String numberAsString = Long.toString(i);
		
		//output the result using the .length() method 
		System.out.println("The number of digits in " + i 
				+ " is " + numberAsString.length());
		
		return numberAsString;
		
	}//end toString method
	
}//end class
