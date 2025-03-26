//Selection sort - 1st rule , choose a the index jismein min element hai ; 2nd rule : place it at the beginning
// is selection sort stable? no
//is it in-place algorithm? yes , no extra space has been taken
//Time complexity = O(n^2)
//Space complexity= O(1) , constant chal rha space complexity tabhi it's 1
public class SelectionSort {
    static void Selection(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){                            //idhr n-1 bhi aa sakta
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    int temp=arr[j];
                    arr[j]=arr[minIndex];
                    arr[minIndex]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,71,2,5,8,9,6,4,7};
        Selection(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
