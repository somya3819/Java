import java.util.Scanner;
public class MultiplicationOfMatrices {
    //method for printing arrays
    static void printArray(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //method for multiplication of 2 matrices
    static void mul(int[][] arr1 ,int[][] arr2 , int r1,int r2, int c1 ,int c2){
        int[][] ans=new int[r1][c2];
        if(c1!=r2){
            System.out.println("wrong dimensions");
            return;
        }

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    ans[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("multiplication of 2 matrices : ");
        printArray(ans);
    }

    //main method for taking input and displaying final results
    public static void main(String[] args) {
Scanner s= new Scanner(System.in);
        System.out.println("enter r1 =");
        int r1=s.nextInt();
        System.out.println("enter c1 =");
        int c1=s.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("enter elements for arr1 :");
        for(int i=0;i< r1;i++){
            for(int j=0;j<c1 ; j++){
                arr1[i][j]=s.nextInt();
            }
        }
        printArray(arr1);
        System.out.println();

        System.out.println("enter r2 =");
        int r2=s.nextInt();
        System.out.println("enter c2 =");
        int c2=s.nextInt();
        int[][] arr2=new int[r2][c2];
        System.out.println("enter elements for arr2 :");
        for(int i=0;i< r2;i++){
            for(int j=0;j<c2 ; j++){
                arr2[i][j]=s.nextInt();
            }
        }
        printArray(arr2);
        System.out.println();

        mul(arr1 , arr2 , r1, r2 ,c1, c2);
        return;
    }
}
