//easy
import java.util.Scanner;
public class GenerateSpiral {
    static void printArray(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] Spiral(int n){
        int[][] matrix=new int[n][n];
        int topRow=0,bottomRow=n-1 , leftCol=0,rightCol=n-1;
        int curr=1;

        while(curr<=n*n){
            //top row
            for(int j=leftCol;j<=rightCol && curr<=n*n;j++){
                matrix[topRow][j] =curr;
                curr++;
            }
            topRow++;
            //right column
            for(int i=topRow;i<=bottomRow && curr<n*n;i++){
                matrix[i][rightCol] =curr;
                curr++;
            }
            rightCol--;
            //bottom Row
            for(int j=rightCol;j>=leftCol && curr<n*n;j--){
                matrix[bottomRow][j] =curr;
                curr++;
            }
            bottomRow--;
            //left column
            for(int i=bottomRow;i>=topRow && curr<n*n;i--){
                matrix[i][leftCol] =curr;
                curr++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n : ");
        int n=s.nextInt();

        int[][] matrix=Spiral(n);
        printArray(matrix);

    }
}
