import java.util.Scanner;

public class Averageofall {
    public static void main(String []args){

        int nums [] = {3,4,7,8};
         int i=0;
         float sum = 0;
        while(i < nums.length) {
            sum += nums[i];
            i++;
        }
        System.out.println(sum/ nums.length);
    }
}