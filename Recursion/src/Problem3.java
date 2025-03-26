//find the nth fibonacci number . recursive tree //time and space complexity
import java.util.Scanner;
public class Problem3 {
    static int fibonacci(int n){
        //base case
        if(n==0) return 0;
        if(n==1) return 1;

        //recursion work
        int a= fibonacci(n-1);
        int b= fibonacci(n-2);

        //self work
        int ans=a+b;
        return ans;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("enter n : ");
        int n=s.nextInt();
        System.out.print("fibonacci number = ");
        System.out.println(fibonacci(n));

    }
}
