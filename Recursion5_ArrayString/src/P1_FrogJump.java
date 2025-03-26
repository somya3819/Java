//STORY BASED QUESTIONS . IMP
//There are N stones, numbered .,N-I. For each i (Osi<N), the height Of Stone i is hi. There is a
//frog who is initially on Stone 0. He will repeat the following action some number of times to reach
//Stone N-l:
//If the frog is currently on Stone i, jump to Stone i+l or Stone i+2.
//Here, a cost of Ihi - hjl is incurred, where j is the stone to land on.
//Find the minimum possible total cost incurred before the frog reaches Stone N.
public class P1_FrogJump {
    static int Method(int[] h , int n , int idx){
        if(idx==n-1) return 0;

        int opt1= Math.abs(h[idx]-h[idx+1]) + Method(h , n , idx+1);
        if(idx==n-2) return opt1;
        int opt2 = Math.abs(h[idx]-h[idx+2]) + Method(h, n , idx+2);

        return Math.min(opt1, opt2);
    }
    public static void main(String[] args) {
        int[] h={10,30,40,20};
        System.out.println(Method(h,h.length , 0));
    }
}