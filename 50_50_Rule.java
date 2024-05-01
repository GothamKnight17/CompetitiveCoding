import java.util.*;
public class 50_50_Rule {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0){ 
            int x = s.nextInt();
            int y = s.nextInt();
            if(x<50){ 
                System.out.println("Z");
            }else if(y<50 && x>=50){ 
                System.out.println("F");
            }else{ 
                System.out.println("A");
            }
        }
        s.close();
    }
}