import java.util.Scanner;

public class IT26101296Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        int number;

        // Loop 10 times to take inputs and accumulate the sum
        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = scanner.nextInt();
            sum += number;
            count++;
        }

        // Calculate average using double to avoid integer division loss
        double average = (double) sum / 10;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();
    }
}