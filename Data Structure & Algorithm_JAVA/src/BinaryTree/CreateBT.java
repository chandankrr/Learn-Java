package BinaryTree;

class Node{
    Node left;
    Node right;
    int data;
}

class BinaryTree{
    public Node createNewNote(int val){
        Node newNode = new Node();
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;

        return  newNode;
    }
}

public class CreateBT {

    public static void main(String[] args) {
        BinaryTree a = new BinaryTree();

        Node root = a.createNewNote(2);
        root.left = a.createNewNote(7);
        root.right = a.createNewNote(5);

        root.left.left = a.createNewNote(2);
        root.left.right = a.createNewNote(6);

        root.left.right.left = a.createNewNote(5);
        root.left.right.right = a.createNewNote(11);

        root.right.right = a.createNewNote(9);

        root.right.right.left = a.createNewNote(4);
    }
}

// output
//                                2
//                             /     \
//                            7       5
//                          /   \       \
//                         2     6       9
//                              /  \     /
//                             5   11   4
