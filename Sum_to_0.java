import java.util.Scanner;

public class Sum_to_0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while (T-- > 0) {
            int N = s.nextInt();
            // Case 1: impossible
            if (N == 1) {
                System.out.println(-1);
                continue;
            }
            // If N is odd, output one zero‐sum triple 1,1,−2
            if ((N & 1) == 1) {
                System.out.print("1 1 -2 ");
                N -= 3;
            }
            // Now N is even; output N/2 of 1 and N/2 of -1
            for (int i = 0; i < N/2; i++) {
                System.out.print("1 ");
            }
            for (int i = 0; i < N/2; i++) {
                System.out.print("-1 ");
            }
            System.out.println();
        }
        s.close();
    }
}
