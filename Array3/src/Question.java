//given an array 'a' consisting of integers . return the first value that is repeating in this array . if no value is being repeated , return -1.

public class Question {
    public static void main(String[] args) {
        int[] a={1,5,3,4,6,3,4};
        int n=a.length;
        int ans=-1;

        for(int i=0;i<n;i++){
            for(int j =i+1; j<n; j++){
                if(a[i]==a[j]){
                    ans=a[i];
                    System.out.println(ans);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
