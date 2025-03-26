//INSERTION SORT - we manipulate the array in such a way that the array is divided into 2 parts - sorted and unsorted , we pick the elements from the unsorted part and insert it in the sorted array
//principe= take one element from the unsorted part , iterate it through the sorted and find the correct position of this element .
//TC=worst case : O(n^2)    best case:O(n)    but hm hmesha worst case dekhte hai
//SC= O(1)
//is insertion sort stable? yes
//is applicable when - no of elements are less - some part of the array is sorted
public class InsertionSort {
    static void Insertion(int[] arr){
        int n=arr.length;
        for(int i=1 ;i<n;i++){        //insertion sort meiin hm iteration 1 se start krte hai kyunki hm yaha assume kr rhe hote hai ki hamara 1st element already sorted element hai
            int j=1;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={8,1,2,5,8,3,6,9,7,5};
        Insertion(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
