package linkedList;
import java.util.*;
public class practise {
    public static class Node{
        int data ;
        Node next;
    public Node(int data){
            this.data = data;
            this.next = null;
    }
}
    public static Node head;
    public static Node tail;
    public static int size;
    //add first
    public void addfirst(int data){
        //create a new Node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode; 
    }
    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = null;
        newNode = tail;
    }
    // display
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
    //add middle
  public void addmiddle(int data , int index){
    if(index == 0){
        addfirst(data);
        return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i =0;
    while(i<index-1){
        temp = temp.next;
        i++;
    }
    newNode.next =temp.next;
    temp.next = newNode;
  }

  // remove first
  public int removeFirst(){
    if(size==0){
        System.out.println("LL is empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
  }
  //remove last
  public int removeLast(){
    if(size==0){
        System.out.println("ll is Empty");
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }
    Node temp = head;
    for(int i=0;i<size-2;i++){
        temp = temp.next;
    }
    int val = temp.next.data;
    temp.next = null;
    tail = temp;
    size--;
    return val;

  }
  public void iterativeSearch(int key){
    Node temp = head;
    // diffrent approach
    for(int i=0;i<size;i++){
        if(temp.data == key){
            System.out.println(i+1);
        }
            temp = temp.next;
    }
    // using while loop
    int  i = 0;
    while(temp != null){
        if(temp.data==key){
            System.out.println(i);
        }
        temp = temp.next;
        i++;
    }
  }
  public int helper(Node head, int key){
    if(head==null){
        return -1;
    }
    if(head.data == key){
        return 0;
    }
    int index = helper(head.next, key);
    if(index == -1){
        return -1;
    }
    return index +1;
  }
  public int recursion(int key){
    return helper(head, key);
    
  }
    public static void main(String[] args) {
        practise ll = new practise();
        
       ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(5);
      //ll.addmiddle(9,2);
       //ll.removeFirst();
    //    ll.removeLast();
  // ll.iterativeSearch(3);
  System.out.println(ll.recursion(5));
        ll.display();
    }
}
