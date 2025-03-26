//print the max value of the array
public class Prob2_max {
    static int max(int[] arr ,int idx){
        //base case
        if(idx== arr.length-1) return arr[idx];

        //recursive
        int a= max(arr,idx+1);

        //self work
       return Math.max(arr[idx],a);
    }
    public static void main(String[] args) {
        int[] arr={3,10,3,2,5};
        System.out.println(max(arr,0));
    }
}
