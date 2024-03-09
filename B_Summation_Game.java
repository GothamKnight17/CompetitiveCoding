import java.util.*;
public class B_Summation_Game {
    public static void sol(){ 
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt(), x = s.nextInt();
        Integer[] a = new Integer[n];
        int tSum = 0;
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
            tSum+=a[i];
        }
        Arrays.sort(a, Collections.reverseOrder());
        Integer[] preSum = new Integer[n];
        preSum[0]=a[0];
        for (int i = 1; i < preSum.length; i++) {
            preSum[i]+=preSum[i-1]+a[i];
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <= k; i++) {
            
        }
        s.close();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            sol();
        }
        s.close();
    }
}