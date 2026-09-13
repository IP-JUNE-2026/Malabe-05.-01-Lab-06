import java.util.Scanner;

public class IT26101437Lab6Q2B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        int num6 = 0, num7 = 0, num8 = 0, num9 = 0, num10 = 0;

        int i = 1;

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {

            System.out.print("Enter number " + i + ": ");

            if (i == 1)
                num1 = input.nextInt();
            else if (i == 2)
                num2 = input.nextInt();
            else if (i == 3)
                num3 = input.nextInt();
            else if (i == 4)
                num4 = input.nextInt();
            else if (i == 5)
                num5 = input.nextInt();
            else if (i == 6)
                num6 = input.nextInt();
            else if (i == 7)
                num7 = input.nextInt();
            else if (i == 8)
                num8 = input.nextInt();
            else if (i == 9)
                num9 = input.nextInt();
            else
                num10 = input.nextInt();

            i++;
        }
 

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " "
                + num5 + " " + num6 + " " + num7 + " " + num8 + " "
                + num9 + " " + num10);

         
    }
}