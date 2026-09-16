import java.util.Scanner;

public class IT26101717Lab6Q3 {

    public static void main(String[]args) {

        
        int number;
        double meanOfSquares, rms;

        double sumOfSquares = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);

       System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {

            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number > 0) {
            sumOfSquares += Math.pow(number, 2);
                count++;
            } else {
                System.out.println("Please enter only positive integers or -99 to stop.");
            }
        }

           if (count > 0) {
            meanOfSquares = sumOfSquares / count;
            rms = Math.sqrt(meanOfSquares);

            System.out.println("Mean of squares = " + meanOfSquares);
            System.out.println("Root mean square (RMS) = " + rms);
        } else {
            System.out.println("No positive integers were entered.");
        }

        input.close();
    }
     }
