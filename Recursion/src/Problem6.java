//DID IT MYSELF YAYY
//given 2 numbers p and q , find the value of p^q using a recursive function.
import java.util.Scanner;
public class Problem6 {
    static int power(int p , int q){
        if(q==0) return 1;

        return power(p,q-1)*p;
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("enter p : ");
        int p=s.nextInt();
        System.out.print("enter q : ");
        int q=s.nextInt();

        System.out.print("answer = ");
        System.out.print(power(p,q));
    }
}
