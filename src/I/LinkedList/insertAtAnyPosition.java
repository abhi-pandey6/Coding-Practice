package I.LinkedList;

public class insertAtAnyPosition {


        // Node class
        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        // LinkedList class
        public static class LinkedList {
            Node head = null;

            // Insert at beginning
            void insertAtHead(int value) {
                Node newNode = new Node(value);
                newNode.next = head;
                head = newNode;
            }

            // Insert at any position
            void insertAtPosition(int value, int pos) {
                Node newNode = new Node(value);

                // case 1: if inserting at head
                if (pos == 1) {
                    newNode.next = head;
                    head = newNode;
                    return;
                }

                Node temp = head;
                int count = 1;

                // move temp to (pos-1)th node
                while (temp != null && count < pos - 1) {
                    temp = temp.next;
                    count++;
                }

                // if position is invalid
                if (temp == null) {
                    System.out.println("Invalid position!");
                    return;
                }

                // insert node
                newNode.next = temp.next;
                temp.next = newNode;
            }
            void DeleteNode(int pos){
                Node temp = head ;
                for (int i = 1; i < pos-1; i++) {
                    temp = temp . next;

                }
                temp.next = temp.next.next;



            }

            // Display linked list
            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            LinkedList l1 = new LinkedList();

            // Insert at head
            l1.insertAtHead(10);
            l1.insertAtHead(20);
            l1.insertAtHead(30);
            l1.display();  // Output: 30 20 10

            // Insert 25 at position 2
            l1.insertAtPosition(25, 2);
            l1.display();  // Output: 30 25 20 10

            // Insert 5 at position 5 (end)
            l1.insertAtPosition(5, 5);
            l1.display();  // Output: 30 25 20 10 5

            // Try invalid position
            l1.insertAtPosition(100, 10);// Invalid
            l1.DeleteNode(4);
            l1.display();
        }
    }


