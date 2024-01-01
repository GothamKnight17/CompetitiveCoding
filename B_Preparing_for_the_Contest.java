import java.util.*;

public class B_Preparing_for_the_Contest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- != 0) {
            int n = s.nextInt(), k = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i]=n-i;
            }
            if(k==n-1){
                for (int i = arr.length-1; i >=0 ; i--) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            else if(k==n-2){ 
                for (int i = 0, j=0; i < n-1-k; i++) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    j+=2;
                }
                for (int i = arr.length-1; i >= 0; i--) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
            else if(k<n-2){ 
                for (int i = 0, j=0; i < k; i++) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    j+=2;
                }
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
        s.close();
    }
}