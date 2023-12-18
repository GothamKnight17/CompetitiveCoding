import java.util.HashSet;
import java.util.Scanner;

/**
 * A_Is_your_horseshoe_on_the_other_hoof
 */
public class A_Is_your_horseshoe_on_the_other_hoof {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            if(set.contains(arr[i])==false) { 
                set.add(arr[i]);
            }else { 
                count++;
            }
        }
        System.out.println(count);
        s.close();
    }
}