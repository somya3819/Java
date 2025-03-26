import java.util.Scanner;
 class Question{
    static int lastIndex(int[] arr ,int x ){
        int last=-1;
        for(int i=0; i<arr.length ;i++){
            if(arr[i]==x){
                last=i;}
        }
        return last;
    }
}
public class LastOccurance {


    public static void main(String[] args) {
        int[] arr={1,5,6,1,4,7,5,2,1,5,4,2,1,4,5,21,4,5};

        Scanner s= new Scanner(System.in);
        int x=s.nextInt();

        System.out.println(Question.lastIndex(arr , x));
    }
}


