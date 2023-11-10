import java.util.Scanner;

public class AdditionOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();

int i =1,sum=0;

while(i<=num){
    sum= sum+i;
    i++;

}
        System.out.println(sum);
    }



}
