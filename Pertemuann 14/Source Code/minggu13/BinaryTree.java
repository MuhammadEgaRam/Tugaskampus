/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu13;

/**
 *
 * @author EgaRam
 */
public class BinaryTree {
    node root;
    
    public BinaryTree(){
        root = null;
    }
    boolean isEmpty(){
        return root == null;
    }
    void add(int data){
        if(isEmpty()){//tree is empty
           root = new node(data);
        }else{
            node current = root;
            while(true){
                if(data < current.data){
                    if(current.left != null){
                        current = current.left;
                    }else{
                        current.left = new node(data);
                        break;
                    }
                }else if(data > current.data){
                    if(current.right != null){
                        current = current.right;
                    }else{
                        current.right = new node(data);
                        break;
                    }
                }else{//data is already exist
                    break;
                }
            }
        }
    }
    boolean find(int data){
        boolean hasil = false;
        node current = root;
        while(current != null){
            if(current.data == data){
                hasil = true;
                break;
            }else if(data < current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
    }
    void traversePreOrder(node Node){
        if(Node != null){
            System.out.print(" " + Node.data);
            traversePreOrder(Node.left);
            traversePreOrder(Node.right);
        }
    }
    void traversePostOrder(node Node){
        if(Node != null){
            traversePostOrder(Node.left);
            traversePostOrder(Node.right);
            System.out.print(" " + Node.data);
        }
    }
    void traverseInOrder(node Node){
        if(Node != null){
            traverseInOrder(Node.left);
            System.out.print(" " + Node.data);
            traverseInOrder(Node.right);
        }
    }
    node getSuccessor(node del){
        node successor = del.right;
        node successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }
        //find node(current) yang ingin di hapus;
        node parent = root;
        node current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = false;
            }else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if(current == null){
            System.out.println("Tidak menemukan data!");
            return;
        }else{
            //jika tidak ada child, akan dihapus
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftChild){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left == null){//jika ada 1 child(right)
                if(current == root){
                    root = current.right;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){// jika ada 1 child(left)
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{//jika ada 2 childs
                node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    //Soal No 1
    void recursion(int key){
        root = recursion(root, key);
    }
    public node recursion(node current, int data){
        if(current == null){
            return new node(data);
        }if (data < current.data){
            current.left = recursion (current.left, data);
        }else if (data > current.data){
            current.right = recursion(current.right, data);
        }else{
            return current;
        }
        return current;
    }
    //Soal No 2
    void max(){
        node current = root;
        while(current.right != null){
            current = current.right;
        }
        System.out.println(current.data);
    }
    void min(){
        node current = root;
        while(current.left != null){
            current = current.left;
        }
        System.out.println(current.data);
    }
    //Soal No 3
    void printleft(node root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.print(" " + root.data);
            return;
        }
        if(root.left != null){
            printleft(root.left);
        }
        if(root.right != null){
            printleft(root.right);
        }
    }
    //Soal No 4
    int jumlahleft(){
        return jumlahleft(root);
    }
    int jumlahleft(node Node){
        if(Node == null){
            return 0;
        }
        if(Node.left == null && Node.right == null){
            return 1;
        }else{
            return jumlahleft(Node.left) + jumlahleft(Node.right);
        }
    }
}
