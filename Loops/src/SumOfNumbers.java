import java.util.Scanner;
//using while loop
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int i=1;
        int sum=0;
//printing 1st n  natural numbers
        while(i<=n){
            System.out.println(i);
            //printing sum of 1st n natural numbers
            sum+=i;
            i++;
        }

        System.out.println("sum="+sum);

    }
}
