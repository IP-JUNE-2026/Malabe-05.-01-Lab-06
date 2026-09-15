import java.util.Scanner;

public class IT26101565Lab6Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        
        double square = num * num;
        double sqrt = Math.sqrt(num);
        
        System.out.println("The square of " + num + " is : " + square);
        System.out.println("The square root of " + num + " is : " + sqrt);
        
        scanner.close();
    }
}