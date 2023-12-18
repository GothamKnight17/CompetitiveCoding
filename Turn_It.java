import java.util.Scanner;

/**
 * Turn_It
 */
public class Turn_It {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            float u=s.nextFloat(), v=s.nextFloat(), a=s.nextFloat(), S=s.nextFloat();
            float final_v = (u*u - 2*a*S);
            if(u<=v)
            System.out.println("Yes");
            else if(v*v>=final_v)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
        s.close();
    }
}