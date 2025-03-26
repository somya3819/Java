//remove all the occurences of 'a' from the string "abcax".
import java.util.Scanner;
public class P1_RemoveOccurences {
    //1st method
    static String RemoveChar(String a,  int idx ){
        //base case
        if(idx==a.length()) return "";

        //recursive work
        String ans=RemoveChar(a, idx+1 );
        char current = a.charAt(idx);

        //self work
        if(current !='a'){
            return current+ans;
        }else{
            return ans;
        }
    }

    //2nd method
    static String Approach2(String a){
        if(a.length()==0) return "";

        String ans=Approach2(a.substring(1));
        char curr= a.charAt(0);

        if(curr!='a'){
            return curr+ans;
        }else{
            return ans;
        }
    }


    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String a= s.nextLine();


        System.out.println(RemoveChar(a, 0));
        System.out.println(Approach2(a));
    }
}
