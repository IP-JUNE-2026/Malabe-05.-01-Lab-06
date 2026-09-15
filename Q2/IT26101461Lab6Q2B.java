import java.util.Scanner;

public class IT26101461Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        String numbersEntered = "";

        System.out.println("Please enter 10 numbers:");

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int num = scanner.nextInt();
            numbersEntered += num + " ";
            count++;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbersEntered);

        scanner.close();
    }
}