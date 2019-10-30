import java.util.ArrayList;

public class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;        
    }

    Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    void insert(int data){
        if(this.data > data){
            if(this.left == null){
                this.left = new Node(data);
            } else {
                this.left.insert(data);
            }
        } else if(this.data < data){
            if(this.right == null){
                this.right = new Node(data);
            } else {
                this.right.insert(data);
            }
        }
    }

/* 
preorder:   rid
inorder:    ird
postorder:  idr
*/ 
    void preOrder(){
        System.out.println(this.data + " --> ");
        if(this.left != null){
            this.left.preOrder();
        }
        if(this.right != null){
            this.right.preOrder();
        }
    }

    void inorder(){        
        if(this.left != null){
            this.left.inorder();
        }
        System.out.println(this.data + " --> ");
        if(this.right != null){
            this.right.inorder();
        }
    }

    void postorder(){        
        if(this.left != null){
            this.left.postorder();
        }        
        if(this.right != null){
            this.right.postorder();
        }
        System.out.println(this.data + " --> ");
    }

    void byLevel(Node head){
        ArrayList<Node> arr = new ArrayList<>();
        arr.add(head);
        while(!arr.isEmpty()){
            if(head.left != null){
                arr.add(head.left);
            } 
            if(head.right != null){
                arr.add(head.right);
            }
            System.out.println(head.data + "-->");
            arr.remove(0);
            if(!arr.isEmpty()){
                head = arr.get(0);
            }            
        }
        


    }

    //arr: 3 5
    //console: 7

//                5
//        2               8  
//    1       3       7       9
    
    public static void main(String[] args){
        Node head = new Node(5);        
        head.insert(2);         
        head.insert(8);         
        head.insert(1);         
        head.insert(3);         
        head.insert(7);  
        head.insert(9);  
         
        //head.inorder();
        head.byLevel(head);   
    }
}