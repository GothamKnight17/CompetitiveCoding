import java.util.*;

public class A_green_gold_dog_array_and_permutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n=s.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int x =1;
            b[0]=x;
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            System.out.println();
        }
        s.close();
    }
}