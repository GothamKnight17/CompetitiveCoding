import java.util.Scanner;

public class Anti_Triangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int n = s.nextInt(), l = s.nextInt();
            int[] arr = new int[n];
            arr[0]=1;
            for (int i = 1; i < n; i++) {
                arr[i]=arr[i-1]+l-1;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}