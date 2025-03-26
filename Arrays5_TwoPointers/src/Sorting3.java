//an array of a integers , sorted in non decreasing order , return an array of the squares of each number sorted in non decreasing order
import java.util.Arrays;
import java.util.Scanner;
public class Sorting3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 8};
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j++] = arr[i] * arr[i];
        }
        //printing
//        for (int i = 0; i < n; i++) {
//            System.out.print(ans[i] + " ");
//        }

        System.out.println(Arrays.toString(ans));
    }
}
