import java.util.Scanner;

public class Run_for_Fun {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), y = s.nextInt();
        System.out.println(y%x==0?((int)(y/x) - 1):(int)y/x);
        s.close();
    }
}