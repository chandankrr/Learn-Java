package LinkedList.Deletion.DeleteElementAtGivenPosition;

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

    Node deleteElementAtGivenPosition(Node node, int position) {
        if (position < 0) {
            System.out.println("Not a valid position");
            return node;
        }

        if (node == null && position > 0) {
            System.out.println("Position not valid");
            return node;
        }

        if (position == 1)
            return node.next;

        node.next = deleteElementAtGivenPosition(node.next, position - 1);
        return node;

    }

    void printList(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        printList(node.next);
    }
}

public class DeleteElementAtGivenPosition {

    public static void main(String[] args) {
        Node root = null;

        Linked a = new Linked();
        root = a.insert(root, 10);
        root = a.insert(root, 20);
        root = a.insert(root, 30);
        root = a.insert(root, 40);

        a.printList(root);
        System.out.println();

        root = a.deleteElementAtGivenPosition(root, 2);

        a.printList(root);
    }
}
