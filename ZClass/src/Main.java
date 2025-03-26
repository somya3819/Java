//Binary search
public class Main {
    static int Search(int start , int end, int target , int[] arr){
        while(start<=end){
            int mid= start+(end-start)/2;

            if(arr[mid]==target) return mid;
            if(arr[mid]>target) end=mid-1;
            if(arr[mid]<target) start=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
int[] arr={1,2,3,4,5,6,7,8};
int start=0;
int end=arr.length-1;
int target=2;

        System.out.print(Search(start , end , target, arr));

    }
}