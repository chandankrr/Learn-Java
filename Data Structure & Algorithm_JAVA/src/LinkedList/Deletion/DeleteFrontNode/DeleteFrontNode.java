package LinkedList.Deletion.DeleteFrontNode;

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

    Node deleteFront(Node node){
        if(node == null)
            return null;

        return node.next;
    }

    void printList(Node node){
        if(node == null)
            return;

        System.out.print(node.data + " ");
        printList(node.next);
    }
}

public class DeleteFrontNode {

    public static void main(String[] args) {
        Node root = null;

        Linked a = new Linked();

        root = a.insert(root, 1);
        root = a.insert(root, 2);
        root = a.insert(root, 3);
        root = a.insert(root, 4);
        root = a.insert(root, 5);

        a.printList(root);
        System.out.println();

        root = a.deleteFront(root);

        a.printList(root);
    }
}
