package bitManipulation;
import java.util.*;
public class power2 {
    public static boolean function(int num){
        return (num & (num-1))==0;
    }
    public static int count(int num){
        int count = 0;
        while(num>0){
            if((num & 1)!= 0){
                count++;
            }
            num = num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //int num =sc.nextInt();
   // System.out.println(count(num));
   Integer a = 31;
   Integer b = 258;
   Integer c = 258
   
   ;
   System.out.println(c.equals(b));
   ArrayList<Integer> al = new ArrayList<>();
   al.add(12);
  int n = al.ensureCapacity();
  System.out.println(n);
   // al.trimToSize();
    System.out.println(Math.pow(3,5));
}
    
}
