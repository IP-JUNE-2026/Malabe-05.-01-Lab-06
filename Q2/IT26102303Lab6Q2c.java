import java.util.Scanner;
     
public class IT26102303Lab6Q2c{
    
	public static void main(String args[]) {
	
	int number1, number2, number3, number4, number5, number6, number7, number8, number9, number10;
	double average, sum ;
	
     sum = 0;
	   
	   Scanner input = new Scanner(System.in);
	
	     System.out.print("Enter number 1:");
		 number1 = input.nextInt();
		          sum += number1;
		 
		 System.out.print("Enter number 2:");
		 number2 = input.nextInt();
		           sum += number2;
				   
		 System.out.print("Enter number 3:");
		 number3 = input.nextInt();
		           sum += number3;
		 
		 System.out.print("Enter number 4:");
		 number4 = input.nextInt();
		           sum += number4;
		 
		 System.out.print("Enter number 5:");
		 number5 = input.nextInt();
		           sum += number5;
		 
		 System.out.print("Enter number 6:");
		 number6 = input.nextInt();
		           sum += number6;
		 
		System.out.print("Enter number 7:");
		 number7 = input.nextInt();
                    sum += number7;		 
		 
		 System.out.print("Enter number 8:");
		 number8 = input.nextInt();
		            sum += number8;
		 
		 System.out.print("Enter number 9:");
		 number9 = input.nextInt();
		            sum += number9;
		 
		 System.out.print("Enter number 10:");
		 number10 = input.nextInt();
		           sum += number10;
				   
	     average = sum / 10.0;
		 
		 System.out.println();
		 System.out.println("The numbers you enterd are:" );
		 System.out.print(number1 + " ");
	     System.out.print(number2 + " ");
		 System.out.print(number3 + " ");
		 System.out.print(number4 + " ");
		 System.out.print(number5 + " ");
		 System.out.print(number6 + " ");
		 System.out.print(number7 + " ");
		 System.out.print(number8 + " ");
		 System.out.print(number9 + " ");
		 System.out.print(number10 + " ");
		 
		 
		 
		System.out.println();
		System.out.println();
		System.out.println("Sum of the numbers: " +  sum);
		System.out.println("Average of the numbers: " + average);
		
		}
		 
    }