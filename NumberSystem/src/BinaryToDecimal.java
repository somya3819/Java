import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();  //taking binary number here

        int ans=0;// assuming our obtained answer tp be this for now//it's like the sum here
        int pw=1; //powers of 2

        while(n>0){
            int unit=n%10;
            ans+=unit*pw;
            n/=10;
            pw*=2;
        }
        System.out.println(ans);
    }
}
