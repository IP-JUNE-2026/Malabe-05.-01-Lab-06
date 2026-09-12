import java.util.Scanner;
   public class IT26101213Lab6Q1 {
   public static void main(String[] args) {
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter the number: ");
   double number = input.nextDouble();
   
   
   double square = number*number;
   double squareroot= Math.sqrt(number);
   
   System.out.println("The square of" + number +" is: "+ square);
   System.out.println("The square of" + number +" is: "+ squareroot);
   
   }
   
 }
   
   
   