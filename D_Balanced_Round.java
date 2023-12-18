import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * D_Balanced_Round
 */
public class D_Balanced_Round {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt(), k =s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            Arrays.sort(a);
            HashSet<Integer> set = new HashSet<>();
            int diff_l = 0, diff_r = 0;
            for (int i = 0; i < a.length-1; i++) {
                if(Math.abs(a[i]-a[i+1])<=k) { 
                    
                }
            }
            for (int i = a.length-1; i > 0; i--) {
                if(Math.abs(a[i]-a[i-1])<=k){
                    if(set.contains(a[i])==false)
                    set.add(a[i]);
                    if(set.contains(a[i-1])==false)
                    set.add(a[i-1]);
                }           
            }
            System.out.println(set.size());
            // if(diff_l<=diff_r)
            //     System.out.println(n-diff_l-1);
            // else
            //     System.out.println(n-diff_r-1);
        }
        s.close();
    }
}