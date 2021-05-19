public class BinaryTreeToDoublyLinkedList {

  static Node prev = null;

  static void printList(Node head) {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.key + " ");
      curr = curr.right;
    }
  }

  public static void main(String[] args) {
    Node root = new Node(10);
    root.left = new Node(5);
    root.right = new Node(20);
    root.right.left = new Node(30);
    root.right.right = new Node(35);

    Node head = BTToDLL(root);
    printList(head);
  }

  static Node BTToDLL(Node root) {
    if (root == null)
      return root;
    // Going Left
    Node head = BTToDLL(root.left);

    // Processing Root
    if (prev == null)
      head = root; // only first INORDER element will have prev = null
    else {
      root.left = prev;
      prev.right = root;
    }
    prev = root;

    // Going Right
    BTToDLL(root.right);
    return head;

  }
}
