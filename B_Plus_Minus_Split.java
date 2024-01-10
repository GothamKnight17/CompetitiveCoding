import java.util.*;
public class B_Plus_Minus_Split {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t =s.nextInt();
        while(t--!=0) {
            int n = s.nextInt();
            String str = s.next();
            int countPlus = 0;
            for (int i = 0; i < str.length(); i++) {
                char temp = str.charAt(i);
                if(temp=='+')
                   countPlus++;
            }
            if(countPlus>(n-countPlus)){ 
                System.out.println(countPlus-(n-countPlus));
            }else{ 
                System.out.println((n-countPlus)-countPlus);
            }
        }
        s.close();
    }
}