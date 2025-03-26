//given an integer array 'a', return the prefix sum/running sum in the same array without creating a new array
import java.util.Scanner;
public class PrefixSum {
    public static void main(String[] args) {
Scanner s= new Scanner(System.in);
        System.out.println("enter length of array :");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the "+n+" elements : ");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }

        System.out.println("prefix array /running array :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}