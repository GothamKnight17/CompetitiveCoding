import java.util.Scanner;

/**
 * Advitiya
 */
public class Advitiya {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n==16||n==17||n==18){ 
            System.out.println("ADVITIYA");
        }else{
            System.out.println("WAITING FOR ADVITIYA");
        }
        s.close();
    }
}