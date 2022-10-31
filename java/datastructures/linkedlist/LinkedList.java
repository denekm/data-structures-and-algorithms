package collections;


public class LinkedList {
    private Node head;

    public void insert(Node value) {
        if (head == null) {
            head = value;
        } else {
            head.next = head;
            head = value;
        }

    }

    public boolean includes(Node value) {
        Node check = new Node();
        check = head;
        while (check != value) {
            check = check.next;
        }
        if (check == value) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {

        String result = "{ ";
        Node curr = head;
        while (curr != null) {
            result += curr.value;
            result += " -> ";
            curr = curr.next;
        }
        result += " }";
        return result;
    }
}
