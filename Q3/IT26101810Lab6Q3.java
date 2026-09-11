import java.util.Scanner;

public class IT26101810Lab6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int count = 0;
        double sumSquares = 0;
        double rms = 0;

        System.out.println("Enter positive integers (terminate input with -99):");
        
        while(true) {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            
            if(num == -99) {
                break;
            }
            
            if(num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
            } else {
                sumSquares = sumSquares + (num * num);
                count = count + 1;
            }
        }
        
        if(count > 0) {
            rms = Math.sqrt(sumSquares / count);
            System.out.println();
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        }
        
        sc.close();
    }
}