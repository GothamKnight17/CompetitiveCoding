import java.util.*;

public class A_Dubstep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try
{
        StringBuilder str = new StringBuilder(s.next());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W' && str.charAt(i + 1) == 'U' && str.charAt(i + 2) == 'B') {
                    str.replace(i, i + 3, " ");
            }
        }
        System.out.println(str);

}
catch(Exception ignore){ 

}
        s.close();
    }
}