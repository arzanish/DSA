import java.util.PriorityQueue;

public class Huffman {
  static void printRec(NodeH root, String str) {
    if (root == null)
      return;
    if (root.ch != '$') {
      System.out.println(root.ch + " " + str);
    }
    printRec(root.left, str + '0');
    printRec(root.right, str + '1');
  }

  static void printHCodes(char[] arr, int[] freq) {
    PriorityQueue<NodeH> h = new PriorityQueue<>((n1, n2) -> n1.freq - n2.freq);
    for (int i = 0; i < arr.length; i++) {
      h.add(new NodeH(arr[i], freq[i], null, null));
    }

    while (h.size() > 1) {
      NodeH l = h.poll();
      NodeH r = h.poll();
      h.add(new NodeH('$', l.freq + r.freq, l, r));
    }
    printRec(h.peek(), "");
  }

  public static void main(String[] args) {
    char[] chArr = { 'a', 'd', 'b', 'e', 'f' };
    int[] freqArr = { 10, 50, 20, 40, 80 };
    printHCodes(chArr, freqArr);
  }
}

class NodeH {
  char ch;
  int freq;
  NodeH left;
  NodeH right;

  NodeH(char ch, int freq, NodeH left, NodeH right) {
    this.ch = ch;
    this.freq = freq;
    this.left = left;
    this.right = right;
  }
}