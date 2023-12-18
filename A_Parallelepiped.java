import java.util.Scanner;

/**
 * A_Parallelepiped
 */
public class A_Parallelepiped {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), y = s.nextInt(), z = s.nextInt();
        int a = (int)Math.sqrt((x*z/y)), b = (int)Math.sqrt(x*y/z), c = (int)Math.sqrt(y*z/x);
        System.out.println(4*(a+b+c));
        s.close();
    }
}