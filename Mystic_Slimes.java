import java.util.Scanner;

public class Mystic_Slimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = s.nextInt();
            }
            int ans = 0;
            for(int i=0; i<n; i++){ 
                int left = 0, right = 0;
                if(i==1){ 
                    left = a[0];
                }else{ 
                    left = 0; 
                }
                if(i==n-2){ 
                    right = a[n-1];
                }else{ 
                    right = 0; 
                }
                ans = (int)Math.max(ans, a[i] - (left+ right));
            }
            System.out.println(ans);
        }
        s.close();
    }
}