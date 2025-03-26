import java.util.*;
public class Sum{
    public static void main(String[] args) {
        int[][] array1 = new int[2][2];
        int[][] array2 = new int[2][2];
        int[][] sum = new int[2][2];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for array1:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values for array2:");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}