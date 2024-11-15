package linkedList;

public class palindrome {
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
    public void addfirst(int data){
        //new Node
        Node newNode  = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        
            newNode.next = head;
            head = newNode;
        

    }
    public void display(){
        if(head==null){
            System.out.println(" LL is Empty");
        }
        Node temp =  head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
            
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        palindrome ll  = new palindrome();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.display();
    }
}
