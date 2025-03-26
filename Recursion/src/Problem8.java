//given anumber n , find the sum of natural numbers till n but with alternative signs.
//that means if n=5 , then you have to return 1-2+3-4+5=3 as your answer. constraints : 0<=n<=1e6
import java.util.Scanner;

public class Problem8 {
    static int SumSign(int n){
        if( n==0) return 0 ;

        if(n%2==0) return SumSign(n-1)-n;
        else return SumSign(n-1)+n;
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        System.out.print("Sum of "+n+ " natural numbers with alternative signs = ");
        System.out.print(SumSign(n));
    }
}
