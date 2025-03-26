import java.util.Scanner;

//write a program to print the reverse of a string using recursion
public class P2_ReverseString {
    static String Reverse(String str,int idx){
        //base case
        if(idx==str.length()) return "";

        //recursive work + self work
        return Reverse(str, idx+1)+ str.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();

        System.out.println(Reverse(str,0));
    }
}