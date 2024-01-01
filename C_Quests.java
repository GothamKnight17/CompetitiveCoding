import java.util.*;

public class C_Quests {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt(), k = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();   
            }
            int[] b = new int[n];
            for (int i = 0; i < b.length; i++) {
                b[i] = s.nextInt();
            }
            int max = a[0];
            if(k>=n){ 
                for (int i = 1; i < n; i++) {
                    if(b[i-1]<a[i]){ 
                        max+=a[i];
                    }else{ 
                        max+=b[i-1];
                    }
                }
            }else { 
                for (int i = 0; i < b.length; i++) {
                    
                }
            }
        }
        s.close();
    }
}