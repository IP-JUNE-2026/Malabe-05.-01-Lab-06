import java.util.Scanner;

public class IT26101603Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a positive number (-99 to stop): ");
            int num = input.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input. Enter a positive number.");
                continue;
            }

            sum = sum + (num * num);
            count++;
        }

        if (count > 0) {
            double rms = Math.sqrt(sum / count);
            System.out.println("Root Mean Square = " + rms);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}