import java.util.Scanner;

public class IT26101394Lab6Q2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String numbersList = "";
        int i = 1;
        
        System.out.println("Please enter 10 numbers:");
        while (i <= 10) {
            System.out.println("Enter number " + i + ":");
            int num = scanner.nextInt();
            numbersList = numbersList + num + " ";
            i++;
        }
        
        System.out.println("The numbers you entered are:");
        System.out.println(numbersList);
        
      
    }
}