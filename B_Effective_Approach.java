/**
 * B_Effective_Approach
 */
import java.util.*;
public class B_Effective_Approach {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int[] index = new int[n+1];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            index[a[i]] = i+1;
        }
        int m = s.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < b.length; i++) {
            b[i] = s.nextInt();
        }
        long count1=0, count2=0;
        for (int i = 0; i < b.length; i++) {
            int temp = index[b[i]];
            count1+=temp;
        }
        for (int i = b.length-1; i > -1; i--) {
            int temp = n-index[b[i]]+1;
            count2+=temp;
        }
        System.out.println(count1+" "+count2);
        s.close();
    }
}