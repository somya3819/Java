//merge sort
import java.awt.*;
public class MergeSort {
    static void DisplayArray(int[] arr , int n){
        for(int val: arr){
            System.out.print(val + " ");
        }
    }

    static void Merge(int[] arr , int l , int mid , int r){
        //self work
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0; i<n1 ; i++){
            left[i]=arr[l+i];
        }
        for(int j=0 ; j<n2 ; j++){
            right[j]=arr[mid+1+j];
        }

        int i=0, j=0 , k=l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k++]=left[i++];
            }else{
                arr[k++]=right[j++];
            }
        }

        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }

    static void MSort(int[] arr , int l , int r){ //recursion ho rhi hai yaha pr so yaha pr base case , recursive work and self work hoga
        //base case
        if(l>=r) return ;   // means agr left== right , ya fir left ka index is greater than right ka index which is not possible and which eventually means ki l=r , them it means it is a single element array , so uss case mein woh already sorted .

        //recursive work
        int mid=(l+r)/2;
        MSort(arr , l , mid);
        MSort(arr , mid+1 , r);
        Merge(arr , l , mid , r); //self work
    }

    public static void main(String[] args){
        int[] arr={5,7,9,6,2,5,77,9};
        int n= arr.length;
        System.out.println("before sorting :");
        DisplayArray(arr, n);
        System.out.println();
        System.out.println("after sorting : ");
        MSort(arr, 0 , n-1);
        DisplayArray(arr , n);
    }
}
