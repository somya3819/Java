class Alg{
    int a;
    int b;

    Alg(int x , int y){
        System.out.println("constructor called");
        a=x;
        b=y;
    }

    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    int div(){
        return a/b;
    }
}
//a and b andr nhi dene , class k bahr dene hai i.e object banate hue
public class Constructor2 {
    public static void main(String[] args){
Alg obj= new Alg(5,9);
System.out.println("sum="+ obj.add());
    }
}
