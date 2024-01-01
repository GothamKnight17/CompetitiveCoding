import java.util.Scanner;

public class Christmas_Greetings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        if(t==25)
        System.out.println("CHRISTMAS");
        else
        System.out.println("ORDINARY");
        s.close();
    }
}