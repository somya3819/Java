import java.util.Scanner;

public class CheckSorted {

    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 7, 5, 9};
        boolean isSorted = true; // Assume the array is sorted initially

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false; // If a pair is out of order, set isSorted to false
                break; // No need to check further, exit the loop
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
