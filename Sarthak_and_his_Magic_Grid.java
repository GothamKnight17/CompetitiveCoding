import java.util.*;

public class Sarthak_and_his_Magic_Grid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(1+" ");
                }
                System.out.println();
            }
        }
        s.close();
    }
}