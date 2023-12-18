import java.util.*;
public class Air_Quality_Index {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int t = s.nextInt();
       if(t>=100)
       System.out.println("NO");
       else
       System.out.println("YES");
       s.close();
    }
}