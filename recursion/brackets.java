package recursion;

public class brackets {
    public static void getpar(int n, int left, int right, String ans){
        if(left==n && right==n){
            System.out.println(ans);
            return;
        }
        if(left > n || right > left){
            return;
        } 
        getpar(n, left+1, right, ans+'{');
        getpar(n, left, right+1, ans+'}');
    }
    public static void main(String[] args) {
        getpar(4, 0, 0, "");
    }
    
}
