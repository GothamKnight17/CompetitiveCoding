import java.util.Scanner;

public class Hotel_Bytelandia {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- >0) {
            int n = s.nextInt();
            int[] arr = new int[n], dep = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < dep.length; i++) {
                dep[i] = s.nextInt();
            }
        }
        s.close();
    }
}