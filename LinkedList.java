package Assignment3;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Method to insert a node at a specific location
    public void insertInLinkedList(int value, int location) {
        Node newNode = new Node();
        newNode.value = value;

        // If list is empty, create new list
        if (head == null) {
            head = newNode;
            tail = newNode;
            size = 1;
        } else if (location == 0) {
            // Insert at the beginning
            newNode.next = head;
            head = newNode;
        } else if (location >= size) {
            // Insert at the end
            tail.next = newNode;
            tail = newNode;
        } else {
            // Insert in the middle
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            newNode.next = tempNode.next;
            tempNode.next = newNode;
        }
        size++;
    }

    // Method to delete a node at a specific location
    public void deleteNode(int location) {
        // 0. If the linked list does not exist
        if (head == null) {
            System.out.println("The link does not exist.");
            return; 
        }

        // 1. If Deleting at the beginning
        if (location == 0) {
            head = head.next; // Move head to the next node
            size--; // Decrease the size of the list

            // If the list becomes empty, update the tail to null
            if (size == 0) {
                tail = null;  // Update tail if list is empty
            }
            System.out.println("Node at position 0 has been deleted.");
            return;
        }

        // 2. If deleting at the end
        else if (location >= size - 1) {
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next; // Traverse to the second last node
            }

            if (tempNode != null) {
                tempNode.next = null;
                tail = tempNode;  // Update the tail
                size--;
            }
            System.out.println("Node at the end has been deleted.");
            return;
        }

        // 3. If deleting a node from the middle
        else {
            Node tempNode = head;
            // Traverse to the node just before the one we want to delete
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next; // Loop to reach the previous node
            }
            // Adjust the next pointer to skip the node to be deleted
            tempNode.next = tempNode.next.next;  // Skipping the node to delete
            size--;  // Reducing the size of the list

            System.out.println("Node at position " + location + " has been deleted.");
        }
    }

    // Method to traverse and print the list
    public void traverseLinkedList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }
}
