import java.util.Scanner;
import java.lang.Math;
/**
 * Endless_Appetizers
 */
public class Endless_Appetizers {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int  x = s.nextInt(), y = s.nextInt(), r = s.nextInt();
            int count = (r/30)+x;
            int j =0;
            while (j*y<count) {
                j++;
            }
            System.out.println(j);
        }
        s.close();
    }
}