import java.util.Arrays;
import java.util.Scanner;

public class Larger_Smaller {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            Arrays.sort(a);
            int min = a[0], max = a[n - 1];
            if(max!=min)
                System.out.println(max-min-1);
            else
                System.out.println(0);
        }
        s.close();
    }
}