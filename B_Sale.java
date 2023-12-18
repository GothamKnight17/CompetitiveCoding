import java.util.*;
import java.lang.Math;
public class B_Sale {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        int sum = 0;
        for (int i = 0; i < m; i++) {
           if(a[i]>=0)
           break;
           else 
           sum+=a[i];
        }
        System.out.println(Math.abs(sum));
        s.close();
    }
}