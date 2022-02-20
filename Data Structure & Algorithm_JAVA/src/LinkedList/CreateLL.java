package LinkedList;

// Node class contains the LinkedList Node Structure. (int Data & a reference point)
class Node {
    int data;
    Node next;
}

// Linked class contains the necessary functions to make the operations
class Linked {
    // getNewNode() method to generate a new node
    private Node getNewNode(int key) {
        Node a = new Node();
        a.next = null;
        a.data = key;

        return a;
    }

    // insert method is used to insert the element in Linked List
    public Node insert(Node node, int key) {
        if (node == null)
            return getNewNode(key);

        node.next = insert(node.next, key);
        return node;
    }

    public void printList(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        printList(node.next);
    }
}

public class CreateLL {

    public static void main(String[] args) {
        Node root = null;

        Linked a = new Linked();
        root = a.insert(root, 12);
        root = a.insert(root, 24);
        root = a.insert(root, 36);
        root = a.insert(root, 48);
        root = a.insert(root, 60);

        a.printList(root);
        System.out.println();
    }
}