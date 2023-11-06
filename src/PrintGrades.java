import java.util.Scanner;

public class PrintGrades {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your marks to find your garde ");
        int choice = scan.nextInt();
        if (choice>=90){
            System.out.println("As per your marks your garde is A+");
        } else if (choice>=80) {
            System.out.println("As per your marks your garde is A");

        } else if (choice>=70) {
            System.out.println("As per your marks your garde is B+");

        } else if (choice>=60) {
            System.out.println("As per your marks your garde is B");

        } else if (choice>=50) {
            System.out.println("As per your marks your garde is c");

        } else if (choice>=35) {
            System.out.println("As per your marks your garde is D");

        }else {
            System.out.println("Invalid");
        }


    }
}
