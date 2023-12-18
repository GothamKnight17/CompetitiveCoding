import java.util.Scanner;
import java.util.Arrays;

/**
 * Dice_Number
 */
public class Dice_Number {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int[] A = new int[3], B = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = s.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            B[i] = s.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int a=0, b=0;
        for (int i = 0; i < 3; i++) {
            a+=Math.pow(10, i)*A[i];
            b+=Math.pow(10, i)*B[i];
        }
        if(a==b)
        System.out.println("Tie");
        else if(a>b)
        System.out.println("Alice");
        else 
        System.out.println("Bob");
        }
        s.close();
    }
}