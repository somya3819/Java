//Print the sun of all subsets.
import java.util.Scanner;
public class P6_PrintSumSSQ {
    static void SumSS(int[] arr , int n, int idx , int sum ){
        if(idx>=n){
            System.out.print(sum+" ");
            return;
        }

        SumSS(arr,n , idx+1, sum+arr[idx] ); //include next element
        SumSS(arr, n , idx+1 , sum);//exclude
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int[] arr={2,3};

        SumSS(arr , arr.length , 0 , 0 );
    }
}
