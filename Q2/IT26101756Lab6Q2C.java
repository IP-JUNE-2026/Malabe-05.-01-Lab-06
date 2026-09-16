import java.util.Scanner;
public class IT26101756Lab6Q2C
{
	public static void main(String[]args)
	{
		int[]numbers= new int[10];
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter 10 numbers:");
		int sum=0;
		for(int i=0;i<10;i++)
		{
			System.out.print("enter number"+(i+1) +":");
			numbers[i]=scanner.nextInt();
			sum+=numbers[i];
		}
		scanner.close();
		System.out.println("\nThe numbers you enterd are:");
		for(int i=0;i<10;i++)
		{
			System.out.print(numbers[i]+"");
		}
		System.out.println();
		double average=(double) sum/10;
		System.out.println("Sum of the numbers:"+sum);
		System.out.println("Average of the numbers:"+average);
	}
}
