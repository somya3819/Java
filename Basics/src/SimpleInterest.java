import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("enter principle , rate and time :");
        float p = s.nextFloat();
        float r=s.nextFloat();
        float t=s.nextFloat();

        float SI=(p*r*t)/100;
        System.out.println("Simple Interest is "+ SI); }}