import com.sun.jdi.Value;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lecture1 {
    public static void main(String[] args) {
        Integer n= Integer.valueOf(3);
        System.out.println(n);

        Float f= Float.valueOf(4.5f);
        System.out.println(f);

        //syntax
        ArrayList<Integer> l1=new ArrayList<Integer>();
     //   ArrayList<Boolean> l2= new ArrayList<>();//parenthesis mein kuch bhi likhna optional hai

        //common methods for ArrayList
        //for adding
        l1.add(5);
        l1.add(7);
        l1.add(5);
        l1.add(7);
        l1.add(5);
        l1.add(7);
        //get an element at ith index
        System.out.println(l1.get(1));

        //printing ArrayList - print with for loop
        for(int i=0 ; i<l1.size();i++){      //size method is being used here
            System.out.print(l1.get(i)+" ");
        }

        System.out.println();

        //printing the array list directly
        System.out.println(l1);

        //adding element at some index i
        l1.add(3,9);
        System.out.println(l1);

        //modifying element at index i
        l1.set(1,10);
        System.out.println(l1);

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        //removing an element e , we don't know the index here
        l1.remove(Integer.valueOf(9));
        System.out.println(l1);

        //checking if an element exists
        boolean ans=l1.contains(Integer.valueOf(7));
        System.out.println(ans);

        //if you don't specify class , you can put anything inside l1
        ArrayList l= new ArrayList();
        l.add("p");
        l.add(1);
        l.add(true);
        System.out.println(l1);


    }
}