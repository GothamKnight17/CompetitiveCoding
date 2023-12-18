import java.util.*;
public class All_New_CodeChef {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int x = s.nextInt(), y = s.nextInt();
       if(x<y)
       System.out.println("Old");
       else if(x>y)
       System.out.println("New");
       else
       System.out.println("Same");
       s.close();
    }
}