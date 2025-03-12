import java.util.Scanner;

public class C_1_Skibidus_and_Fanum_Tax_easy_version {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t = s.nextInt();
        outerloop:
        while (t-->0) {
            int n = s.nextInt(), m = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for (int i = 0; i < a.length; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = s.nextInt();
            }
            int x = b[0];
            a[0] = Math.min(a[0], x-a[0]);
            for(int i=1; i<a.length; i++){
                if(!(a[i-1]<=a[i] || a[i-1]<=x-a[i] || x-a[i-1]<=a[i] || x-a[i-1]<=x-a[i])){
                    System.out.println("NO");
                    continue outerloop;
                }
            }

            System.out.println("YES");
        }
        s.close();
    }
}