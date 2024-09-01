/**
 * C_Longest_Good_Array
 */
import java.util.Scanner;
public class C_Longest_Good_Array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int l =s.nextInt(), r= s.nextInt();
            int T =  2*(r - l);
            int n = 1;
            while(n*(n+1)<=T){ 
                n++;
            }
            System.out.println(n);
        }
        s.close();
    }
}