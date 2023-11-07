import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any two numbers");

        int a = scan.nextInt();

        int b = scan.nextInt();
        System.out.println("Enter your chocie\n" +
                "1. +\n" +
                "2. -\n" +
                "3. *\n" +
                "4. /\n" +
                "5.%");
        int choice = scan.nextInt();
        if (choice==1){
            System.out.println( "Addition = " + a+b);
        } else if (choice==2) {
            System.out.println( a-b);

        } else if (choice==3) {
            System.out.println(a*b);

        } else if (choice==4) {
            System.out.println(a/b);

        } else if (choice==5) {
            System.out.println(a%b);

        }else {
            System.out.println("try again");
        }

    }
}
