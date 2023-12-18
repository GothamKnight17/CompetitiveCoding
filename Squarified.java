import java.util.Scanner;
public class Squarified {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < A.length; i++) {
                A[i] = s.nextInt();
            }
            int count = 0;
            for (int i = 0; i < A.length; i++) {
                int temp = count, x = A[i];
                count = 0;
                for (int j = i + 1; j < A.length; j++) {
                    if (Math.sqrt(x * A[j]) - Math.floor(Math.sqrt(x * A[j])) == 0) {
                        x *= A[j];
                        count++;
                    }
                }
                if (count < temp) {
                    count = temp;
                }
            }
            if(A.length-count==1)
            System.out.println(0);
            else
            System.out.println(count+1);
        }
        s.close();
    }
}