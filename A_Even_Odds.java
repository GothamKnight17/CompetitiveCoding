import java.util.*;

public class A_Even_Odds {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong(), k = s.nextLong();
        int pos = 0;
        long i = 1, j = 2;
        long odd = -1, even = -1;
        if (n % 2 == 0) {
            odd = n / 2;
            even = n / 2;
        } else {
            odd = n / 2 + 1;
            even = n / 2;
        }
        if(k<=odd){ 
            System.out.println(i+2*(k-1));
        } 
        else{ 
            
            System.out.println(j+2*(k-odd-1));
        }
        s.close();
    }
}