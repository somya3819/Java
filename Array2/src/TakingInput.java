import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n=s.nextInt();
        int[] arr= new int [n];

        System.out.println("enter the elements:");
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt() ;

        }
        System.out.println("there you go :");
        for(int i=0 ; i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("yayyyy");
    }
}
