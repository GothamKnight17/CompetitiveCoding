import java.util.Scanner;

/**
 * A_Tram
 */
public class A_Tram {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = s.nextInt();
            }
        }
        int temp = a[0][1]-a[0][0];
        int capacity =  a[0][1]-a[0][0];
        for (int i = 1; i < n; i++) {
                if (capacity<(temp-a[i][0]+a[i][1])) {
                    capacity = temp-a[i][0]+a[i][1];
                }
                temp = temp-a[i][0]+a[i][1];
        }
        System.out.println(capacity);
        s.close();
    }
}