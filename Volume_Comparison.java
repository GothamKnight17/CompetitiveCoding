import java.util.Scanner;

/**
 * Volume_Comparison
 */
public class Volume_Comparison {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(), x = s.nextInt();
        if((a*b*c)>(x*x*x)){ 
            System.out.println("Cuboid");
        }else if((a*b*c)<(x*x*x)){ 
            System.out.println("Cube");
        }else{ 
            System.out.println("Equal");
        }
        s.close();
    }
}