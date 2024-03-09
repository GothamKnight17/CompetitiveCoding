import java.util.*;
public class Cricket_Tournament {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt(), m = s.nextInt();
            if(n-1>=m){ 
                System.out.println("YES");
            }else{ 
                System.out.println("NO");
            }
        }
        s.close();
    }
}