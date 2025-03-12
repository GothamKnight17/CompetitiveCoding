import java.util.Scanner;

public class A_FizzBuzz_Remixed {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0) {
            int n = s.nextInt();
            int fullCycles = (n + 1) / 15;
            int remainder = (n + 1) % 15;
            int count = fullCycles * 3 + Math.min(remainder, 3);
            System.out.println(count);
        }
        s.close();
    }
}