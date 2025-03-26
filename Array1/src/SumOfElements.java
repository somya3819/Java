//calculate the sum of all the elements in the array
public class SumOfElements {
    public static void main(String[] args){         //always string here , never system
     //calculate the sum of all the elements in the given array
        int[] arr={1,5,3};
        int sum=0;
         for(int i=0;i<3;i++){
             sum+=arr[i];
         }
        System.out.println(sum);
    }
}
