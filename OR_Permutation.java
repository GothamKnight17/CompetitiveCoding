import java.util.*;
public class OR_Permutation {
    public static void print(int n){ 
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt();
            print(n);
        }
        s.close();
    }
}