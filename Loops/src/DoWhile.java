import java.util.Scanner;
public class DoWhile {
public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int i=0;
    do{
        System.out.println(i);
        i++;
    }while(i<=n);

}
}
