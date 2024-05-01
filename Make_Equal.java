import java.util.Scanner;

/**
 * Make_Equal
 */
public class Make_Equal {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            boolean flag  = true;
            for(int i=1; i<n-1; i++){ 
                if(arr[i-1]>=arr[i] && arr[i]<=arr[i+1]){ 
                    flag = false;
                    break;
                }    
            }
            if(flag == false)
               System.out.println("NO");
            else  
               System.out.println("YES");
        }
        s.close();
    }
}