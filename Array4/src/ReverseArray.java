//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//reverse the array
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={5,4,7,8,4};
        int n=arr.length;
        for(int i=n-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        return;
    }
}