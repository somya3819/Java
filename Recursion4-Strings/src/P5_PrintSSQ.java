//print all the subsequences of the given string
import java.util.Scanner;
public class P5_PrintSSQ {
    static void Get(String str ,String currAns){
        if(str.length()==0){
            System.out.println(currAns);
            return ;
        }

        char curr=str.charAt(0);
        //recursive work
        Get(str.substring(1),currAns); //exclude curr char
        Get(str.substring(1), currAns+curr);   //include curr char  // here , curr + currAns ki jagah currAns+curr aayega nhi toh oder reverse ho jayega
    }
    public static void main(String[] args){
        Scanner s=new Scanner((System.in));
        String str=s.nextLine();

        Get(str, "");
    }
}
