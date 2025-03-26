//LESSON - 4
//TAKING INPUT
import java.util.Scanner;
//scanner class is used to take user input
public class TakingInput{
    public static void main(String[] args){
 Scanner s= new Scanner(System.in);


        //taking string as output
        System.out.println("enter your name : ");
        String name=s.nextLine();
        System.out.println("name entered is "+ name);

 //taking number as input
System.out.println("enter a number:");
  int num = s.nextInt();
  System.out.println("your number is : "+ num );

    }
}
