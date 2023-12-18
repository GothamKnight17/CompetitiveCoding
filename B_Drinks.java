import java.util.Scanner;

/**
 * B_Drinks
 */
public class B_Drinks {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
            sum+=arr[i];
        }
        float fin = 100*(float)sum/(n*100);
        System.out.println(fin);
        s.close();
    }
}