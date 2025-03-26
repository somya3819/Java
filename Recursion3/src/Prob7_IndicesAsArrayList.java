//return all indices as Array list if x exists in the array

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Prob7_IndicesAsArrayList {
    static ArrayList<Integer> AllIndices(int[] arr ,int target , int idx ){
        //base case
        if(idx>=arr.length){
            return new ArrayList<Integer>();                                                                             //return empty ArrayList
        }

        //self work
        ArrayList<Integer> a=new ArrayList<>();
        if(arr[idx]==target){
            a.add(idx);
        }

        //recursive work
        ArrayList<Integer> b= AllIndices(arr,target, idx+1);
         a.addAll(b);
         return a;
    }

    public static void main(String[] args){
        int[] arr= {4,8,7,6,6,7};
        int target =7;                                                                                                   //u can change the target here
        ArrayList<Integer> ans= AllIndices(arr,target,0);
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
