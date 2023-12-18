import java.util.Scanner;

/**
 * Lockpicking_Chef
 */
public class Lockpicking_Chef {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t--!=0){ 
            int n = s.nextInt(), m = s.nextInt();
            String S = s.next(), N = s.next();
            for (int i = 0; i < S.length(); i++) {
                String temp = "";
                if(i+m<S.length())
                temp = S.substring(i, i+m);
                else
                temp = S.substring(i, S.length());
                if(temp.equals(N)) { 
                    System.out.println(0);
                }
                else { 
                    
                }
            }
        }
        s.close();
    }
}