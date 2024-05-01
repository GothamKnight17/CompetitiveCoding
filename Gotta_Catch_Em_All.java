import java.util.Scanner;

/**
 * Gotta_Catch_Em_All
 */
public class Gotta_Catch_Em_All {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++){ 
                a[i]=s.nextInt();
                if (a[i] * x > y)
                    sum += y;
                else
                    sum += (a[i] * x);
            }
            System.out.println(sum);
        }
        s.close();
    }
}