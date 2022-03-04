package LinkedList.Search;

class Node{
    int data;
    Node next;
}

class Linked{
    private Node getNewNode(int key){
        Node a = new Node();
        a.next = null;
        a.data = key;

        return a;
    }

    Node insert(Node node, int key){
        if (node == null)
            return getNewNode(key);

        node.next = insert(node.next, key);
        return node;
    }

    boolean ifNodeExists(Node node, int val){
        if (node == null)
            return false;

        while (node != null){
            if (node.data == val)
                return true;

            node = node.next;
        }

        return false;
    }

    public void printList(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        printList(node.next);
    }
}

public class SearchNodeLL {

    public static void main(String[] args) {
        Node root = null;

        Linked a = new Linked();

        root = a.insert(root, 10);
        root = a.insert(root, 20);
        root = a.insert(root, 30);
        root = a.insert(root, 40);
        root = a.insert(root, 50);

        a.printList(root);
        System.out.println();

        System.out.println(a.ifNodeExists(root, 30));
    }
}
