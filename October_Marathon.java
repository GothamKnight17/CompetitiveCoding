import java.util.Scanner;

/**
 * October_Marathon
 */
public class October_Marathon {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if(x<3)
        System.out.println("GOLD");
        else if(x>=3 && x<6)
        System.out.println("SILVER");
        else
        System.out.println("BRONZE");
        s.close();
    }
}