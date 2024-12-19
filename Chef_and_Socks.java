import java.util.Scanner;

public class Chef_and_Socks {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), x = s.nextInt(), y = s.nextInt();
        System.out.println(a>x+y?"NO":"YES");
    }
}