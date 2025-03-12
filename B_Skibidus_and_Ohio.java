import java.util.Scanner;


public class B_Skibidus_and_Ohio {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        outerloop:
        while (t--!=0) {
            String str = s.next();
            for(int i=0; i<str.length()-1; i++){
                if(str.charAt(i)==str.charAt(i+1)){
                    System.out.println(1);
                    continue outerloop;
                }
            }
            System.out.println(str.length());
        }
        s.close();
    }
}