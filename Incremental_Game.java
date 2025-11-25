import java.util.Scanner;

public class Incremental_Game {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while (t-->0) {
            int x = s.nextInt();
            int y = s.nextInt();
            int k = s.nextInt();
            if(k>=x && k>=y){
                System.out.println("Alice");
                return;
            }
            if(k>=x || k>=y){

            }
            if(k<x && k<y){
                
            }
        }
        s.close();
    }
}