import java.util.Scanner;

public class Squid_Game_Piggy_Bank {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt();
        System.out.println((n-k)*10000);
        s.close();
    }
}