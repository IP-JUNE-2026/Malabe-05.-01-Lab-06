import java.util.Scanner;

	public class IT26101343Lab6Q2C {
		
		public static void main(String [] args) {
			
			int num1 , num2 , num3 , num4 , num5 , num6 , num7 , num8 , num9 , num10 ;
			int sum = 0;
			double average;
			
			Scanner numbers = new Scanner(System.in);
			
			
			
			System.out.println("Please enter 10 numbers: ");
			
			System.out.print("Enter number 1 : ");
			num1 = numbers.nextInt();
			sum += num1;
			
			System.out.print("Enter number 2 : ");
			num2 = numbers.nextInt();
			sum += num2;
			
			System.out.print("Enter number 3 : ");
			num3 = numbers.nextInt();
			sum += num3;
			
			System.out.print("Enter number 4 : ");
			num4 = numbers.nextInt();
			sum += num4;
			
			System.out.print("Enter number 5 : ");
			num5 = numbers.nextInt();
			sum += num5;
			
			System.out.print("Enter number 6 : ");
			num6 = numbers.nextInt();
			sum += num6;
			
			System.out.print("Enter number 7 : ");
			num7 = numbers.nextInt();
			sum += num7;
			
			System.out.print("Enter number 8 : ");
			num8 = numbers.nextInt();
			sum += num8;
			
			System.out.print("Enter number 9 : ");
			num9 = numbers.nextInt();
			sum += num9;
			
			System.out.print("Enter number 10 : ");
			num10 = numbers.nextInt();
			sum += num10;
			
			average = sum / 10 ;
			
			System.out.println();
			System.out.println("The numbers you entered are: " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " " + num7 + " " + num8 + " " + num9 + " " + num10 );
			System.out.println();
			System.out.println("Sum: " + sum );
			System.out.println();
			System.out.println("Average: " + average );
			
			
			
			
			
				
			//Print a newline character to move to the next line after printing all the numbers
			System.out.println();
				
		}
	}
		