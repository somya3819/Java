public class RotateByK {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=1;
        int n=arr.length;
         k=k%n;
         int[] ans=new int[n];
         int j=0;

         //to rotate
         for(int i=n-k;i<n;i++){ // i=n-k , i<n
             ans[j++]=arr[i];
         }
         for(int i=0;i<n-k;i++){ //i=0  , i<n-k
             ans[j++]=arr[i];
         }

         //to print the rotated array
        for(int i=0;i<n ;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
