//DID IT ALL BY MYSELF YAYYYYYY!!!!
//find the sum of the elements of the array [2,3,5,20,1]
public class Prob3_sum {
    static int sum(int[] arr , int idx){
        //base case
        if(idx==arr.length) return 0;

        //recursive work
        int s=sum(arr,idx+1);
        //self work
        return arr[idx]+s;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,20,1};
        System.out.println(sum(arr,0));
    }
}
