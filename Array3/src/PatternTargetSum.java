//find the total no of pairs in the array whose sum is equal to the given value x
import java.util.Scanner;

public class PatternTargetSum {
    public static void main(String[] args) {
        int[] arr= {4,6,3,8,5,2};
        Scanner s= new Scanner(System.in);
        int target=s.nextInt();
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
