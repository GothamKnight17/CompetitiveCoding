import java.util.*;

public class Mixing_Extraordinaire {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            long[] A = new long[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = s.nextLong();
            }
            long ans = 0;
            if(n>1)
            for (int i = 0; i < A.length-1; i++) {
                for (int j = i+1; j < A.length; j++) {
                    ans+=(long)(A[i]*A[j]);
                }
            }
            else{
                ans = A[0];
            }
            System.out.println(ans);
        }
        s.close();
    }
}