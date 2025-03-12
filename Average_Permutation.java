import java.util.Scanner;

public class Average_Permutation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt(), temp =n;
            int x[] = new int[n];
            for (int i = 0; i < n/2; i++) {
                x[i] = temp;
                temp--;
                x[n-i-1] = temp;
                temp--;
            }
            x[n/2]=1;
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
        }
        s.close();
    }
}