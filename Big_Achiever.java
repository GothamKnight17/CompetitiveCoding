import java.util.Scanner;

public class Big_Achiever {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();    
        while (t-->0) {
            int n = s.nextInt();
            int[] a = new int[n];
            int iMax = Integer.MIN_VALUE;
            for(int i=0; i<a.length; i++) { 
                a[i] = s.nextInt();
                if(a[i]>iMax){ 
                    iMax = a[i];
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        s.close();
    }
}