import java.util.*;
public class Pending_Assignments {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int x=s.nextInt(), y=s.nextInt(), z=s.nextInt();
            z=z*24*60;
            if(x*y<=z)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        s.close();
    }
}