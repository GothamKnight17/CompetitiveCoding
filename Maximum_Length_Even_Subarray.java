import java.util.Scanner;

/**
 * Maximum_Length_Even_Subarray
 */
public class Maximum_Length_Even_Subarray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            int sum = n*(n+1)/2;
            if(sum%2==0){ 
                System.out.println(n);
            }else{ 
                System.out.println(n-1);
            }
        }
        s.close();
    }
}