/**
 * A_Football
 */
import java.util.*;
public class A_Football {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       String[] names = new String[n];
       for (int i = 0; i < names.length; i++) {
          names[i] = s.next();
       }
       String name1 = names[0], name2 = "";
       for (int i = 0; i < names.length; i++) {
        if(name1.equals(names[i])==false){ 
            name2+=names[i];
            break;
        }
       }
       int count1 = 0, count2 = 0;
       for (int i = 0; i < names.length; i++) {
        if(name1.equals(names[i]))
        count1++;
        else
        count2++;
       }
       if (count1>count2) {
        System.out.println(name1);
       }else
       System.out.println(name2);
       s.close();
    }
}