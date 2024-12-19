import java.util.Scanner;

public class Stable_Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            
        }
        s.close();
    }
}