//only 1 public class can be there in 1 java file
public class Student {
    int rollNo;// default value will be 0
    String name;//default value will be null here

    static class Main{}
        public static void main(String[] args) {
            Student s1=new Student();
            System.out.println(s1.rollNo);
            System.out.println(s1.name);
        }
//creating an object from a class is known as "instantiating"
}
