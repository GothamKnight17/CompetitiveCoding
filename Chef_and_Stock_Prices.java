/**
 * Chef_and_Stock_Prices
 */
import java.util.Scanner;
public class Chef_and_Stock_Prices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
           float S=s.nextFloat(), a=s.nextFloat(), b=s.nextFloat(), c=s.nextFloat();
           S=S+S*c/100;
           if(S<a || S>b)
           System.out.println("No");
           else
           System.out.println("Yes");    
        }
        s.close();
    }
}