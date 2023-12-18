import java.util.Scanner;

/**
 * Playing_with_OR
 */
public class Playing_with_OR {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt(),count = 0, k = s.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = s.nextInt();
            }
            System.out.println(count);
        }
        s.close();
    }
}