import java.util.Scanner;
public class IT26101724Lab6Q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter positive integers(terminate input with -99):");
		double squaresum=0;
		int count=0;
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		while(num>0 || num != -99)
		{
			if(num<0)
			{
			    System.out.println("Invalid input.Please enter a positive integer or -99 to terminate");
			}
			
		    else
			{
			     int square=num*num;
			     squaresum=squaresum+square;
			     count++;
			}
			System.out.print("Enter a number:");
			num=sc.nextInt();
		}
		 double rms = Math.sqrt(squaresum/count);
		 System.out.println();
		 System.out.println("The Root Mean Square (RMS):" + rms);
	}
}	
		
			
	