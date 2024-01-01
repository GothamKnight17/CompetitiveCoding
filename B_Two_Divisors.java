
import java.util.Scanner;

public class B_Two_Divisors {
    public static long GCD(long x, long y) {
        if (y == 0)
            return x;
        return GCD(y, x % y);
    }

    public static long lcm(long x, long y) {
        return ((x * y) / GCD(x, y));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            long a = s.nextLong(), b = s.nextLong();
            if(b%a==0){ 
                System.out.println(b*(b/a));
            }
            else{ 
                System.out.println(lcm(b, a));
            }
        }
        s.close();
    }
}