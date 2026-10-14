import java.util.Scanner;

public class IT26101979Lab6Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double x= input.nextDouble();
		
		double x1= Math.sqrt(x);
		double x2= x*x;
		
		System.out.println("Square of "+x+" is: "+x2);
		
		System.out.println("SquareRoot of "+x+" is: "+x1);
		
		
	}
}