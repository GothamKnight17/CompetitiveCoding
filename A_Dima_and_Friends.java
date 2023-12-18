import java.util.Scanner;
public class A_Dima_and_Friends {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int count = 0;
        for (int i = 1; i < 6; i++) {
            if((sum+i)%(n+1)!=1)
            count++;
        }
        System.out.println(count);
        s.close();
    }
}