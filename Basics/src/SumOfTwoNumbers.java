import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        System.out.println("enter 1st num = ");
        int num1=s.nextInt();
        System.out.println("number is "+ num1);

        System.out.println("enter 2nd num = ");
        int num2=s.nextInt();
        System.out.println("number is "+ num2);

        int sum=num1+num2;
        System.out.println("sum is "+ sum);
        System.out.println(" yayyyyy ");
    }
}
