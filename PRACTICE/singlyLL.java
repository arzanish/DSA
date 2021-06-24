public class singlyLL {

  static int search(Node head, int x) {
    int pos = 1;
    if (head == null)
      return -1;
    Node curr = head;
    while (curr != null) {
      if (curr.data == x)
        return pos;
      curr = curr.next;
      pos++;
    }
    return -1;
  }

  static int searchR(Node head, int x) {
    if (head == null)
      return -1;
    if (head.data == x)
      return 1;
    else {
      return 1 + search(head.next, x);
    }
  }

  static Node delHead(Node head) {
    if (head == null)
      return null;
    else {
      return head.next;
    }
  }

  static Node delLast(Node head) {
    if (head == null)
      return null;
    else {
      Node curr = head;
      Node prev = null;
      while (curr.next != null) {
        prev = curr;
        curr = curr.next;
      }
      prev.next = null;
      return head;
    }
  }

  static void traversal(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.println(curr.data);
      curr = curr.next;
    }
  }

  static void recursiveTraversal(Node head) {
    if (head == null)
      return;
    System.out.println(head.data);
    recursiveTraversal(head.next);
  }

  static Node insertBeg(Node head, int x) {
    Node temp = new Node(x);
    if (head == null)
      return temp;
    else {
      temp.next = head;
      return temp;
    }
  }

  static Node insertEnd(Node head, int x) {
    Node temp = new Node(x);
    if (head == null)
      return temp;
    else {
      Node curr = head;
      while (curr.next != null) {
        curr = curr.next;
      }
      curr.next = temp;
      return head;
    }

  }

  static void middle(Node head) {
    if (head == null)
      return;
    if (head.next == null)
      System.out.println(head.data);
    Node first = head;
    Node second = head;
    while (first != null && first.next != null) {
      second = second.next;
      first = first.next.next;
    }
    System.out.println(second.data);
  }

  static void sortedIn(Node head, int x) {
    if (head == null)
      return;
    Node curr = head;
    Node prev = null;
    while (curr != null && curr.data < x) {
      prev = curr;
      curr = curr.next;
    }
    Node temp = new Node(x);
    prev.next = temp;
    temp.next = curr;
  }

  static Node reverse(Node head) {

    Node curr = head;
    Node prev = null;
    Node next = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;

    }
    return prev;
  }

  static Node removeduplicatesorted(Node head) {

    Node curr = head;
    while (curr != null && curr.next != null) {
      if (curr.data == curr.next.data) {
        curr.next = curr.next.next;
      } else {
        curr = curr.next;
      }

    }
    return head;
  }

  public static void main(String[] args) {
    // Node head = new Node(1);
    // head.next = new Node(2);
    // head.next.next = new Node(3);
    // head.next.next.next = new Node(4);
    // // Node head = null;
    // // head = insertBeg(head, 0);
    // // head = insertBeg(head, 1);
    // recursiveTraversal(head);
    // head = delHead(head);

    Node head = new Node(10);
    head.next = new Node(30);
    head.next.next = new Node(30);
    head.next.next.next = new Node(30);
    head.next.next.next.next = new Node(50);
    head.next.next.next.next.next = new Node(60);
    traversal(head);
    head = removeduplicatesorted(head);
    traversal(head);

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
