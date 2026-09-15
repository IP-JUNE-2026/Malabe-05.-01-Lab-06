import java.util.Scanner;

public class IT26101213Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        int[] numbers = new int[11];

        System.out.println("Please enter 10 numbers:");

        
        int i = 1;
        while (i <= 10) {
            System.out.print("Enter number " + (i) + ": ");
            numbers[i] = input.nextInt();
            i++;
        }

        System.out.println("The numbers you entered are:");

        
        i = 1;
        while (i <= 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        
        
    }
}