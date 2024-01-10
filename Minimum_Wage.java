import java.util.Scanner;
public class Minimum_Wage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if(x>11)
        System.out.println("YES");
        else
        System.out.println("NO");
        s.close();
    }
}