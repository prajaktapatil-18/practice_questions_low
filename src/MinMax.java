import java.util.Scanner;

public class MinMax {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a<b && a<c){
            System.out.println("Min  " + a);
        } else if (b<a&& b<c) {
            System.out.println("min "+ b);

        }else {
            System.out.println("min "+ c);
        }
    }
}
