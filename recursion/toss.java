package recursion;

public class toss {
    public static void coinToss(int num, String ans) {
        if(num==0){
            System.out.println(ans);
            return;
        }
        coinToss(num-1, ans+'H');
        coinToss(num-1, ans+'T');
    }
    public static void main(String[] args) {
        coinToss(3,"");
    }
    
}
