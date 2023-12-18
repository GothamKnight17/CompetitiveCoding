/**
 * Weeding
 */
import java.util.*;
public class Weeding {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt(), m = s.nextInt(), k = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            } 
            if(m>=(a[n-1]+k-1))
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        s.close();
    }
}