//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
// Return the answer in any order.
public class P2_ASCIIbasedPossibleLetterCombination {
    static void Ans(String dig , String[] val , String res){
        if(dig.length()==0){
            System.out.print(res+" ");
            return ;
        }

        int currDig=dig.charAt(0)-'0';
        String a= val[currDig];

        for(int i=0; i<a.length();i++){
            Ans(dig.substring(1), val , res+a.charAt(i));
        }
    }
    public static void main(String[] args){
        String dig="23";
        String[] val={"", "" , "abc", "def", "ghi", "jkl","mno", "pqrs" , "uvw", "xyz"};
        Ans(dig, val , "");
    }
}
