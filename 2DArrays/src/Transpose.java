import java.util.Scanner;
public class Transpose {
    //method for printing arrays
    static void printArray(int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Transpose
   static void Trans(int[][] arr1,int r1, int c1){
        int[][] ans=new int[c1][r1]; //this approach is for both square and non-square matrices
        //VERYY EASYY
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                ans[j][i]=arr1[i][j];
            }
        }
      printArray(ans);

//       for(int i=0;i<r1;i++){
//            for(int j=0;j<c1;j++){
//                arr1[j][i]=arr1[i][j];
//            }
//      }
//       printArray(arr1);  //but this approach is only for square matrices , not for non square matrices
    }


    //main method
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

        System.out.println("Transpose of the matrix :");
        Trans(arr1 ,r1 ,c1 );
    }
}
