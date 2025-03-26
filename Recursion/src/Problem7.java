//given: num and k , find k multiples of num. constraint : k>0 .
import java.util.Scanner;
public class Problem7 {
    static String multiples(int num, int k){
        if(k==1) return Integer.toString(num);

        return multiples(num ,k-1)+","+(num*k);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int k=s.nextInt();

        if (k <= 0) {
            System.out.println("Invalid input: k must be greater than 0.");
        } else {
            System.out.println(multiples(num, k));
        }
        return;
    }
}
