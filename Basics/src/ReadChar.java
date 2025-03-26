import java.util.Scanner;

//this s a program for reading a single character
public class ReadChar {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        //in java 0 based indexing hoti hai

        System.out.println("enter a character");
        char ch=s.next().charAt(0);
        System.out.println("character is "+ch);
    }
}


//java scanner methods to take input nextlnt()
//nextFIoat()
//nextBoolean()
//nextLine()
//next()
//nextByte()
//nextDouble()
//nextshort()
//nextLong ( )