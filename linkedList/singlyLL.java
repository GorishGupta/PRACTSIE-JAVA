package linkedList;

public class singlyLL {
    public static class Node{
        int data;
        Node next;

    public Node(int data){
        this.data= data;
        this.next = null;
    }
}
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(size==0){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(size==0){
            head =tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode = tail;
    }
    public void display(){
       if(size==0){
        System.out.println("LL is Empty");
       }
       Node temp = head;
       while(temp != null){
        System.out.print(temp.data+"->");
        temp = temp.next;

       }
       System.out.print("null");
    }
    public void addMiddle(int data, int k){
        if(size==0){
            addFirst(data);
        }
        else if(k==size){
            addlast(data);
        }
        else{
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i=0;
            while(i < k-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public int getfirst()
    {
        return head.data;
    }
    public Node getLast(){
       
        Node temp = head;
        while(temp != null){
            temp = temp.next;
        }
        return temp;
    }
    public int getITh(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public void removeFirst(){
        if(size==0){
            System.out.println("LL is EMpty");
        }
        else{
            Node temp = head;
            head = head.next;
           temp.next =null;
            size--;
        }
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return -1;
        }
        else if(size==1){
            int val
        }
        else{
            Node temp = head;
            for(int i=0;i<size-2;i++){
                temp = temp.next;
            }
            int val =temp.next.data;
            temp.next = null;
            tail=temp;
            size--;
            return val;
        }
    }
    public static void main(String[] args) {
        singlyLL ll = new singlyLL();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
       // ll.addMiddle(9, 2);
        System.out.println(ll.getfirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getITh(3));
        ll.removeFirst();
        ll.removeLast();
        ll.display();
    }

}

