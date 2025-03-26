import java.util.*;
public class JaggedArray{
    public static void main(String[] args) {
        int[][] jaggedarray = new int[3][];
        jaggedarray[0] = new int[] {1,2};
        jaggedarray[1] = new int[] {4,5,6};
        jaggedarray[2] = new int[] {7,8,9,10};


        for (int i = 0; i < jaggedarray.length; i++) {
            for (int j = 0; j < jaggedarray[i].length; j++) {
                System.out.println(jaggedarray[i][j]+" ");
            }
            System.out.println(" ");
        }


    }
}