import java.util.*;
public class GCD_Discount {
    public static long GCD(long i, long j) { 
        if(j == 0){
            return i;
        }
        else
        return GCD(j, i%j);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            long[] A = new long[n], B = new long[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = s.nextLong();
            }
            for (int i = 0; i < B.length; i++) {
                B[i] = s.nextLong();
            }
            long[] pre = new long[n];
            long[] post = new long[n];
            pre[0] = 0;
            post[n-1] = 0;
            for (int i = 1; i < n; i++) {
                pre[i] = GCD(pre[i-1], A[i-1]);
            }
            for (int i = n-2; i >= 0; i--) {
                post[i] = GCD(post[i+1], A[i+1]);
            }
            long max = A[0];
            for (int i = 0; i < n; i++) {
                max = GCD(max, A[i]);
            }
            for (int i = 0; i < n; i++) {
                if(max<GCD(GCD(post[i],pre[i]),B[i]))
                    max = GCD(GCD(post[i],pre[i]),B[i]);
            }
            System.out.println(max); 
        }
    }
}
