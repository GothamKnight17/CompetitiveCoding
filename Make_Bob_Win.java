import java.util.Scanner;

/**
 * Make_Bob_Win
 */
public class Make_Bob_Win {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            String bin = s.next();
            if(bin.indexOf('0')<0){ 
                System.out.println(0);
                continue;
            }
            
        }
        s.close();
    }
}