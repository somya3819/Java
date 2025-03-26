import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int ans=0;//assumes binary answer obtained
        int pw=1;//powers of 10

        while(n>0){
            int parity=n%2;
            ans+= parity*pw;
            pw*=10;
            n/=2;
        }
        System.out.println(ans);
    }

}
