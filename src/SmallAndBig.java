import java.util.Scanner;

public class SmallAndBig {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b = scan.nextInt();
        int c= scan.nextInt();
        int d= scan.nextInt();
        int e= scan.nextInt();

        if (a>b && a>c && a>d && a>e){
            System.out.println("maximum = "+ a);

        }else {
            System.out.println("mimimun ="+ a);
        }



    }
}
