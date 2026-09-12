import java.util.Scanner;

public class IT26101232Lab6Q1{
   
   public static void main(String[] args){
   
   Scanner scanner = new Scanner(System.in);
   
   double number,square,squareRoot;
   
   System.out.print("Enter a number: ");
   number = scanner.nextDouble();
   System.out.println();
   
   if(number <= 0){
	   System.out.println("Error: The number must be greater than zero");
   }
   else{
   square = number * number;
   squareRoot = Math.sqrt(number);
   
   System.out.println("The square of " + number + " is : " + square);
   System.out.println("The square root of " + number + " is : " + squareRoot);
   }
   
   
   }





}