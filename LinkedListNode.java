public class LinkedListNode {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private LinkedListNode head;

    public void reverse() {
        LinkedListNode previous = null;
        LinkedListNode current = head;
        LinkedListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    
    public void push(int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        newNode.next = head;
        head = newNode;
    }

    
    public void printList() {
        LinkedListNode current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.println("Original list:");
        list.printList();

        list.reverse();

        System.out.println("Reversed list:");
        list.printList();
    }
}

