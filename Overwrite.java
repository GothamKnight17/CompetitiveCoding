import java.util.Scanner;

public class Overwrite {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt(), m = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }

            int ib = 0;
            for (int i = 0; i < m; i++) {
                b[i] = s.nextInt();
                if (b[i] < b[ib]) {
                    ib = i;
                }
            }
            int[] bMin = new int[m];
            int idx = 0;
            for (int i = ib; i < m; i++) {
                bMin[idx++] = b[i];
            }
            for (int i = 0; i < ib; i++) {
                bMin[idx++] = b[i];
            }

            for (int i = 0; i <= n - m; ) {
                boolean replace = false;
                int k;
                for (k = 0; k < m; k++) {
                    if (bMin[k] < a[i + k]) {
                        replace = true;
                        break;
                    } else if (bMin[k] > a[i + k]) {
                        break;
                    }
                }
                if (k < m && replace) {
                    System.arraycopy(bMin, 0, a, i, m);
                    i += m;
                } else {
                    i++;
                }
            }
            
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        s.close();
    }
}