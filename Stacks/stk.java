package Stacks;
import java.util.*;
public class stk {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        System.out.println(stk.empty());
        stk.push(5);
        stk.push(4);
        stk.push(3);
        stk.push(2);
        stk.push(1);
        System.out.println(stk);
        stk.pop();
        stk.pop();
        System.out.println(stk);
        System.out.println(stk.search(5));

    }
    
}
