//Give an array of names of the fruits; you are supposed to sort it in lexicographical(order followed in dictionary) order using
//the selection sort
//Input : ["papaya","lime","watermelon","apple","mango","kiwi"]
public class Task2 {
    static void sortFruits(String[] arr , int n){
        for(int i=0 ; i<n ; i++){
            int min_Index=i;
            for(int j=i+1 ; j<n ; j++){
                if(arr[j].compareTo(arr[min_Index])<0){
                    //The inner loop compares elements using compareTo(), which:
                    //Returns a negative value if arr[j] is smaller than arr[min_Index].
                    //Returns a positive value if arr[j] is greater than arr[min_Index].
                    //Returns 0 if both strings are equal.
                    min_Index=j;
                }
            }
            //swap arr[i] and arr[min_Index]
            String temp= arr[i];
            arr[i]=arr[min_Index];
            arr[min_Index]=temp;
        }
    }
    public static void main(String[] args) {
        String[] arr={"papaya","lime","watermelon","apple","mango","kiwi"};
        int n=arr.length;
        sortFruits(arr, n );
        for(String val: arr){
            System.out.print(val+" ");
        }
    }
}
