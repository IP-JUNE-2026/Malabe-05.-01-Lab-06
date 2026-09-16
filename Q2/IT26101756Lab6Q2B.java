import java.util.Scanner;
public class IT26101756Lab6Q2B
{
public static void main(String[]args)
{
int[]numbers= new int[10];
Scanner scanner=new Scanner(System.in);
System.out.println("please enter 10 numbers:");
for(int i=0;i<10;i++)
{
	System.out.print("enter number "+ (i+1) + ":");
	numbers[i]=scanner.nextInt();
}
scanner.close();
System.out.println("\n The numbers you entered are:");
for(int i=0;i<10;i++)
{
System.out.print(numbers[i]+"");
}
System.out.println();
}
}