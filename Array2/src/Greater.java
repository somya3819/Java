//count th no of elements strictly greater than value x
import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter x");
        int x = s.nextInt();
        int[] arr= new int[7];
        int count=0;

        System.out.println("make the array:");
        for(int i=0;i<arr.length ;i++){
            arr[i]=s.nextInt();
        }


        for(int i=0; i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }

        }
        System.out.println("here's the count :"+ count);
    }

}
//did it all myself , yayyy