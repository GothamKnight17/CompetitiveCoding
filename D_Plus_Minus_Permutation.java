import java.util.*;

public class D_Plus_Minus_Permutation {
    public static long gcd(long i, long j) {
        if (j == 0)
            return i;
        else
            return gcd(i, i % j);
    }
    public static long lcm(long i, long j) {
        return (i / gcd(i, j) * j);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            long n = s.nextLong(), x = s.nextLong(), y = s.nextLong();

        }
        s.close();
    }
}