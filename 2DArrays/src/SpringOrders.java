//easy
import java.util.Scanner;
public class SpringOrders {
    static void printArray(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void Spiral(int[][] matrix , int r, int c){
        int topRow=0,bottomRow=r-1 , leftCol=0,rightCol=c-1;
        int totalElements=0;

        while(totalElements<r*c){
            //top row
            for(int j=leftCol;j<=rightCol && totalElements<r*c;j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            //right column
            for(int i=topRow;i<=bottomRow && totalElements<r*c;i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            //bottom Row
            for(int j=rightCol;j>=leftCol && totalElements<r*c;j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            //left column
            for(int i=bottomRow;i>=topRow && totalElements<r*c;i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
        System.out.println("rows1: ");
        int r1=s.nextInt();
        System.out.println("col1: ");
        int c1=s.nextInt();
        System.out.print("enter elements for array1 : ");
        int[][] arr1= new int[r1][c1];
        for(int i=0;i< r1;i++){
            for(int j=0;j<c1 ; j++){
                arr1[i][j]=s.nextInt();
            }
        }
        printArray(arr1);
        System.out.println();

        System.out.println("Spiral order matrix : ");
        Spiral(arr1 , r1 , c1);
    }
}
