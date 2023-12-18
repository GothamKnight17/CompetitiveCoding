import java.util.*;

public class C_Non_coprime_Split {
    public static int GCD(int i, int j) { 
    if(j==0)
    return i;
    else
    return GCD(j, i%j);
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        boolean flag = false;
        while (t-- != 0) {
            
        s.close();
    }
}