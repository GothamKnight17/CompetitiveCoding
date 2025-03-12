import java.util.Scanner;

public class Christmas_Gifts {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int h = s.nextInt(), l = s.nextInt(), w = s.nextInt();
            System.out.println(1000/(2*(h*l+l*w+w*h)));
        }
        s.close();
    }
}