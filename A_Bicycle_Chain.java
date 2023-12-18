import java.util.*;

public class A_Bicycle_Chain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int m = s.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < b.length; i++) {
           b[i] = s.nextInt();
        }
        int[] div = new int[n*m];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(b[j]%a[i]==0){ 
                    div[idx]=b[j]/a[i];
                    idx++;
                }
            }
        }
        Arrays.sort(div);
        int max = div[n*m - 1], max_count = 0;
        for (int i = div.length-1; i > -1 ; i--) {
            if(max!=div[i])
               break;
            max_count++;
        }
        System.out.println(max_count);
        s.close();
    }
}