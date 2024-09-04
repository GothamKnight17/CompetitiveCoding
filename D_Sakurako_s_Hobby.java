import java.util.Scanner;
/**
 * D_Sakurako_s_Hobby
 */
public class D_Sakurako_s_Hobby {

    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < p.length; i++) {
                p[i]=s.nextInt();
            }
            String c = s.next();
            for (int i = 0; i < n; i++) {
                int idx = i;
                int count = 0;
                while (idx<p.length) {
                    idx = p[idx];
                    if(c.charAt(i)=='0')
                    count++;
                }
                System.out.print(count+" ");
            }
            System.out.println();
        }
        s.close();
    }
}