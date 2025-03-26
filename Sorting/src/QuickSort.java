//Quick sort
//pehle self work hota hai fir rec work hota hai
//is it stable ? no
//time comp : avg/best case -> O(nlogn)    worst case : O(n^2)

//space comp : O(n)
public class QuickSort {
    //helping method 1
    static void DisplayArray(int[] arr , int n){
        for(int val: arr){
            System.out.print(val + " ");
        }
    }

    //helping method 2
    static void swap(int[] arr , int x , int y){
        int temp= arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }


    //actual codes or methods
    static int partition(int[] arr , int st , int end){
        int pivot =arr[st];
        int count=0;

        for(int i = st+1 ; i<=end ;i++){
            if(arr[i]<=pivot) count++;
        }
        int pivotIdx= st+count;
        swap(arr , st , pivotIdx);
        int i=st , j=end;

        //elements lesser left side pr aa jayenge , and greater wale right side pr chale jayenge
        while(i<pivotIdx && j>pivotIdx){
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;

            if(i<pivotIdx && j>pivotIdx){
                swap(arr , i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void QSort(int[] arr , int st, int end){
        if(st>=end) return ;

        int pi=partition(arr , st , end);
        QSort(arr , st , pi - 1);
        QSort(arr , pi + 1 , end);

    }

    public static void main(String[] args){
        int[] arr={5,7,9,6,2,5,77,9};
        int n= arr.length;
        int st= 0;
        int end =n-1;

        System.out.println("before sorting :");
        DisplayArray(arr, n);
        System.out.println();

        System.out.println("after sorting : ");
        QSort(arr , st , end);
        DisplayArray(arr , n);
    }
}
