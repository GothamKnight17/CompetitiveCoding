/**
 * A_I_love_username
 */
import java.util.Scanner;
public class A_I_love_username {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int ama_low=Integer.MAX_VALUE, count_l =-1, ama_high=Integer.MIN_VALUE, count_h=-1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            if(ama_low>arr[i]){ 
               count_l++;
               ama_low=arr[i];
            }
            if(ama_high<arr[i]){ 
                count_h++;
                ama_high=arr[i];
            }
        }
        System.out.println(count_h+count_l);
        s.close();
    }
}