import java.util.Scanner;

public class Temperature_Balance {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0; i<a.length; i++) 
               a[i] = s.nextInt();
            int moveR = 0, moveL = 0;
            int remL = a[0], remR = a[n-1];
            int i = 1;
            while(i<n && remL!=a[i]){
                moveL+=(int)Math.abs(remL-a[i]);
                remL += a[i];
                i++;
            }
            int idx = i;
            while (i>=idx && remR!=a[i]) {
                moveR+=(int)Math.abs(remR-a[i]);
                remR += a[i];
                i--;
                
            }
            System.out.println(moveL+moveR+1);
        }
        s.close();
    }
}