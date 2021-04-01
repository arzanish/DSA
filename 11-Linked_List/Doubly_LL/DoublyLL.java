package Doubly_LL;

public class DoublyLL {

  public static void main(String[] args) {

    Node head = new Node(10);
    Node temp1 = new Node(20);
    Node temp2 = new Node(30);
    head.next = temp1;
    temp1.prev = head;
    temp1.next = temp2;
    temp2.prev = temp1;
    display(head);

    head = delLast(head);
    System.out.println();
    display(head);

  }

  // Display ---------------------------
  public static void display(Node head) {
    if (head == null) {
      System.out.println("Empty !!!");
      return;
    }
    Node curr = head;
    System.out.println();
    while (curr != null) {
      System.out.println(curr.data);
      curr = curr.next;
    }
  }

  // Insert At The Beginning ---------------------------
  public static Node insertBegin(Node head, int data) {
    Node temp = new Node(data);
    if (head == null) {
      return temp;
    } else {
      temp.next = head;
      head.prev = temp;
      return temp;
    }
  }

  // Insert At The End ---------------------------
  public static Node insertEnd(Node head, int data) {
    Node temp = new Node(data);
    if (head == null) {
      return temp;
    } else {
      Node curr = head;
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = temp;
      temp.prev = curr;
      return head;
    }
  }

  // Reverse the LL ---------------------------
  public static Node reverse(Node head) {
    if (head == null || head.next == null)
      return head; // LL is empty or has a single node
    else {
      Node curr = head;
      Node temp = null;
      while (curr.next != null) {
        temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;

        curr = curr.prev;
      }
      return temp.prev;
    }
  }

  // Delete Head ---------------------------
  public static Node delHead(Node head) {
    if (head == null)
      return null;
    else if (head.next == null)
      return null;
    else {
      Node curr = head;
      curr = curr.next;
      curr.prev = null;
      return curr;
    }
  }

  // Delete Last -------------------------
  public static Node delLast(Node head) {
    if (head == null)
      return null;
    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr = curr.prev;
    curr.next = null;
    return head;
  }

}

class Node {
  int data;
  Node prev;
  Node next;

  Node(int x) {
    data = x;
    // code not required as by default they will be assigned null
    // next = null;
    // prev = null;
  }
}
