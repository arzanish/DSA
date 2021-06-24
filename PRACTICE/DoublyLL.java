public class DoublyLL {

  public static NodeDLL reverse(NodeDLL head) {
    if (head == null || head.next == null)
      return head; // LL is empty or has a single node
    else {
      NodeDLL curr = head;
      NodeDLL temp = null;
      while (curr.next != null) {
        temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;

        curr = curr.prev;
      }
      return temp.prev;
    }

  static NodeDLL delLast(NodeDLL head) {
    if (head == null || head.next == null)
      return null;
    NodeDLL curr = head;
    while (curr.next != null) {
      curr = curr.next;
    }
    curr.prev.next = null;
    return head;
  }

  static NodeDLL delbeg(NodeDLL head) {
    if (head == null || head.next == null)
      return null;
    head = head.next;
    head.prev = null;
    return head;

  }

  static void printlist(NodeDLL head) {
    NodeDLL curr = head;
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
    System.out.println();
  }

  static NodeDLL insertBeg(NodeDLL head, int x) {
    NodeDLL temp = new NodeDLL(x);
    temp.next = head;
    if (head != null) {
      head.prev = temp;
    }
    return temp;
  }

  public static void main(String[] args) {
    NodeDLL head = new NodeDLL(10);
    NodeDLL temp1 = new NodeDLL(20);
    NodeDLL temp2 = new NodeDLL(30);
    head.next = temp1;
    temp1.prev = head;
    temp1.next = temp2;
    temp2.prev = temp1;
    head = insertBeg(head, 5);
    printlist(head);

    head = reverse(head);
    printlist(head);
  }
}

class NodeDLL {
  int data;
  NodeDLL prev;
  NodeDLL next;

  NodeDLL(int d) {
    data = d;
  }
}
