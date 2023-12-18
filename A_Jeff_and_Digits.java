import java.util.Scanner;
/**
 * A_Jeff_and_Digits
 */
public class A_Jeff_and_Digits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        int countOf5 = 0, countOf0 = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            if (a[i]==5) 
            countOf5++;
            else if (a[i]==0) 
            countOf0++;
        }
        if(countOf0==0)
        System.out.println(-1);
        else{ 
            int x = countOf5/9;
            if(x!=0){
            for (int i = 0; i < 9*x; i++) {
                System.out.print(5);
            }
            for (int i = 0; i < countOf0; i++) {
                System.out.print(0);
            }
        }
            else if(x==0){ 
                System.out.println(0);
            }
        }
        
        s.close();
    }
}