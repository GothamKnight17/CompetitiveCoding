import java.util.Scanner;

public class Too_Much_Homework {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt(), y = s.nextInt();
        System.out.println(x+y*10>=100?"Yes":"No");
        s.close();
    }
}