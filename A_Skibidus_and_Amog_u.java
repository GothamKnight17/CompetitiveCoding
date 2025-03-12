import java.util.Scanner;

public class A_Skibidus_and_Amog_u {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){ 
            String str = s.next();
            String x = str.substring(0, str.length()-2);
            System.out.println(x+"i");
        }
        s.close();
    }
}