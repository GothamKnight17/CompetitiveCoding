import java.util.Scanner;

public class Subset_GCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt(), k = s.nextInt();
            if(2*k<=n){ 
                for (int i = k; i <= n; i+=k) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }else{ 
                for (int i = n; i > n-k ; i--) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        s.close();
    }
}
