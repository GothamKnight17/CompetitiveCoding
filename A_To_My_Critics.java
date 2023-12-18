import java.util.Scanner;

/**
 * A_To_My_Critics
 */
public class A_To_My_Critics {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int a=s.nextInt(), b=s.nextInt(), c=s.nextInt();
            if(a+b>=10 || b+c>=10 || c+a>=10)
            System.out.println("YES");
            else 
            System.out.println("NO");
        }
        s.close();
    }
}