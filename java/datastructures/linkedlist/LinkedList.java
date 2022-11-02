package collections.LinkedLists;


public class LinkedList {
  private Node head;

  public void insert(String value) {
    Node newNode = new Node();
    newNode.value = value;
    newNode.next = head;
    head = newNode;

  }

  public boolean includes(String value) {
    Node check = head;

    while (check != null) {
      if (check.value == value) {
        return true;
      }
      check = check.next;
    }

    return false;
  }

  public void append(String value) {

    Node newNode = new Node();
    newNode.value = value;
    Node temp = head;

    if (head == null) {
      head = newNode;
    }
    while (temp != null) {
      temp = temp.next;
    }
    temp.next = newNode;
  }

  public void insertBefore(String value) {
    Node curNode = head;
    Node preNode = curNode;

    if (curNode == null) {
      return;
    }

    while (curNode.value != value) {
      if (curNode.next == null) {
        return;
      }
      preNode = curNode;
      curNode = curNode.next;
    }
    Node newNode = new Node();
    newNode.value = value;

    preNode.next = newNode;
    newNode.next = curNode;
  }

  public void insertAfter(String value) {
    Node curNode = head;

    if (curNode == null) {
      return;
    }

    while (curNode.value != value) {
      if (curNode.next == null) {
        return;
      }
      curNode = curNode.next;
    }
    Node newNode = new Node();
    newNode.value = value;

    newNode.next = curNode;
    curNode.next = newNode;
  }

  public LinkedList reverseList(LinkedList input) {
    Node cur = input.head;
    Node pre = null;
    Node tmp;

    while (cur != null) {
      tmp = cur.next;
      cur.next = pre;
      pre = cur;
      cur = tmp;
    }
    input.head = pre;
    return input;
  }


  public String findKthLinkedList(int kth, LinkedList input) {
    int count = 0;
    LinkedList reverseInput = reverseList(input);
    Node cur = reverseInput.head;
    while (cur != null) {
      if (count == kth) {
        return cur.value;
      }
      count++;
      cur = cur.next;

    }
    return cur.value;
  }

  @Override
  public String toString() {

    String result = "";
    Node curr = head;
    while (curr != null) {
      result += "{ " + curr.value + " } -> ";
      curr = curr.next;
    }
    result += "null";
    return result;
  }
}

