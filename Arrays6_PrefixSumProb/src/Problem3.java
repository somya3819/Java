//check if we can partition the array into 2 subarrays with equal sum , more formally , check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array

import java.util.Scanner;
public class Problem3 {
    static int findArraySum(int[] arr){
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }

    static boolean equalPartition(int[] arr){
        int totalSum=findArraySum(arr);

        int prefsum=0;
        for(int i=0;i<arr.length;i++){
            prefsum += arr[i];
            int suffsum=totalSum-prefsum;

            if(suffsum==prefsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter length of array :");
        int n=s.nextInt();
        int[] arr=new int[n];

        System.out.println("enter the "+n+" elements : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        boolean ans=equalPartition(arr);
        System.out.println("equal partition : "+ans);
    }
}
