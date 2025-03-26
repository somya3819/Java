public class swap {
    public static void main(String[] args) {
        int a=9;
        int b=8;
        //swap using temp
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+","+"b="+b);

        //swap using add and sub
        int c=a+b;
        a=c-b;
         b=c-a;
        System.out.println("a="+a+","+"b="+b);

    }
}
