//return all subsequence of a string in an array list
import java.util.ArrayList;
import java.util.Scanner;
public class P4_ReturnSubsequence {
    static ArrayList<String> GetSSQ(String str){
        ArrayList<String> ans=new ArrayList<>();
        //base case
        if(str.length()==0){
            ans.add("");
            return ans;
        }

        char curr=str.charAt(0);
        ArrayList<String> recWork =GetSSQ(str.substring(1));

        for(String ss: recWork){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str= s.nextLine();
        System.out.println(GetSSQ(str));
    }
}
