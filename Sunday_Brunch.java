import java.util.Scanner;

/**
 * Sunday_Brunch
 */
public class Sunday_Brunch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int x = s.nextInt(), y = s.nextInt();
            if(x>=20*y){ 
                System.out.println(20);
            }else{ 
                System.out.println(x/y);
            }
        }
        s.close();
    }
}