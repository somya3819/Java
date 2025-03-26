import java.util.Scanner;
public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();

        if(n%3==0 || n%5==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
