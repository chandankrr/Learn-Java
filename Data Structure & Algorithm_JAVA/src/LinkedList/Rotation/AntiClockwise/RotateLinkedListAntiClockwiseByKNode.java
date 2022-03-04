package LinkedList.Rotation.AntiClockwise;

class Node {
    int data;
    Node next;
}

class Linked {
    public Node rotateAntiClockwise(Node node, int k) {
        if (node == null || k < 0)
            return node;

        int sizeOfLinkedList = getSizeLL(node);
        k = k % sizeOfLinkedList;

        if (k == 0)
            return node;

        Node tmp = node;
        int i = 1;

        while (i < k) {
            tmp = tmp.next;
            i++;
        }

        Node temp = tmp.next;
        Node head = temp;
        tmp.next = null;

        while (temp.next != null)
            temp = temp.next;

        temp.next = node;
        return head;
    }

    private Node getNewNode(int key) {
        Node a = new Node();
        a.data = key;
        a.next = null;

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

public class RotateLinkedListAntiClockwiseByKNode {


    public static void main(String[] args) {

        Node root = null;

        Linked a = new Linked();

        root = a.insert(root, 12);
        root = a.insert(root, 99);
        root = a.insert(root, 37);
        root = a.insert(root, 8);
        root = a.insert(root, 18);

        a.printList(root);
        System.out.println();

        root = a.rotateAntiClockwise(root, 2);

        a.printList(root);
        System.out.println();
    }
}
