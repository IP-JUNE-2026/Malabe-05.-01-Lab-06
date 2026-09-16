import java.util.Scanner;

public class IT26102029Lab6Q2B {
public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    int number = 1;

    while (number <= 10) {
        System.out.print("Enter number " + number + ": ");
        int value = input.nextInt();

        System.out.println("You entered: " + value);

        number++;
    }
}


}
