import java.util.*;
public class A_Wallet_Exchange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int a = s.nextInt(), b =s.nextInt();
            if((a+b)%2==0)
            System.out.println("Bob");
            else
            System.out.println("Alice");
        }
        s.close();
    }
}