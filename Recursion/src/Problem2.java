//find the value of n factorial
import java.util.Scanner;
public class Problem2 {
    static int factorial(int n){
        //base case
        if(n==0){
            return 1;
        }
        //small prob
        int smallprob= factorial(n-1);
        //self work
        int ans=n*smallprob;
        return ans;
    }
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int n=s.nextInt();
        System.out.println(factorial(n));
    }
}
