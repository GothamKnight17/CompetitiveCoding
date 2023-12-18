import java.util.Scanner;

/**
 * Two_Dishes
 */
public class Two_Dishes {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n=s.nextInt(), a=s.nextInt(), b=s.nextInt(), c=s.nextInt();
            int count = 0;
            if(a<=b){ 
                count+=a;
                b-=a;
            }
            else{ 
                count+=b;
                b=0;
            }
            if(c<=b){ 
                count+=c;
                b-=a;
            }
            else{ 
                count+=b;
                b=0;
            }
            if(count>=n)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        s.close();
    }
}