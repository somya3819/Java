import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr={0,1,0,1,0,0,1,0,1,0};
        int n=arr.length;
        int[] ans = new int[n];
        int j=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                ans[j++]=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                ans[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(ans));
        //This version uses Arrays.toString() to convert the array to a string representation, making the output human-readable.
    }
}
