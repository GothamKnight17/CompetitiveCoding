import java.util.Scanner;

public class Time_Penalty {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), y = s.nextInt();
        System.out.println(x + y*10);
        s.close();
    }
}