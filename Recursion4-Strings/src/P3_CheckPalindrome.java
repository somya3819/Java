import java.util.Scanner;
//check weather the given string is a palindrome or not
//palindrome in simpler language means string=reverse of string  ;  agr aap kisi string ko ulta krke likhoge toh bhi same hi word banega  example level
public class P3_CheckPalindrome {
    static String Reverse(String str , int idx){
        //base case
        if(idx==str.length()) return "";

        //recursive work + self work
        return Reverse(str, idx+1)+ str.charAt(idx);
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();

        String ans=Reverse(str , 0);
        if(ans.equals(str)){                  //here instead of ans==str , we will be using  ans.equals(str)
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}


//method 2
//import java.util.Scanner;
//
//public class P3_CheckPalindrome {
//    static boolean isPalindrome(String str, int left, int right) {
//        // Base case: If pointers have crossed or are equal, the string is a palindrome
//        if (left >= right) {
//            return true;
//        }
//        // Check characters at current pointers
//        if (str.charAt(left) != str.charAt(right)) {
//            return false;
//        }
//        // Recursive check for the rest of the string
//        return isPalindrome(str, left + 1, right - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        String str = s.nextLine();
//
//        if (isPalindrome(str, 0, str.length() - 1)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//        s.close();
//    }
//}