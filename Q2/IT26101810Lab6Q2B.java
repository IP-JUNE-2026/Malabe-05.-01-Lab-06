import java.util.Scanner;

public class IT26101810Lab6Q2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int n1=0,n2=0,n3=0,n4=0,n5=0,n6=0,n7=0,n8=0,n9=0,n10=0;

        System.out.println("Please enter 10 numbers:");
        
        while(i <= 10) {
            System.out.print("Enter number " + i + ": ");
            if(i==1) n1 = sc.nextInt();
            if(i==2) n2 = sc.nextInt();
            if(i==3) n3 = sc.nextInt();
            if(i==4) n4 = sc.nextInt();
            if(i==5) n5 = sc.nextInt();
            if(i==6) n6 = sc.nextInt();
            if(i==7) n7 = sc.nextInt();
            if(i==8) n8 = sc.nextInt();
            if(i==9) n9 = sc.nextInt();
            if(i==10) n10 = sc.nextInt();
            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.print(n1 + " + n2 + " + n3 + " " + n4 + " + n5 + " " + n6 + " " + n7 + " + n8 + " + n9 + " + n10);
        
        sc.close();
    }
}