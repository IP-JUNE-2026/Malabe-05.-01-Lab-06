import java.util.Scanner;

public class IT26101979Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		for(int x=1; x<=10; x++ ){
			System.out.print("Enter number "+x+ ": ");
			int arr[x-1]= input.nextInt();
			
		}
		System.out.println(arr);
	}
}