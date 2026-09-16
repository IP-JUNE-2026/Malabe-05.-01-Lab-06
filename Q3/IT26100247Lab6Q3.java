import java.util.Scanner;

public class IT26100247Lab6Q3 {
	public static void main(String[] args) {
		
		// Declare the variables
		        int number;
				double meanOfSquares , rms;
				
		// Declare the initialized variables to hold the sum of squares and the count of numbers
	            int count = 0;	
				double sumOfSquares = 0.0;
          		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter positive integers (terminate input with -99):");
		
		while (true){
			System.out.print("Enter a number: ");
			number = input.nextInt();
			
			if (number == -99){
				break;
			}
			
			if (number > 0){
				
				sumOfSquares += Math.pow(number , 2);
				
				count++;
			}else{
				
			System.out.println("Invalid input. Please enter a positive integer or -99 to terminate:");	
			}
		}
		
		if (count > 0){
			
			meanOfSquares = sumOfSquares / count;
			rms = Math.sqrt(meanOfSquares);
			
			
			System.out.println();
			System.out.println("TheRoot Mean Square(RMS) is : " + rms);
		}  else {
			
			System.out.println("No positive numbers were entered");
		}
		
		input.close();
    }
}
		