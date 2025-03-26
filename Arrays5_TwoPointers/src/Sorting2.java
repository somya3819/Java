//move all the integers in the beginning and odds in the end , ascending and descending order does not matter
import java.util.Scanner;
public class Sorting2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int j=0;
        int[] ans=new int[n];
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                ans[j++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                ans[j++]=arr[i];
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
