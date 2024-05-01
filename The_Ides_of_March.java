import java.util.Scanner;

/**
 * The_Ides_of_March
 */
public class The_Ides_of_March {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==15)
        System.out.println("Yes");
        else
        System.out.println("No");
        s.close();
    }
}