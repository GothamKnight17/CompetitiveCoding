import java.util.Scanner;

public class Halloween_Array {
    public static boolean isHalloweenArray(int[] A, long L, long R) {
        int N = A.length;
        long product = 1;
        long MOD = Long.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                product = (product * (A[i] ^ A[j])) % MOD;

                if (product > R) {
                    return false;
                }
            }
        }
        return product >= L && product <= R;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt(), l = s.nextInt(), r = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            System.out.println(isHalloweenArray(a, l, r) ? "YES" : "NO");
        }
        s.close();
    }
}