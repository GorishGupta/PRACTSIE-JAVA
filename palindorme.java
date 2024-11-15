import java.util.*;
public class palindorme {
    public static int Strings(String str1, String str2){
        if(str1.length() < str2.length()){
            return -1;
        }
        else if(str1.equals(str2)){
            return 0;
        }
        return 1;
    }
    public static boolean palindrome(String str) {
        for(int i=0;i<str.length()/2;i++){
            int n =str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        String str = "RADAR";
       System.out.println(palindrome(str));
       String str1 = "Hello1";
       String str2 = "Hello";
       
       System.out.println(Strings(str1, str2));
    }
}
