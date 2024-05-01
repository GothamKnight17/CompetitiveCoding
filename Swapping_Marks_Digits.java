import java.util.Scanner;

/**
 * Swapping_Marks_Digits
 */
public class Swapping_Marks_Digits {
    public static int rev(int x){ 
        int ans = 0;
        while (x!=0) {
            int temp = x%10;
            ans=ans*10+temp;
            x/=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t--!=0) {
            int a = s.nextInt(), b = s.nextInt();
            if(a>b){ 
                System.out.println("Yes");
            }else{ 
                if(a>rev(b) || rev(a)>b || rev(a)>rev(b)){ 
                    System.out.println("Yes");
                }
                else{ 
                    System.out.println("No");
                }
            }
        }
        s.close();
    }
}