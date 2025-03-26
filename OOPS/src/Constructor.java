//Constructor = special method used to initialize objects
//constructor is almost used as method only
import java.util.Scanner;
class Algebra{

    //constructor
    Algebra(){
        System.out.println("hi . m being called..");
    }


    //method to add
    int add(int a , int b){
        return a+b;
    }
}

public class Constructor {
    public static void main(String[] args) {
Algebra a= new Algebra();
Scanner s= new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();

        System.out.println("sum of numbers is "+ a.add(x,y));
    }
}