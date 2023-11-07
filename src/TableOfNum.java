import com.sun.source.util.DocTreeScanner;

import java.util.Scanner;

public class TableOfNum {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enbter a number");

        int n = scan.nextInt();


        for (int i = 1;i<=10;i++){
            System.out.println(i*n);


        }

    }
}
