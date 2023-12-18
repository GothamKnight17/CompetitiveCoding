import java.util.*;

public class A_Little_Elephant_and_Function {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n+" ");
        for (int i = 1; i < n; i++) {
            System.out.print(i+" ");
        }
        s.close();
    }
}