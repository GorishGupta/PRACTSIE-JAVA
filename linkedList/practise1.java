package linkedList;
public class practise1 {
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
      //addfirst
      public void addfirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head==null){
            head= tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
      }
      //addlast
      public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        newNode.next = null;
        tail.next = newNode;
        newNode = tail;
      }
      //display
      public void display(){
        if(head==null){
            System.out.println("LL is Empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.print("null");
      }
      // add middle
      public void addMiddle(int data, int index){
        if(index==0){
            addfirst(data);
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
      public int removefirst(){
        if(size==0){
            System.out.print(" LL is EMpty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
      }
      public int removeLast(){
        if(size==0){
            System.out.print(" LL Is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        temp = tail;
        size--;
        return val;
      }
      public int iterativeSearch(int key){
        Node temp = head;
        int count = 0;
        while(temp.data != key){
            temp = temp.next;
            count++;
        }
       return count+1;
      }
      public int recursiveSearch(int key){
        return helper(head,key);
      }
      public int helper(Node head, int key){
        if(head==null){
          return -1;
        }
        if(head.data == key){
          return 0;
        }
        int index = helper(head.next, key);
        if(index == -1 ){
          return -1;
        }
        return index + 1;
      }
      public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
          next = curr.next;
          curr.next = prev;
          prev= curr;
          curr = next;
        }
        head = prev;
      }

      public static void main(String[] args) {
        practise1 ll = new practise1();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
       // ll.addlast(6);
       // ll.addMiddle(9,3);
       // ll.removefirst();
        //ll.removeLast();
       // System.out.println(ll.iterativeSearch(3));
        //System.out.println(ll.recursiveSearch(5));
        ll.display();
        System.out.println();
        ll.reverse();
        ll.display();
      }
}
