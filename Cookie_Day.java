import java.util.*;
public class Cookie_Day {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt(), k =s.nextInt();
            int[] A = new int[n];
            boolean flag = false;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < A.length; i++) {
                A[i]=s.nextInt();
                if(A[i]>=k){ 
                    flag=true;
                    if(min>A[i]%k){ 
                        min = A[i]%k;
                    }
                }
            }
            if(flag==true){ 
                System.out.println(min);
            }else{ 
                System.out.println(-1);
            }
        }
        s.close();
    }
}