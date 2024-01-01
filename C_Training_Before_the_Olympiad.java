import java.util.*;

public class C_Training_Before_the_Olympiad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            int min1=a[0], min2=a[0];
            int max1=a[0], max2=a[0];
            for (int i = 0; i < a.length; i++) {
                if(min1>a[i]){
                    min2=min1; 
                    min1=a[i];
                }
                if(max1<a[i]){ 
                    max2=max1;
                    max1=a[i];
                }
                
            }
            System.out.println();
        }
        s.close();
    }
}