//print all the numbers from 1 to n using recursion
//print all the numbers from n to 1 using recursion
import java.util.Scanner;
public class Problem1 {
    static void printIncreasing(int n){
        //base case
        if(n==1){
            System.out.println(1);
            return ;
        }

        //recursion work
        printIncreasing(n-1);

        //selfwork
        System.out.println(n);
    }

    static void printDecreasing(int n){
        //base case
        if(n==1){
            System.out.println(1);
            return;
        }

        //self work
        System.out.println(n);
        //recursive work
        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter n :");
        int n=s.nextInt();

        System.out.println("1 to n : ");
        printIncreasing(n);
        System.out.println("n to 1 : ");
        printDecreasing(n);
    }
}