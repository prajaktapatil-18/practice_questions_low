import java.util.Scanner;

public class Cube {
    public static void main(String [] args){


        Scanner scan = new Scanner(System.in);
        int i =1;

        int a = scan.nextInt();
        while (i<=a){
            System.out.println(i + " cube is " + i*i*i);

            i++;


        }



    }
}
