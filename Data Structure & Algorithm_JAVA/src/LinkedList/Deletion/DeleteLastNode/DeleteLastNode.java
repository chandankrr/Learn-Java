package LinkedList.Deletion.DeleteLastNode;

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

    Node delete(Node node) {
        if (node == null || node.next == null)
            return null;

        Node temp = node;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return node;
    }

    void printList(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        printList(node.next);
    }
}

public class DeleteLastNode {

    public static void main(String[] args) {
        Node root = null;

        Linked a = new Linked();

        root = a.delete(root);

        root = a.insert(root, 10);
        root = a.insert(root, 20);
        root = a.insert(root, 30);

        a.printList(root);
        System.out.println();

        root = a.delete(root);

        a.printList(root);

    }
}
