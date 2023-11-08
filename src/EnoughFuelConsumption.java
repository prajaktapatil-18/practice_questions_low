import java.util.Scanner;

public class EnoughFuelConsumption {

    public static void main(String[] args) {

        System.out.println("for 1km enter fuel quantity");
        Scanner scan = new Scanner(System.in);

        int fuel = scan.nextInt();
        if(fuel>=50){
            System.out.println("enogh");
        }else {
            System.out.println("Go On");
        }
    }
}
