import java.util.Scanner;

/**
 * Football_Training
 */
public class Football_Training {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), y =s.nextInt();
        if(x>y)
           System.out.println("FREEKICK");
        else 
            System.out.println("PENALTY");
        s.close();
    }
}