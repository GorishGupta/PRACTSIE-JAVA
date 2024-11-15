package linkedList;
import java.util.*;
public class reverseLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head= tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void display(){
        if(head==null){
            System.out.print("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
           next =  curr.next;
           curr.next = prev;
          prev= curr;
          curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        reverseLL ll  = new reverseLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.reverse();
        ll.display();
    }
    
}
