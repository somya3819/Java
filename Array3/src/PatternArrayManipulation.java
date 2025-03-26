//find the unique no in given array where all the elements are being repeated twice with one value being unique
//very smartly done, they very clever lollll , easy
public class PatternArrayManipulation {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,2,3,5};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }

            for(int k=0; k<arr.length;k++){
                if(arr[k]!=-1){
                    ans=arr[k];
                }
            }

        }
        System.out.println(ans);
    }
}
