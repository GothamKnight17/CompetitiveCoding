import java.util.Scanner;

public class Merry_Christmas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if(x>=7){
            System.out.println(3);
        }else if(x<7 && x>=3){
            System.out.println(2);
        }else{
            System.out.println(1);
        }
        s.close();
    }
}