import java.util.Scanner;
  
   public class IT26101437Lab6Q1 {
    public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
    int number;	
     
	System.out.print("Enter a number:");
	number = input.nextInt();
	
	int sqr = number*number;
	double  sqr1 = Math.sqrt(number);
	
	System.out.println("The square of number is:"+ sqr);
	System.out.println("The square root of number is:"+ sqr1);
	
	 	
	
   }
}   
        	