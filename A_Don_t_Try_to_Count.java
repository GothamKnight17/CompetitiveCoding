import java.util.Scanner;

/**
 * A_Don_t_Try_to_Count
 */
public class A_Don_t_Try_to_Count {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--!=0) {
            int n=sc.nextInt(), m=sc.nextInt();
            String x = sc.next(), s = sc.next();
            int count = 0;
            for (int i = 0; ; i++) {
                boolean present = x.contains(s);
                if(present==true){ 
                    break;
                }else{ 
                    count++;
                    x+=x;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}