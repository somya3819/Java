//return 1st index if the target exists in the array
public class Prob5_returnIndex {
    static int find(int[] arr, int target , int idx){
        if(idx>=arr.length) return -1;  //yaha return mein -1 index aayega cuz aisa koi index hai nahi , which means ki kisi bhi index pr target nhi hai , 0 likhte toh that would have mean ki 0th index pr target lies , tho we know it does not
        if(arr[idx]==target) return idx;
        return find(arr, target ,idx+1);

    }
    public static void main(String[] args) {
        int[] arr= {4,8,7,6,6,7};
        int target =7;   //u can change the target here
        System.out.println(find(arr,target ,0));
    }
}
