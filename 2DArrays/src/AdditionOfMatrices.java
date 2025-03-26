//2D Arrays
//addition of 2 matrices(in this case there's always a restriction = dimensions of both the matrices should be same)
import java.util.Scanner;
public class AdditionOfMatrices {
    static void printArray(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
    static void add(int[][] arr1 , int[][] arr2 ,int r1 ,int r2 ,int c1, int c2 ){
        if(r1!=r2 ||c1!=c2){
            System.out.println("wrong input , dimensions should be same");
            return ;
        }
        int[][] sum= new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.print("Sum = ");
        printArray(sum);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        //array 1
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

        //array2
        System.out.println("rows2: ");
        int r2=s.nextInt();
        System.out.println("col2: ");
        int c2=s.nextInt();
        System.out.print("enter elements for array2 : ");
        int[][] arr2= new int[r2][c2];
        for(int i=0;i< r2;i++){
            for(int j=0;j<c2 ; j++){
                arr2[i][j]=s.nextInt();
            }
        }
        printArray(arr2);
        System.out.println();

        add(arr1 , arr2 ,r1 , r2 , c1 , c2);

    }
}