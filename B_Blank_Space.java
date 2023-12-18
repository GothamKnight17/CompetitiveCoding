/**
 * B_Blank_Space
 */
import java.util.Scanner;
public class B_Blank_Space {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int temp = 0;
            int bSpace=0;
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i]=s.nextInt();
            }
            for (int i = 0; i < a.length; ) {
                if (a[i]==0 && i<n-1) {
                    while (a[i]==0) {
                        temp++;
                        i++;
                    }
                    if(temp>bSpace) { 
                        bSpace = temp;
                        temp = 0;
                    }
                }
                else if(a[i]==0 && i==(n-1)) { 
                    temp++;
                    if(temp>bSpace) { 
                        bSpace = temp;
                        temp = 0;
                    }
                    break;
                }
                else 
                i++;
            }
            System.out.println(bSpace);
        }
        s.close(); 
    }
}