import java.util.*;
public class A_PLUS_B_Remastered {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        tag:
        while(t--!=0) {
            int n = s.nextInt();
            int sum = 0;
            Integer[] a = new Integer[n];
            for (int i = 0; i < a.length; i++) {
                a[i]=s.nextInt();
                sum+=a[i];
            }
            Integer[] b = new Integer[n];
            for (int i = 0; i < b.length; i++) {
                b[i]=s.nextInt();
                sum+=b[i];
            }
            sum/=n;
            Arrays.sort(a);
            Arrays.sort(b, Collections.reverseOrder());
            for (int i = 0; i < b.length; i++) {
                if(a[i]+b[i]!=sum){ 
                    System.out.println(-1);
                    continue tag;
                }
            }
            for (int i = 0; i < b.length; i++) {
                System.out.print(a[i]+ " " );
            }
            System.out.println();
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}