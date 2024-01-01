import java.util.*;

public class A_2023 {
    public static long prod(int[] arr){ 
        long ans = 1;
        for (int i = 0; i < arr.length; i++) {
            ans*=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < b.length; i++) {
                b[i]=s.nextInt();
            }
            long prodX = prod(b);
            long x =2023;
            if(x%prodX==0){ 
                System.out.println("YES");
                for (int i = 0; i < k; i++) {
                    if (i==0) {
                        System.out.print(x/prodX+" ");
                    }
                    else{ 
                        System.out.print(1+" ");
                    }
                }
                    System.out.println();
            }else{ 
                System.out.println("NO");
            }
        }
        s.close();
    }
}