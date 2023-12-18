import java.util.*;
public class Maximum_Deliciousness {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int l = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            int max = 0;
            Arrays.sort(arr);
            int size = n-1;
            for (int i = 0; n-- != 0; i++) {
                if (i==(l-1)) {
                    max += arr[size];
                }
                if(i==(k-1)) {
                    i = -1; 
                }
                size=size-1;
            }
            System.out.println(max);
        }
        s.close();
    }
}