import java.util.Scanner;

/**
 * Make_My_Array_Equal
 */
public class Make_My_Array_Equal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            int[] a = new int[n];
            int odd=0, eve=0;
            for (int i = 0; i < a.length; i++) {
                a[i]=s.nextInt();
                if(a[i]%2==0)
                   eve++;
                else 
                   odd++;
            }  
            if()
        }
        s.close();
    }
}