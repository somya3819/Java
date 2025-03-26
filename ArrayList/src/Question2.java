//write a program to sort an array list of strings in descending order
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question2 {

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list : "+list);

        Collections.sort(list);
        System.out.println("Ascending order : "+list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending order : "+list );



        //now in strings
        ArrayList<String> li= new ArrayList<>();
        li.add("welcome");
        li.add("to");
        li.add("somya's ");
        li.add("house");
        System.out.println("original : "+li);

        Collections.sort(li);
        System.out.println("ascending order :"+li);

        Collections.sort(li, Collections.reverseOrder());
        System.out.println("descending order :"+li);

    }
}
