import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[]args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("enter a, b abd c values");
        int a= scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a>b && a>c){
            System.out.println("Maximum number " + a);
        }else if (b>a && b>c){
            System.out.println("maximun number " + b);
        } else if (c>a && c>b) {
            System.out.println("Maximum number " + c);

        }


    }}
