import java.util.Scanner;

public class New_Pro_Coder {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float n = s.nextFloat(), m = s.nextFloat();
        System.out.println(m>=n/2?"NEWBIE":"PRO");
        s.close();
    }
}