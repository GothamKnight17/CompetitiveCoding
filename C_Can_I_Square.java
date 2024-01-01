import java.util.*;

public class C_Can_I_Square {
    public static boolean checkSqaure(long sum) {
        if (sum == 0)
            return false;
        long x = (long) Math.sqrt(sum);
        return (x * x == sum);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            long[] a = new long[n];
            long sum = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextLong();
                sum += a[i];
            }
            boolean flag = checkSqaure(sum);
            if (flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        s.close();
    }
}