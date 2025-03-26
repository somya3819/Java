public class BitwiseOperators {
    public static void main(String[] args) {
        int p=9 , q=10;

        System.out.println(p|q);//11
        System.out.println(p&q);//8
        System.out.println(p^q);//3

        //bitwise left shift
        //in case they ask you to guess the solution , here's the formula written below for you ;)
        //formula : a<<b=a*(2^b)
        System.out.println(p<<1);//18
        System.out.println(p<<2);//36

        //bitwise right shift
        //formula : a>>b=a/(2^b)
        System.out.println(p>>1);//4
        System.out.println(p>>2);//2
    }
}
