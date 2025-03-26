//print all the values between 1 and 50 except for the multiple of 3.
import java.util.Scanner;
public class Continue {
    public static void main(String[] args) {
        for(int i=0; i<=50 ; i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }

    }
}
