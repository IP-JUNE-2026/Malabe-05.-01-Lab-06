import java.util.Scanner;

public class IT26101810Lab6Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();
        
        double square = num * num;
        double sqrt = Math.sqrt(num);
        
        System.out.println("The square of " + num + " is : " + square);
        System.out.println("The square root of " + num + " is : " + sqrt);
        
        sc.close();
    }
}