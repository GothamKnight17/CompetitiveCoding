import java.util.Scanner;

/**
 * Ballon_d_Or
 */
public class Ballon_d_Or {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt();
            int a[] = new int[n], count2=0, count1=0;
            for (int i = 0; i < a.length; i++) {
                a[i]=s.nextInt();
                if(a[i]==1){ 
                    count1++;
                }else{ 
                    count2++;
                }
            }
            if(count2==0){ 
                System.out.println("YES");
            }else{ 
                if(count2%8==0)
                   System.out.println("YES");
                else 
                   System.out.println("NO");
            }
        }
        s.close();
    }
}