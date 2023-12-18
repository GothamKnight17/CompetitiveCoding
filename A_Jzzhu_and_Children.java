/**
 * A_Jzzhu_and_Children
 */
import java.lang.Math;
import java.util.Scanner;
public class A_Jzzhu_and_Children {

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < arr.length; i++) {
            float temp = s.nextFloat();
            arr[i] = (float)Math.ceil((temp/m));
        }
        float temp = Float.MIN_VALUE;
        int last = 0;
        for (int i = 0; i < arr.length; i++) {
            if(temp<=arr[i]){ 
                temp = arr[i];
                last = i;
            }
        }
        System.out.println(last+1);
        s.close();
    }
}