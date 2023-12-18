import java.util.Scanner;

/**
 * Bells_of_Pilgrimage
 */
public class Bells_of_Pilgrimage {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t--!=0) { 
          int n = s.nextInt(), x = s.nextInt(), k = s.nextInt(), p =s.nextInt();
          if(x>=k) { 
            p += k*10;
          }
          else if(x<k){ 
            p+= x*10+(k-x)*5
            if(k==n)
            p+=20;
          }
          sou
        }
        s.close();
    }
}