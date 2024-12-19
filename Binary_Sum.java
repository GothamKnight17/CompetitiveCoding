import java.util.Scanner;

public class Binary_Sum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt(), k = s.nextInt();
            if(n%2==0 && n/2 == k){
                System.out.println("YES");
                continue;
            }else if(n%2!=0 && (n/2==k || n/2+1==k)){
                System.out.println("YES");
                continue;
            }else{
                System.out.println("NO");
            }
        }
        s.close();
    }
}