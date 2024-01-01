import java.util.*;
public class A_Odd_One_Out {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int[] a = new int[3];
            for (int i = 0; i < a.length; i++) {
                a[i] =s.nextInt();
            }
            if(a[0]==a[1]){ 
                System.out.println(a[2]);
            }else if(a[1]==a[2]){ 
                System.out.println(a[0]);
            }else{ 
                System.out.println(a[1]);
            }
        }
        s.close();
    }
}