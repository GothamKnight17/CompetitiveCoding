import java.util.Scanner;

public class Max_Triangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            if(n <= 3) {
                System.out.println(-1);
                continue;
            }
            System.out.println(n+n-1+n-2);
        }
        s.close();
    }
}