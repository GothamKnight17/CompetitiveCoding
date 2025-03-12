import java.util.Scanner;

public class Technex_Tickets {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt(); 
            int time = 0;
            if(n==1 || n == 3){ 
                System.out.println(1);
                continue;
            }
            if(n%2 == 0){ 
                time += n/2 + 1;
            }else{ 
                time += ((n-3)/2) + 1;
            }
            System.out.println(time);
        }
        s.close();
    }
}