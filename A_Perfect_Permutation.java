/**
 * A_Perfect_Permutation
 */
import java.util.Scanner;
public class A_Perfect_Permutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2==0){ 
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < arr.length-1; i+=2) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]+" ");
            }
        }
        else{ 
            System.out.println("-1");
        }
        s.close();
    }
}