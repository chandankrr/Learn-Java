package LinkedList.Insertion.InsertAtGivenPosition;

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

    public Node insert(Node node, int key){
        if (node == null)
            return getNewNode(key);

        node.next = insert(node.next, key);
        return node;
    }

    public Node insertAtPosition(Node node, int position, int key){
        if(position < 0)
            System.out.println("Position can't be less than 1");

        if(node == null && position > 1) {
            System.out.println("Position is greater than element exists");
            return node;
        }

        if (node == null && position == 1)
            return getNewNode(key);

        if(position == 1){
            Node newNode = getNewNode(key);
            newNode.next = node;
            return newNode;
        }

        node.next = insertAtPosition(node.next, position - 1, key);
        return node;
    }

    public void printList(Node node){
        if (node == null)
            return;

        System.out.print(node.data + " ");
        printList(node.next);
    }
}

public class InsertElementAtGivenPosition {

    public static void main(String[] args) {
        Node root = null;

        Linked a = new Linked();
        root = a.insert(root, 10);
        root = a.insert(root, 20);
        root = a.insert(root, 30);
        root = a.insert(root, 40);
        root = a.insert(root, 50);

        root = a.insertAtPosition(root, 2, 100);

        a.printList(root);
    }
}
