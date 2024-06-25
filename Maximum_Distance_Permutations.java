import java.util.Scanner;

/**
 * Maximum_Distance_Permutations
 */
public class Maximum_Distance_Permutations {
    public static void sideWays(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] result = new int[n + m - 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i + j] += matrix[i][j];
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        
        sideWays(matrix);
    }
}