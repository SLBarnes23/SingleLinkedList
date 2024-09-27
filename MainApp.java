package Assignment3;

public class MainApp {
    public static void main(String[] args) {
        LinkedList sda = new LinkedList();
        // Insert node values at specific locations

        sda.insertInLinkedList(1, 0);
        sda.insertInLinkedList(2, 1);
        sda.insertInLinkedList(3, 2);
        sda.insertInLinkedList(4, 3);
        sda.insertInLinkedList(5, 4);
        sda.insertInLinkedList(6, 5);

        sda.traverseLinkedList();  // Before deletion

        // Test Deleting Nodes
        sda.deleteNode(0);  // Delete first node
        sda.traverseLinkedList();  // After deleting node at position 0

        sda.deleteNode(2);  // Delete node in the middle
        sda.traverseLinkedList();  // After deleting node at position 2

        sda.deleteNode(sda.size - 1);  // Delete last node
        sda.traverseLinkedList();  // After deleting the last node
    }
}
