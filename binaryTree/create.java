package binaryTree;
import java.util.*;
class BinaryTree{
    class Node{
        int val;
        Node left;
        Node right;
    }
    Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTree(){
        root  = CreateTree();
    }

public Node CreateTree() {
    System.out.println("Value :");
    int item = sc.nextInt();
    Node nn = new Node();
    System.out.println("Has LEft");
    boolean hlc = sc.nextBoolean();

    if(hlc)
        nn.left= CreateTree();
        System.out.println("Has Right");
    boolean hrc = sc.nextBoolean();
    if(hrc)
    nn.right =  CreateTree();
    return nn;
}
public void Display(){
    Display(root);
}
private void Display(Node nn){
    if(nn==null) return ;
    String s = "<--" + nn.val+"-->";
    if(nn.left != null)
        s = nn.left.val + s;
    
    else
        s = "Null" + s;
    if(nn.right != null)
        s = nn.right.val + s;
    else
        s = "Null";
    System.out.println(s);
    Display(nn.left);
    Display(nn.right);
}
public int findMax(Node nn){
    if(nn==null)
    return 0;
    int lmax = findMax(nn.left);
    int rmax = findMax(nn.right);

    return Math.max(nn.val, Math.max(lmax, rmax));
}
public int height(Node root){
    if(root==null){
        return 0;
    }
    int leftH = height(root.left);
    int rightH = height(root.right);

    return Math.max(leftH, rightH) + 1;
}
public void inorder(Node nn){
    if(nn == null){
        return;
    }
    inorder(nn.left);
    System.out.print(nn.val+" ");
    inorder(nn.right);
}
public void levelOrderTraversal(){
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    while (!q.isEmpty()){
        Node rv = q.remove();
        System.out.print(rv.val +" ");
        if(rv.left  != null){
            q.add(rv.left);
        }
        if(rv.right !=null){
            q.add(rv.right);
        }
        System.out.println();
    } 
}

}