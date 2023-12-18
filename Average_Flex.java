import java.util.Scanner;

public class Average_Flex {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            int[] A = new int[n], freq = new int[101];
            for (int i = 0; i < A.length; i++) {
                A[i] = s.nextInt();
                freq[A[i]]++;
            }
            int count = 0, sum =0;
            for (int i = 0; i <=100; i++) {
                if (freq[i] != 0) {
                    sum+=freq[i];
                    if(sum>n-sum)
                        count+=freq[i];
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}