import java.util.Scanner;

/**
 * Weight_Balance
 */
public class Weight_Balance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int w1=s.nextInt(), w2=s.nextInt(), x1=s.nextInt(), x2=s.nextInt(), M=s.nextInt();
            int inc= w2-w1;
            if(inc<M*x1){ 
                System.out.println(0);
            }else if(inc>M*x2){ 
                System.out.println(0);
            }else
            System.out.println(1);
        }
        s.close();
    }
}