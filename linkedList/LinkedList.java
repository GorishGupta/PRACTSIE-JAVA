package linkedList;
import java.util.*;
public class LinkedList {
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
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void display(){
        if(head==null){
            System.out.println("LL is Empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int index, int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
            newNode.next = temp.next;
            temp.next = newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head= tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
       if(size==0){
        return Integer.MIN_VALUE;
       }
       else if(size==1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
       }
       Node prev = head;
       for(int i=0;i<size -2;i++){
        prev = prev.next;
       }
       int val = prev.next.data;
       prev.next = null;
       tail = prev;
       size--;
       return val;
     }

     public void removeMiddle(int index){
        // find the size of the linked list
        int length = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        if( index == length){
            head = head.next;
            return;
        }
        int  i =1;
        int tofind = length - index;
        Node prev = head;
        while ( i < tofind){
            prev= prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
     }
     public int iterativeSearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            else{
                temp = temp.next;
                i++;
            }
        }
        return -1;
     }
     public int helper(Node head, int key ){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index + 1;

     }
     public int recursion(int key){
        return helper(head, key);
     }
     public void reverseList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
    LinkedList ll = new LinkedList();
      //  ll.display();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(3,5);
        //ll.removeFirst();
        //ll.removeLast();
    //    System.out.println(ll.iterativeSearch(5));
     //   System.out.println(ll.recursion(3));
     //   System.out.println(ll.recursion(10));
        
     //   ll.reverseList();
     //ll.removeMiddle(3);
          ll.display();    
       // System.out.println(ll.size);
    }
    
}
