import java.util.*;
public class International_Education_Day {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        if(a*c>b*c){ 
            System.out.println(a*c);
        }
        else{ 
            System.out.println(b*c);
        }
        s.close();
    }
}