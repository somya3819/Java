//given an array of integers of size n, answer q queries where you need to print the sum of values in a given range of indices from 1 to r (both included).
//Note:the values of 1 and r in queries follow 1- based indexing.

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        //n
        System.out.print("enter n: ");
        int n=s.nextInt();
        //original array
        System.out.println("enter " + n + " elements : ");
        int[] arr = new int[n+1];//array size n+1 lenge
        for (int i = 1; i <= n; i++) {
            arr[i] = s.nextInt();
        }
        //printing original array
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i]+" ");
        }

        //now , prefix array
        int[] pref = new int[n+1];
        pref[0]=0;
        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        //enter queries
        System.out.print("enter queries :");
        int q=s.nextInt();

        //answer
        while(q-->0) {
            //l & r
            System.out.println("enter range :");
            int l=s.nextInt();
            int r=s.nextInt();

            //sum from l to r
            int sum = 0;
            sum = pref[r] - pref[l - 1];
            System.out.println("sum = " + sum);
        }
    }

}
