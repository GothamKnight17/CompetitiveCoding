import java.util.Scanner;

/**
 * Gun_Master
 */
public class Gun_Master {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n =s.nextInt(), d =s.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i]=s.nextInt();
            }
            int checkGun = 0;
            int count = 0;
            for(int i=0; i<n; i++){ 
                if(a[i]>d){ 
                    if(checkGun==0){ 
                        checkGun = 1;
                        count++;
                    }
                }else{ 
                    if(checkGun == 1){ 
                        checkGun = 0;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        s.close();
    }
}