import java.util.Scanner;

/**
 * Superincreasing
 */
public class Superincreasing {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt(), k = s.nextInt(), x = s.nextInt();;
            int temp = (int)Math.pow(2, k-1);
            if(temp<=x)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}