import java.util.*;
public class DynamicInput {
    public static void main(String[] args) {
        int row, col;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        row = sc.nextInt();
        System.out.println("Enter number of columns:");
        col = sc.nextInt();

        int[][] search = new int[row][col];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < search.length; i++) {
            for (int j = 0; j < search[i].length; j++) {
                search[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < search.length; i++) {
            for (int j = 0; j < search[i].length; j++) {
                System.out.print(search[i][j] + " ");
            }
            System.out.println();
        }
    }
}