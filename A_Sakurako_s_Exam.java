import java.util.Scanner;

/**
 * A_Sakurako_s_Exam
 */
public class A_Sakurako_s_Exam {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int a = s.nextInt(), b = s.nextInt();
            b = b - 2*(b/2);
            if(b!=0  && b<=(a/2)){ 
                b = 0;
                a = a - 2*(a/2);
            }
            if(a%2 == 0 && b%2 ==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        s.close();
    }
}