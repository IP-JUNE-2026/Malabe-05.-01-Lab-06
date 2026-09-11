import java.util.Scanner;
public class IT26101724Lab6Q1{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		double number = input.nextInt();
		
		double result1= (number*number);
		
		double result2= Math.sqrt(number);
		System.out.println();
		System.out.println("The square of 25.0 is :" + result1);
		
		System.out.println("The square root of 25.0 is :" + result2);
	}
}