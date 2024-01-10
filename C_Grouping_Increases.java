import java.util.*;
public class C_Grouping_Increases {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt(), idx = 0, max = Integer.MIN_VALUE;
            int[] a = new  int[n];
            for (int i = 0; i < a.length; i++) {
                a[i]=s.nextInt();
                if(a[i]>max){ 
                    max = a[i];
                    idx = i;
                }
            }
            int count = 0;
            if(idx == (n-1)) { 
                for (int i = 0; i < a.length-1; i+=2) {
                    count++;
                }
                for (int i = 1; i < a.length-1; i+=2) {
                    count++;
                }
            }
            else if(idx == 0) { 
                
            }
            else { 
                if(idx%2==0){ 
                    for (int i = 0; i <= idx; i+=2) {
                        count++;
                    }
                    for (int i = 1; i < a.length-1; i+=2) {
                        count++;
                    }
                }else{ 
                    for (int i = 1; i <= idx; i+=2) {
                        count++;
                    }
                    for (int i = 0; i < a.length-1; i+=2) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}