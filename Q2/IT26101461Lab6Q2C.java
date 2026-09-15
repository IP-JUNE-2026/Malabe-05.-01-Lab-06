import java.util.Scanner;

public class IT26101461Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        String numbersEntered = "";

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int num = scanner.nextInt();
            sum += num;
            numbersEntered += num + " ";
            count++;
        }

        double average = (double) sum / 10;

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbersEntered);
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}