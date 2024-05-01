import java.util.Scanner;

/**
 * Giant_Wheel
 */
public class Giant_Wheel {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if(x>=60)
        System.out.println("Yes");
        else
        System.out.println("No");
        s.close();
    }
}