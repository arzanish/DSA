package Singly_LL;

public class SinglyLL {

  // Insert At End ------------------------------
  public static Node insertEnd(Node head, int x) {
    Node temp = new Node(x);
    if (head == null) {
      return temp;
    }

    Node curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.next = temp;
    return head;
  }

  // Display ------------------------------
  public static void display(Node head) {
    if (head == null) {
      System.out.println("Empty !!!");
      return;
    }

    Node curr = head;
    while (curr != null) {
      System.out.println(curr.data);
      curr = curr.next;
    }
  }

  // Delete First Node ------------------------------
  public static Node deleteFirst(Node head) {
    if (head == null)
      return null;
    else {
      return head.next;
    }
  }

  // Delete Last Node ------------------------------
  public static Node deleteLast(Node head) {
    if (head == null)
      return null;
    else if (head.next == null)
      return null;
    else {
      Node curr = head;
      Node prev = curr;
      while (curr.next != null) {
        prev = curr;
        curr = curr.next;
      }
      prev.next = null;
      return head;

    }
  }

  // Insert At Given Position ------------------------------
  public static Node insertPos(Node head, int pos, int data) {
    if (pos < 1)
      return head;
    Node temp = new Node(data);
    if (pos == 1) {
      temp.next = head;
      return temp;
    }
    Node curr = head;
    for (int i = 1; i < pos - 1 && curr != null; i++) {
      curr = curr.next;
    }
    if (curr == null)
      return head;

    temp.next = curr.next;
    curr.next = temp;
    return head;
  }

  // Search ------------------------------
  public static int search(Node head, int key) {
    if (head == null)
      return -1;
    else {
      int res = 1;
      Node curr = head;
      while (curr != null && curr.data != key) {
        res++;
        curr = curr.next;
      }
      if (curr != null && curr.data == key)
        return res;
      return -1;
    }
  }

  // Sorted Insert In A LinkedList ------------------------------
  // insertion at first position is not working
  public static Node sortedInsert(Node head, int x) {
    Node temp = new Node(x);
    if (head == null)
      return temp;

    if (head.data > x) {
      temp.next = head;
      return temp;
    }
    Node curr = head;

    while (curr.next != null && curr.next.data < x) {
      curr = curr.next;
    }

    temp.next = curr.next;
    curr.next = temp;
    return head;

  }

  // Find The Middle Element ------------------------------
  public static void middle(Node head) {
    if (head == null)
      return;
    Node slow = head;
    Node fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    System.out.println(slow.data);
  }

  // Find Nth Node From End ------------------------------
  public static void nthEndNode(Node head, int n) {
    if (head == null)
      return;
    Node first = head;
    for (int i = 0; i < n; i++) {
      if (first == null)
        return;
      first = first.next;
    }
    Node second = head;
    while (first != null) {
      first = first.next;
      second = second.next;
    }
    System.out.println(second.data);

  }

  // Reverse A Linked List ------------------------------
  public static Node reverse(Node head) {

    Node curr = head;
    Node prev = null;
    while (curr != null) {
      Node next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }

  // Remove Dupplicates From Sorted LinkedList ------------------------------
  public static void removeDuplicates(Node head) {
    Node curr = head;
    while (curr != null && curr.next != null) {
      if (curr.data == curr.next.data) {
        curr.next = curr.next.next;
      } else
        curr = curr.next;
    }
  }

  // Reverse LL Recursively ------------------------------
  public static Node reverseRecursive(Node curr, Node prev) {
    if (curr == null)
      return prev;
    Node next = curr.next;
    curr.next = prev;
    return reverseRecursive(next, curr);
  }

  // Reverse LL In Groups ------------------------------
  public static void reverseGroups(Node head, int k) {
    Node curr = head;
    Node prev = null;
    prev = curr;
    curr = curr.next;
    while (curr.next != null && curr != null) {
      int counter = 1;
      while (counter < k && curr != null) {
        int temp = curr.data;
        curr.data = prev.data;
        prev.data = temp;
        counter++;
        prev = curr;
        curr = curr.next;

      }
      if (curr.next == null)
        return;
      prev = curr;
      curr = curr.next;

    }
  }

  // Find Loop ------------------------------
  public static boolean findLoop(Node head) {
    // Floyd’s Cycle-Finding Algorithm

    Node first = head, second = head;
    while (first != null && first.next != null && second != null) {
      first = first.next.next;
      second = second.next;
      if (first == second)
        return true;
    }
    return false;
  }

  // Remove Loop ------------------------------
  public static void removeLoop(Node head) {
    Node first = head, second = head;
    // finding if loop exists or not
    while (first != null && first.next != null) {
      first = first.next.next;
      second = second.next;
      if (first == second)
        break;
    }
    if (first != second)
      return; // returns if loop doesnot exists
    // Removing the loop below
    second = head;
    while (first.next != second.next) {
      first = first.next;
      second = second.next;
    }
    first.next = null; // removing the loop here
  }

  // Delete A Node With Only Pointer Given To It ------------------------------
  public static void delNodeGivenPointer(Node ptr) {
    // In this question you will never be given to delete the last node
    if (ptr == null)
      return;
    Node next = ptr.next;
    ptr.data = next.data;
    ptr.next = next.next;
  }

  // Segregate Even Odd ------------------------------
  public static Node segEvenOdd(Node head) {
    Node eS = null, eE = null, oS = null, oE = null;
    for (Node curr = head; curr != null; curr = curr.next) {
      int x = curr.data;
      if (x % 2 == 0) {
        if (eS == null) {
          eS = curr;
          eE = eS;
        } else {
          eE.next = curr;
          eE = eE.next;
        }
      } else {
        if (oS == null) {
          oS = curr;
          oE = oS;
        } else {
          oE.next = curr;
          oE = oE.next;
        }
      }
    }
    if (oS == null || eS == null)
      return head;
    eE.next = oS;
    oE.next = null;
    return eS;
  }

  // Pair Wise Swap Nodes------------------------------
  public static void swapPairWiseNodes(Node head) {
    if (head == null || head.next == null)
      return;
    Node first = head.next;
    Node second = head;
    while (first.next != null || first != null) {
      int temp = first.data;
      first.data = second.data;
      second.data = temp;
      first = first.next.next;
      second = second.next.next;
    }
  }

  public static void main(String[] args) {
    // Node head = new Node(101);

    // head = insertEnd(head, 102);
    // head = insertEnd(head, 103);
    // head = insertEnd(head, 104);
    // head = insertEnd(head, 105);
    // head = insertEnd(head, 106);

    // // display(head);
    // System.out.println();
    // head = reverseRecursive(head, null);
    // display(head);

    Node head = new Node(17);
    head.next = new Node(15);
    head.next.next = new Node(8);
    head.next.next.next = new Node(12);
    head.next.next.next.next = new Node(10);
    head.next.next.next.next.next = new Node(5);
    head.next.next.next.next.next.next = new Node(4);
    display(head);
    System.out.println();
    head = segEvenOdd(head);
    display(head);
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