import java.util.Scanner;

public class IT26101686Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sumOfSquares = 0;
        int count = 0;
        int number;

        while (true) {
            System.out.print("Enter a positive number (-99 to stop): ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number < 0) {
                System.out.println("Invalid input! Please enter a positive number.");
                continue;
            }

            sumOfSquares = sumOfSquares + (number * number);
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);

            System.out.println("Number of values = " + count);
            System.out.println("Root Mean Square = " + rms);
        } else {
            System.out.println("No numbers were entered.");
        }

        input.close();
    }
}

