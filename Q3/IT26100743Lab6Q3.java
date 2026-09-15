import java.util.Scanner;

public class IT26100743Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        double sumSquares = 0;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            int num = input.nextInt();

            if (num == -99) {
                break;
            } else if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumSquares += num * num;
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sumSquares / count);
			
			System.out.println();
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }
}
