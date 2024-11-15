package linkedList;
import java.util.LinkedList;
public class singlyList {
    public static void main(String[] args) {
        LinkedList<Integer> single = new LinkedList<Integer>();
        for(int i=0;i<5;i++){
            single.add(i);
        }
        single.addFirst(-1);
        single.addLast(5);
        System.out.println(single.removeFirst());
        System.out.println(single.removeLast());
        System.out.println(single.getFirst());
        System.out.println(single.getLast());
        System.out.println(single);
        //single.add(1);
    }
    
}
