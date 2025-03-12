import java.util.Scanner;

public class A_MEX_Table {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n=s.nextInt(), m = s.nextInt();
            System.out.println(n>m?n+1:m+1);
        }
        s.close();
    }
}