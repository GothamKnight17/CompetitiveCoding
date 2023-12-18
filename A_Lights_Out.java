/**
 * A_Lights_Out
 */
import java.util.Scanner;
public class A_Lights_Out {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] grid = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = s.nextInt();
            }
        }
        
        s.close();
    }
}