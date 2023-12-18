import java.util.Scanner;

/**
 * Chef_Fantasy_11
 */
public class Chef_Fantasy_11 {
    public static int fact(int i){ 
        if(i==0||i==1){ 
            return 1;
        }
        else
            return i*fact(i-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            System.out.println(fact(n)/fact(n-2));
        }
        s.close();
    }
}