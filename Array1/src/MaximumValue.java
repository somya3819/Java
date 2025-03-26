//calculate the maximum value out of all the elements in the array
public class MaximumValue {
    public static void main(String[] args){
        int[] arr={10,100,56,562,5,3};
        int a= arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if (a<arr[i]){
                a=arr[i];
            }

        }
        System.out.println(a);
    }
}
//yayyy , did it myself!!!