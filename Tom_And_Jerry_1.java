import java.util.Scanner;

/**
 * Tom_And_Jerry_1
 */
public class Tom_And_Jerry_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int a =s.nextInt(), b=s.nextInt(), c=s.nextInt(), d=s.nextInt(), K =s.nextInt();
            int step = Math.abs(a-c)+Math.abs(b-d);
            if(step<=K){ 
                if((K-step)%2==0){ 
                    System.out.println("YES");
                }else{ 
                    System.out.println("NO");
                }
            }else{ 
                System.out.println("NO");
            }
        }
        s.close();
    }
}