package recursion;

public class headfact {
    public static int fact(int num) {
        if(num==0){
            return 1;
        }
        return num * fact(num -1);
    }
    public static int tailfact(int num, int ans){
        if(num==1){
            return ans;
        }
        return tailfact(num-1, num*ans);
    }
    public static int fibonaaci(int num) {
      if(num<=1){
        return num;
      }
        return fibonaaci(num-1)+fibonaaci(num-2);

    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(tailfact(5, 1));
        System.out.println(fibonaaci(5));
    }
    
}
