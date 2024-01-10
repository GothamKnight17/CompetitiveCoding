import java.util.*;
public class ORST {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt(), m =s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=s.nextInt();
            }
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i]=s.nextInt();
            }
            Arrays.sort(b);
            int bi = b[m-1];
            Arrays.sort(a,n-bi, n);
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}