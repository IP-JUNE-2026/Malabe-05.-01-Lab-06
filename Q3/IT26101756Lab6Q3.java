import java.util.Scanner;
public class IT26101756Lab6Q3
{
	public static void main(String[]args)
	{
		Scanner scanne=new Scanner(System.in);
			int num;
			int sumofsquares=0;
			int count=0;
			System.out.println("enter positive integers(terminat input with-99):");
			while(true)
			{
				System.out.print("enter a number:");
				num=scanner.nextInt();
				if(num==-99)
				{
					break;
				}
				if(num<0)
				{
					System.out.println("invalid input!please enter a positive number");
					continue;
					sumofsquares += (num*num);
					count++;
				}
				scanner.close();
				if(count>0)
				{
					double rms=Math.sqrt((double) sumofsquares/count);
					System.out.println("\nthe root mean square (RMS)is: "+rms);
				}
				else
				{
					System.out.println("\nNo numbers were entered to calculates RMS");
				}
			}
	}
}
