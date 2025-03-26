import java.util.Scanner;

public class RotateMatrices {
    // Method for printing arrays
    static void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Transpose method (in place)
    static void Trans(int[][] arr1, int r1, int c1) {
        for (int i = 0; i < r1; i++) {
            for (int j = i + 1; j < c1; j++) {
                // Swap arr1[i][j] with arr1[j][i]
                int temp = arr1[i][j];
                arr1[i][j] = arr1[j][i];
                arr1[j][i] = temp;
            }
        }
    }

    // Rotate method (90 degrees clockwise)
    static void rotation(int[][] arr1, int r1, int c1) {
        // Step 1: Transpose the matrix
        Trans(arr1, r1, c1);

        // Step 2: Reverse each row
        for (int i = 0; i < r1; i++) {
            int left = 0, right = c1 - 1;
            while (left < right) {
                // Swap elements in the row
                int temp = arr1[i][left];
                arr1[i][left] = arr1[i][right];
                arr1[i][right] = temp;
                left++;
                right--;
            }
        }

        // Print the rotated matrix
        printArray(arr1);
    }

    // Main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows (r1):");
        int r1 = s.nextInt();
        System.out.println("Enter number of columns (c1):");
        int c1 = s.nextInt();

        if (r1 != c1) {
            System.out.println("Matrix rotation requires a square matrix.");
            return;
        }

        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = s.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printArray(arr1);

        System.out.println("Rotated Matrix:");
        rotation(arr1, r1, c1);
    }
}
