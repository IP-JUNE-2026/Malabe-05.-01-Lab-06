import java.util.Scanner;

public class IT26101394Lab6Q2C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String numbersList = "";
        int sum = 0;
        int i = 1;
        
        System.out.println("Please enter 10 numbers:");
        while (i <= 10) {
            System.out.println("Enter number " + i + ":");
            int num = scanner.nextInt();
            numbersList = numbersList + num + " ";
            sum += num;
            i++;
        }
        
        double average = (double) sum / 10;
        
        System.out.println("The numbers you entered are:");
        System.out.println(numbersList);
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
        
    
    }
}