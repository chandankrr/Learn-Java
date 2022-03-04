package LinkedList.Size;

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

    Node insert(Node node, int key) {
        if (node == null)
            return getNewNode(key);

        node.next = insert(node.next, key);
        return node;
    }

    int getSizeLL(Node node) {
        if (node == null)
            return 0;

        return 1 + getSizeLL(node.next);
    }

    void printList(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        printList(node.next);
    }

}

public class GetSizeLL {

    public static void main(String[] args) {
        Node root = null;

        Linked a = new Linked();
        root = a.insert(root, 2);
        root = a.insert(root, 3);
        root = a.insert(root, 5);
        root = a.insert(root, 7);
        root = a.insert(root, 11);

        a.printList(root);
        System.out.println();

        System.out.println(a.getSizeLL(root));
    }
}
