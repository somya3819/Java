//find the second largest element in the given array
//i did thislogic building all by myself , yayay

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={9,8,9,6,9,5,8};
        int max=arr[0];
        int len =arr.length;

        for(int i=0;i<len ;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0; i<len ; i++){
            if(arr[i]==max){
                arr[i]=0;
            }
        }

        int secMax=arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]>secMax){
                secMax=arr[i];
            }
        }
        System.out.println(secMax);
    }
}
