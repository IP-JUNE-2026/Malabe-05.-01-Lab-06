import java.util.Scanner;

public class IT26101213Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        int[] numbers = new int[11]; 
        int i = 1;
        int sum = 0;

        System.out.println("Please enter 10 numbers:");

        
        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
            i++; 
        }

        System.out.println("The numbers you entered are:");
        
        
        i = 1; 
        while (i <= 10) {
            System.out.print(numbers[i] + " ");
            i++;
        }
        System.out.println();

        double average = (double) sum / 10;

        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        
    }
}

