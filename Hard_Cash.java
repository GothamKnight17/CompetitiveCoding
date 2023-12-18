import java.util.Scanner;
public class Hard_Cash {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n=s.nextInt(), k=s.nextInt();
            long[] A = new long[n]; long sum = 0;
            for (int i = 0; i < A.length; i++) {
                A[i]=s.nextLong();
                sum+=A[i]%k;
            }
            System.out.println(sum%k);
        }
        s.close();
    }
}