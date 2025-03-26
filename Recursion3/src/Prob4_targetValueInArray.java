public class Prob4_targetValueInArray {
    static boolean find(int[] arr, int target , int idx){
        if(arr[idx]==arr.length) return false;
        if(arr[idx]==target) return true;
        return find(arr, target ,idx+1);

    }
    public static void main(String[] args) {
        int[] arr= {4,8,7,6,6,7};
        int target =2;   //u can change the target here
        if(find(arr,target,0)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
