import java.util.Scanner;
public class Painting_Walls {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int x=s.nextInt(), y=s.nextInt(), z=s.nextInt();
            z/=2;
            System.out.println(z/(x*y));
        }
        s.close();
    }
}