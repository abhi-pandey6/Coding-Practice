package I.LinkedList;

public class ReverseLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void insertatHead(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
                tail = temp;

            } else {
                temp.next = head;
                head = temp;
            }
        }
        void reverse() {
            if (head == null || head.next == null) {
                return;
            }
            Node previousNode = head;
            Node currentNode = head.next;
            while (currentNode != null) {
                Node nextNode = currentNode.next;
                currentNode.next = previousNode;

                previousNode = currentNode;
                currentNode = nextNode;

            }
            head.next = null;
            head = previousNode;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }

    }


    public static void main(String[] args) {
       linkedlist l1 = new linkedlist();
        l1.insertatHead(3);
        l1.insertatHead(2);
        l1.insertatHead(1);
        l1.display();
        l1.reverse();
        System.out.println();
        l1.display();

    }
    }

