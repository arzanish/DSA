package Circular_LL;

public class circular_LL {

  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(5);
    head.next.next = new Node(20);
    head.next.next.next = new Node(15);
    head.next.next.next.next = head;
    displayRecursive(head);
    System.out.println();

    head = delHead(head);
    displayRecursive(head);

  }

  // Display (Iterative) ---------------------------
  public static Node displayIterative(Node head) {
    if (head == null)
      return null;
    System.out.println(head.data);
    for (Node curr = head.next; curr != head; curr = curr.next) {
      System.out.println(curr.data);
    }
    return head;
  }

  // Display (Recursive) ---------------------------
  public static Node displayRecursive(Node head) {
    if (head == null)
      return null;
    else {
      Node curr = head;
      do {

        System.out.println(curr.data);
        curr = curr.next;
      } while (curr != head);
    }
    return head;
  }

  // Insert At Beginning ---------------------------
  public static Node insertBeg(Node head, int data) {
    Node temp = new Node(data);
    if (head == null) {
      temp.next = temp;
      return temp;
    } else {

      temp.next = head.next;
      head.next = temp;

      int tmp = head.data;
      head.data = temp.data;
      temp.data = tmp;
      return head;

    }
  }

  // Insert At Beginning ---------------------------
  public static Node insertEnd(Node head, int data) {
    Node temp = new Node(data);
    if (head == null) {
      temp.next = temp;
      return temp;
    } else {

      temp.next = head.next;
      head.next = temp;

      int tmp = head.data;
      head.data = temp.data;
      temp.data = tmp;
      return temp;

    }
  }

  // Delete Head ---------------------------
  public static Node delHead(Node head) {
    if (head == null)
      return null;
    if (head.next == head)
      return null;
    head.data = head.next.data;
    head.next = head.next.next;
    return head;
  }

  // Delete Kth Node ---------------------------
  public static Node delKthNode(Node head, int k) {
    if (head == null)
      return null;
    if (k == 1)
      return delHead(head);

    Node curr = head;
    for (int i = 0; i < k - 2; i++) {
      curr = curr.next;
    }
    curr.next = curr.next.next;
    return head;

  }
}

class Node {
  int data;
  Node next;

  Node(int x) {
    data = x;
    next = null;
  }
}
