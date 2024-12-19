import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minimum_Types {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            List<Integer> totalVal = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                totalVal.add(i);
            }
            totalVal.sort((i1, i2) -> Integer.compare(b[i2] * a[i2], b[i1] * a[i1])); 
            int sm = 0;
            boolean done = false;
            for (int i = 0; i < n; i++) {
                sm += a[totalVal.get(i)] * b[totalVal.get(i)];
                if (sm >= x) {
                    System.out.println(i + 1); 
                    done = true;
                    break;
                }
            }
            if (!done) {
                System.out.println(-1);
            }
        }
        scanner.close();
    }
}