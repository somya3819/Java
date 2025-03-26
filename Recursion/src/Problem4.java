//sum of all the digits of a number
//eg number= 89654 , find the sum of 8,9,6,5,4

import java.util.Scanner;
public class Problem4 {
    static int Sum(int n){
        //base case
        if(n>=0 && n<=9) return n;

        //recursion
        int a= Sum(n%10);
        int b=Sum(n/10);

        //self work
        int ans = a+b;
        return ans;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(Sum(n));
    }
}
