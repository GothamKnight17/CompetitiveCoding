import java.util.Scanner;

/**
 * Problem_Category
 */
public class Problem_Category {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t= s.nextInt();
        while (t--!=0) {
            int x=s.nextInt();
            if(0<=x && x<100){ 
                System.out.println("Easy");
            }
            else if(100<=x && x<200){ 
                System.out.println("Medium");
            }
            else{ 
                System.out.println("Hard");
            }
        }
        s.close();
    }
}