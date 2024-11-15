package recursion;

public class printSubsequence {
    public static void printSubSeq(String ques, String ans) {
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        printSubSeq(ques.substring(1), ans + ch);
        printSubSeq(ques.substring(1), ans);
    }
    public static void main(String[] args) {
        printSubSeq("abc", "");
        
    }
    
}
