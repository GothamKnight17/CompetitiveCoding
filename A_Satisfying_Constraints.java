import java.util.*;

public class A_Satisfying_Constraints {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            long[] a = new long[n];
            long[] x = new long[n];
            long count = 0;
            HashSet<Long> set = new HashSet<>();
            Long maxA = Long.MIN_VALUE, minX = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = s.nextLong();
                x[i] = s.nextLong();
                if (a[i] == 1 && maxA < x[i]) {
                    maxA = x[i];
                }
                if (a[i] == 2 && minX > x[i]) {
                    minX = x[i];
                }
            }
            for (int i = 0; i < n; i++) {
                if (a[i] == 3) {
                    if (x[i] >= maxA && x[i] <= minX) {
                        if (set.contains(x[i]) == false) {
                            set.add(x[i]);
                            count++;
                        }
                    }
                }
            }
            if(maxA>minX){ 
                System.out.println(0);
            }else
            System.out.println(minX - maxA - count + 1);
        }
        s.close();
    }
}
