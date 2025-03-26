import java.sql.SQLOutput;
import java.util.Scanner;
public class EvenAndDivisibleBy3 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        if(n%2==0 && n%3==0){
            System.out.println("required number is "+n);
        }
        else{
            System.out.println("no");
        }
    }
}
