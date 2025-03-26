//find all the indices on which the target exists
public class Prob6_findAllIndices {
    static void find(int[] arr,int target, int idx){
        if(idx>=arr.length) return;

        if(arr[idx]==target){
            System.out.print(idx+" ");
        }

        find(arr,target,idx+1);
    }
    public static void main(String[] args) {
        int[] arr= {4,8,7,6,6,7};
        int target =7;   //u can change the target here

        System.out.print("all the indices are : ");
        find(arr,target,0);
    }
}
