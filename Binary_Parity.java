import java.util.*;

public class Binary_Parity {
    public static boolean binParity(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 2;
            n = n/2;
        }
        if (sum % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            if(binParity(n)==true)
            System.out.println("EVEN");
            else
            System.out.println("ODD");
        }
        s.close();
    }
}