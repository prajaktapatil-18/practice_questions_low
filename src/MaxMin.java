import java.util.Scanner;

public class MaxMin {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a>b && a>c){
            System.out.println("Maxinum" + a);

        } else if (b>a && b>c) {
            System.out.println("max " +b);

        }else {
            System.out.println("Maximum "+ c);
        }
        {
        }
    }
}