import java.util.Scanner;

/**
 * A_Petr_and_Book
 */
public class A_Petr_and_Book {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] day = new int[7];
        for (int i = 0; i < day.length; i++) {
            day[i] =  s.nextInt();
        }
        
        int sum = 0; 
        int idx = 0;
        while (sum<n) {
            if(idx>6){ 
                idx = 0;
            }
            sum+=day[idx];
            if(sum>=n)
            break;
            idx++;
        }
        System.out.println(idx+1);
        s.close();
    }
}