/**
 * A_Arrival_of_the_General
 */
import java.util.Scanner;
public class A_Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int min_idx = 0, max_idx = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            if(min>=arr[i]){ 
                min = arr[i];
                min_idx = i;
            }
            if(max<arr[i]){ 
                max = arr[i];
                max_idx = i;
            }
        }
        // System.out.println(min_idx+" "+max_idx);
        if(max_idx>min_idx){ 
            System.out.println(max_idx+n-1-min_idx-1);
        }else{ 
            System.out.println(max_idx+n-min_idx-1);
        }
        s.close();
    }
}