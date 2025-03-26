//problem 1
//Given an integer array arr, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
public class Task1 {
    public static void main(String[] args) {
        int[] arr={5,0,4,7,5,0,0,3,5,1,0,1};
        int n=arr.length;
        for(int i=0;i<n ;i++){
            for(int j=0 ; j<n-1-i ; j++){
                if(arr[j]==0 && arr[j+1]!=0){
                    //swap arr[j] and arr[j+1]
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<n ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
