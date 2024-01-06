import java.util.*;

public class Chocolate_Distribution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            System.out.println(((n/2)+n%2)+" "+n);
        }
        s.close();
    }
}