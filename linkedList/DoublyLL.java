package linkedList;
public class DoublyLL {
    public class Node {
        Node prev;
        Node next;
        int data;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add First
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    //add Last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
           head =tail = newNode;
           return; 
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode; 
    }
    //add Middle
    public void addMiddle(int index, int data){
        if(index==0){
            addFirst(data);
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i < index -1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
    }

    //print
    public void print(){
        Node temp = head;
        System.out.print(" NULL  ");
        while(temp != null){
            System.out.print("<- "+temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("  NULL");
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("Doublly is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addMiddle(4, 'i');
        //ll.removeFirst();
        ll.print();
    }
}
