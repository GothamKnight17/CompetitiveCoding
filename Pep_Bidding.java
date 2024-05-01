import java.util.Scanner;

/**
 * Pep_Bidding
 */
public class Pep_Bidding {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n=s.nextInt();
            int at[] = new int[n], suma = 0;
            for(int i=0; i<n; i++){ 
                at[i]=s.nextInt();
                suma+=at[i];
            }

            int defA[] = new int[n], defa=0;
            for(int i=0;i<n; i++){
                defA[i] = s.nextInt();
                defa+=defA[i];
            }

            int ab[] = new int[n], sumb = 0;
            for(int i=0; i<n; i++){ 
                ab[i]=s.nextInt();
                sumb+=ab[i];
            }

            int defb[] = new int[n], defB=0;
            for(int i=0;i<n; i++){
                defb[i] = s.nextInt();
                defB+=defb[i];
            }
            if(defa>defB && suma>sumb)
               System.out.println("A");
            else if(defa<defB && suma<sumb)
               System.out.println("P");
            else 
               System.out.println("DRAW");
        }
        s.close();
    }
}