import java.util.*;

public class Prime_Permutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        outerloop:
        while (t-- != 0) {
            int n = s.nextInt();
            if(n<=3){ 
                System.out.println(-1);
                continue outerloop;
            }
            int[] arr = new int[n];
            int check = (n-(n/2))%2;
            if(checkPrime(check)) {
                int k=1;
                for (int i = n/2; i < n; i++) {
                    arr[i] = k++;
                }
                for (int i = 0; i<=((n/2)-1); i++) {
                    arr[i]=k++;
                }
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }else{ 
                System.out.println(-1);
            }
        }
        s.close();
    }
    public static boolean checkPrime(int n){ 
        boolean flag = true;
        int mid = (int)Math.sqrt(n)+1;
        for (int i = 2; i < mid; i++) {
            if(n%i==0){ 
                flag = false;
                break;
            }
        }
        return flag;
    } 
}