import java.util.Scanner;

public class A_Minimize {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int a = s.nextInt(), b = s.nextInt();
            System.out.println(b-a);
        }
        s.close();
    }
}