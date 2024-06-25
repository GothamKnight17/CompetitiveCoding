import java.util.Scanner;

/**
 * Who_Makes_P_1
 */
public class Who_Makes_P_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        if(a>b){ 
            System.out.println("Dom");
        }else{ 
            System.out.println("Tyro");
        }
        s.close();
    }
}