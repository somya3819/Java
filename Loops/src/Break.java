//Print the first multiple of 5 which is also a multiple of 7

public class Break {
    public static void main(String[] args) {
int i=1;
while(true){
    if((i%5==0)&&(i%7==0)){
        System.out.println("found ans="+i);
        break;
    }
    i++;
}

    }
}
