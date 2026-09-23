import java.util.Scanner;

public class IT26101686Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        double sum = 0;

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            double number = input.nextDouble();

            sum = sum + number;
            count++;
        }

        double average = sum / 10;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        input.close();
    }
}
