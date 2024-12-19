import java.util.Scanner;

public class Itz_Simple {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt(), k = s.nextInt(), p = s.nextInt();
            int total = 0, max = Integer.MIN_VALUE;
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
                if(a[i]>max)
                   max = a[i];

                total += a[i];
            }
            total -= max;
            int ved = max+k;
            int varun = total+p;
            System.out.println(ved>varun?"Ved":(ved==varun?"Equal":"Varun"));
        }
        s.close();
    }
}