//BUBBLE SORT - adjacent elements swap hote hai
//it's a stable algorithm , meaning in case there are any duplicate elements present in the array , the order of the duplicate elements in the sorted array remains the same.
//is bubble sort an in place algorithm ? yes it is , kyunki woh koi aur extra jagah nhi gher rhi
//iterations will be (n-1)
//TC = worst case:O(n^2)  best case:O(n)
//SC= O(1)
public class BubbleSOrt {
    static void BubbleSort(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0 ;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,5,7,8,4,1,6};
        BubbleSort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}