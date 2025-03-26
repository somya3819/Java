//COUNT SORT
//1 . not comparison based
//2. a certain range is defined , eg (1-100)
//3. under CERTAIN CONDITIONS it can do better than O(nlogn) in terms of time complexity
//4. is not an in-place algo , an extra memory space is used
public class countSort {
    static void DisplayArray(int[] arr ){
        for(int val: arr){
            System.out.print(val + " ");
        }
    }

    static int findMax(int[] arr){
        int max=arr[0];
        for(int i=0 ; i<arr.length -1 ;i++ ){
            if(max<arr[max+1]){
                max=arr[max+1];
            }
        }
        return max;
    }

    static void basicCountSort(int[] arr){
        //find the largest element in the array
        int max=findMax(arr);
        System.out.println("Max:"+max);

        int[] freq=new int[max+1];
        //to calculate the freq array 
        for(int i=0 ; i<arr.length ; i++){
            freq[arr[i]]++;
        }
    }

    public static void main(String[] args){
        int[] arr={4,3,1,5,3,1,3,5};
        int n= arr.length;
        //we have to make a frequency array here
        //array mein jo largest digit hai utne size ki new array/frequency array banayenge
        basicCountSort(arr);
        DisplayArray(arr);
    }
}
