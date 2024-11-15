package bitManipulation;
import java.util.*;
class oddAndEven{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int bitMask = 1;
        if((num & bitMask )== 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}