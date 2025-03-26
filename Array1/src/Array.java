import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
    String[] names= {"Somya","rahul","ramesh"};

    //1st way  //for loop
        System.out.println(" "+"1st method ");
    for(int i=0; i< names.length ; i++){
        System.out.println(names[i]);
    }
System.out.println(" "+"2nd method");
    //2nd way   //for each   //more preferable
        for (String name :names){
            System.out.println(name);
        }

        System.out.println(" "+"3rd method");
        //3rd way
        int i=0;
        while( i < names.length){
            System.out.println(names[i]);
            i++;
        }

    }
}