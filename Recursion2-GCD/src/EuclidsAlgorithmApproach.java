import java.util.Scanner;
public class EuclidsAlgorithmApproach {

    static int gcd(int x , int y) {
    if(y==0) return x;
    return gcd(y,x%y) ;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println(gcd(x,y));
    }
}
