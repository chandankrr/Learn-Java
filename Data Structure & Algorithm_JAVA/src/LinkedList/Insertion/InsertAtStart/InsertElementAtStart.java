package LinkedList.Insertion.InsertAtStart;

class Node {
    int data;
    Node next;
}

class Linked {
    private Node getNewNode(int key) {
        Node a = new Node();
        a.next = null;
        a.data = key;
        return a;
    }

    public Node insert(Node node, int key) {
        if (node == null)
            return getNewNode(key);

        node.next = insert(node.next, key);
        return node;
    }

    public Node insertAtStart(Node node, int key){
        if (node == null)
            return getNewNode(key);

        Node newNode = getNewNode(key);
        newNode.data = key;
        newNode.next = node;
        return newNode;
    }

    void printList(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        printList(node.next);
    }


}

public class InsertElementAtStart {

    public static void main(String[] args) {
        Node root = null;

        Linked a = new Linked();
        root = a.insert(root, 1);
        root = a.insert(root, 2);
        root = a.insert(root, 3);
        root = a.insert(root, 4);
        root = a.insert(root, 5);

        root = a.insertAtStart(root, 10);

        a.printList(root);
        System.out.println();
    }
}
