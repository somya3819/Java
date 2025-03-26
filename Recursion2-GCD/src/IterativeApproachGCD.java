//iterative approach for gcd
public class IterativeApproachGCD {
    public static void main(String[] args) {
        int x=24;
        int y=15;

        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        System.out.println(y);
        return ;
    }
}