import jdk.nashorn.internal.ir.TemplateLiteral;

public class CircularLL {

  static NodeCSLL insertBeg(NodeCSLL head, int x) {
    if (head == null) {
      NodeCSLL temp = null;
      temp.data = x;
      temp.next = temp;
      return temp;
    } else {
      NodeCSLL temp = null;
      temp.data = x;
      temp.next = head.next;
      head.next = temp;

      int tmp = head.data;
      head.data = temp.data;
      temp.data = tmp;

    }
  }

  static void traverse(NodeCSLL head) {
    if (head == null)
      return;
    NodeCSLL curr = head;
    if (curr.next == head) {
      System.out.println(curr.data);
    }
    while (curr.next != head) {
      System.out.println(curr.data);
      curr = curr.next;
    }

  }

  public static void main(String[] args) {

  }
}

class NodeCSLL // NodeCircularSinglyLinedList
{
  NodeCSLL next;
  int data;

  NodeCSLL(int x) {
    data = x;
  }
}
