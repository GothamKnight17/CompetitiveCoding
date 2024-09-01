/**
 * B_Square_or_Not
 */
import java.util.Scanner;
public class B_Square_or_Not {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int x = (int)Math.sqrt(n);
            String str = s.next();
            if(x*x!=n){ 
                System.out.println("No");
                continue;
            }
            n = x;
            int count0 = 0, count1 = 0;
            for(char c : str.toCharArray()){ 
                if(c=='0')
                   count0++;
                else
                   count1++;
            }
            if(count0!=(n-2)*(n-2)){
                System.out.println("No");
                continue;
            }
            for(int i=n+1; i<=n*(n-2)+1; i+=n){ 
                for (int j = i; j < i+n-2; j++) {
                    char c = str.charAt(j);
                    if(c!='0'){ 
                        System.out.println("No");
                    }
                }
            }
            System.out.println("Yes");
        }
        s.close();
    }
}