import java.util.Scanner;

/**
 * Television_Channels
 */
public class Television_Channels {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n-n/2);
        s.close();
    }
}