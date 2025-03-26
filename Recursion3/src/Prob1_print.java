//print all the elements in an array
public class Prob1_print {
    static void array(int[] arr , int idx){
        //base case
        if(idx==arr.length) return ;

        //self work
        System.out.print(arr[idx]+" ");

        //recursive work
        array(arr,idx+1);
        return;
    }
    public static void main(String[] args) {
        int[] arr= {4,5,4,8,5,9,1,5,7,4,5,5};
        array(arr,0);
    }
}